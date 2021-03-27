package br.com.anderson.oliveira.hamburgueria.promocao.itens;

import java.math.BigDecimal;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import br.com.anderson.oliveira.hamburgueria.ingrediente.modelos.Ingrediente;
import br.com.anderson.oliveira.hamburgueria.promocao.interfaces.PromocaoInterface;

@ApplicationScoped
public class PromocaoMuitoQueijo implements PromocaoInterface{

	@Override
	public BigDecimal calcularValorPromocional(List<Ingrediente> ingredientes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean verificarSeAptoNaPromocao(List<Ingrediente> ingredientes) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ValorPromocao gerarValorPromocao(List<Ingrediente> ingredientes) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
