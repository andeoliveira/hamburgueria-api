package br.com.anderson.oliveira.hamburgueria.promocao.itens;

import java.math.BigDecimal;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.anderson.oliveira.hamburgueria.ingrediente.IngredienteService;
import br.com.anderson.oliveira.hamburgueria.ingrediente.modelos.Ingrediente;
import br.com.anderson.oliveira.hamburgueria.promocao.enuns.Promocao;
import br.com.anderson.oliveira.hamburgueria.promocao.interfaces.PromocaoInterface;

@ApplicationScoped
public class PromocaoLight implements PromocaoInterface {
	
	@Inject
	IngredienteService ingredienteService;
	
	/**
	 * Método que calcula o valor do desconto (10%) na promocação:
	 * Se o lanche tem alface e não tem bacon
	 * @author Anderson Oliveira
	 */
	
	@Override
	public BigDecimal calcularValorPromocional(List<Ingrediente> ingredientes) {
		BigDecimal valorSemDesconto = ingredienteService.somarValorIngredientesDoLanche(ingredientes);
		return valorSemDesconto.multiply(new BigDecimal(10/100.0));
	}
	
	/**
	 * Método verifica se os ingredientes do lanche estão aptos a promoção conforme a regra:
	 * Se o lanche tem alface e não tem bacon
	 * @author Anderson Oliveira
	 */
	
	@Override
	public boolean verificarSeAptoNaPromocao(List<Ingrediente> ingredientes) {
		
		boolean contemAlface = ingredientes.stream().anyMatch(i -> i.getNome().equals("Alface"));
		boolean contemBacon = ingredientes.stream().anyMatch(i -> i.getNome().equals("Bacon"));
		
		if (contemAlface && !contemBacon) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Método que gera o objeto que contem o valor e a promoção light:
	 * @author Anderson Oliveira
	 */
	
	@Override
	public ValorPromocao gerarValorPromocao(List<Ingrediente> ingredientes) {
		
		ValorPromocao valorPromocao = ValorPromocao.builder().build();
		
		if (this.verificarSeAptoNaPromocao(ingredientes)) {
			valorPromocao.setValorPromocional(this.calcularValorPromocional(ingredientes));
			valorPromocao.setPromocao(Promocao.LIGHT);
		}
		
		return valorPromocao;
	}
	

	

}
