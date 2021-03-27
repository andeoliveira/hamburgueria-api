package br.com.anderson.oliveira.hamburgueria.promocao.itens;

import java.math.BigDecimal;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import br.com.anderson.oliveira.hamburgueria.ingrediente.modelos.Ingrediente;
import br.com.anderson.oliveira.hamburgueria.promocao.enuns.Promocao;
import br.com.anderson.oliveira.hamburgueria.promocao.interfaces.PromocaoInterface;

@ApplicationScoped
public class PromocaoMuitaCarne implements PromocaoInterface {

	@Override
	public BigDecimal calcularValorPromocional(List<Ingrediente> ingredientes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean verificarSeAptoNaPromocao(List<Ingrediente> ingredientes) {
		if (ingredientes.stream().filter(i -> i.getNome().equals("Hambúrguer de carne")).count() > 2) {
			return true;
		}
		return false;
	}

	@Override
	public ValorPromocao gerarValorPromocao(List<Ingrediente> ingredientes) {
		ValorPromocao valorPromocao = ValorPromocao.builder().build();
		
		if (this.verificarSeAptoNaPromocao(ingredientes)) {
			valorPromocao.setValorPromocional(this.calcularValorPromocional(ingredientes));
			valorPromocao.setPromocao(Promocao.MUITA_CARNE);
		}
		
		return valorPromocao;
	}


}
