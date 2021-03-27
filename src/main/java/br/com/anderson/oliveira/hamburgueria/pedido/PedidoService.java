package br.com.anderson.oliveira.hamburgueria.pedido;

import java.math.BigDecimal;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PedidoService {
	
	public BigDecimal calcularPedido() {
		return new BigDecimal(0.04);
	}
}
