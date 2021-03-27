package br.com.anderson.oliveira.hamburgueria.cardapio;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.anderson.oliveira.hamburgueria.cardapio.itens.Cardapio;

@Path("cardapio")
public class CardapioResource {
	
	@Inject
	CardapioService cardapioService;
	
	@GET
	@Path("/lanches")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarTodos() {
		try {
			Cardapio cardapio = cardapioService.listarLanches();
			return Response.ok(cardapio).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Response.Status.BAD_REQUEST).entity("Houve um erro na pesquisa. \nLog: "+e.getMessage()).build();
		}
	}
}
