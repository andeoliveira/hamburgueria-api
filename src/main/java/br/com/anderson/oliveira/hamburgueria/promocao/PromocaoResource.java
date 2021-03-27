package br.com.anderson.oliveira.hamburgueria.promocao;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.anderson.oliveira.hamburgueria.promocao.enuns.Promocao;

public class PromocaoResource {
	
	@Inject
	PromocaoService promocaoService;
	
	@GET
	@Path("/todos")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarTodas() {
		
		try {
			List<Promocao> todos = promocaoService.listarTodas();
			return Response.ok(todos).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Response.Status.BAD_REQUEST).entity("Houve um erro na pesquisa.").build();
		}
		
	}
	
	
}
