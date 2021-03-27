package br.com.anderson.oliveira.hamburgueria.pedido;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("pedido")
public class PedidoResource {
	
	@Inject
	PedidoService pedidoService;
	
	@GET
	@Path("/calcular")
	@Produces(MediaType.APPLICATION_JSON)
	public Response calcularPedido() {
		try {
			return Response.ok(pedidoService.calcularPedido()).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Status.BAD_GATEWAY).entity("Erro ao processar valor do pedido \n"+e.getMessage()).build();
		}
	}
}
