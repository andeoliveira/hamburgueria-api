package br.com.anderson.oliveira.hamburgueria.lanche;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.anderson.oliveira.hamburgueria.ingrediente.modelos.Ingrediente;
import br.com.anderson.oliveira.hamburgueria.lanche.itens.LancheValorPromocao;
import br.com.anderson.oliveira.hamburgueria.lanche.modelos.Lanche;

@Path("lanche")
public class LancheResource {
	
	@Inject
	LancheService lancheService;
	
	@GET
	@Path("/todos")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarTodos() {
		try {
			List<Lanche> todos = lancheService.listarTodos();
			return Response.ok(todos).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Response.Status.BAD_REQUEST).entity("Houve um erro na pesquisa. \nLog: "+e.getMessage()).build();
		}
	}
	
	@GET
	@Path("/id/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarPorId(@PathParam("id") Long id) {
		try {
			Lanche lanche = lancheService.listarPorId(id);
			return Response.ok(lanche).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Response.Status.BAD_REQUEST).entity("Houve um erro na pesquisa. \nLog: "+e.getMessage()).build();
		}
		
	}
	
	@POST
	@Path("/calcular/id/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response calcularValorPromocaoLanche(@PathParam("id") Long id, List<Ingrediente> ingredientes) {
		try {
			LancheValorPromocao lancheValorPromocao = lancheService.calcularValorLanche(id, ingredientes);
			return Response.ok(lancheValorPromocao).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Response.Status.BAD_REQUEST).entity("Houve um erro na pesquisa. \nLog: "+e.getMessage()).build();
		}
		
	}
	
	
}
