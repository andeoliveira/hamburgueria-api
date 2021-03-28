package br.com.anderson.oliveira.hamburgueria.promocao.itens;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.anderson.oliveira.hamburgueria.ingrediente.IngredienteService;
import br.com.anderson.oliveira.hamburgueria.ingrediente.modelos.Ingrediente;
import br.com.anderson.oliveira.hamburgueria.promocao.enuns.Promocao;
import br.com.anderson.oliveira.hamburgueria.promocao.interfaces.PromocaoInterface;

@ApplicationScoped
public class PromocaoMuitoQueijo implements PromocaoInterface{
	
	@Inject
	IngredienteService ingredienteService;
	
	/**
	 * Método que verifica o valor do desconto da Promoção Muito queijo.
	 * Regra da promo: A cada 3 porções de carne o cliente só paga 2. Se o lanche tiver 6 porções, ocliente pagará 4. Assim por diante...
	 * @author Anderson Oliveira
	 * @param ingredientes
	 * @return valorPromocional
	 */
	
	
	@Override
	public BigDecimal calcularValorPromocional(List<Ingrediente> ingredientes) {
		
		List<Ingrediente> ingredientesQueijo = ingredientes.stream()
				.filter(i -> i.getNome().equals("Queijo"))
				.collect(Collectors.toList());

		Integer itensDesconto = ingredientesQueijo.size() / 3;
		
		BigDecimal valorIngrediente = this.ingredienteService.buscarValorIngrediente("Queijo");
		BigDecimal valorDesconto = valorIngrediente.multiply(new BigDecimal(itensDesconto));
		BigDecimal valorSemDesconto = ingredienteService.somarValorIngredientesDoLanche(ingredientesQueijo);
		BigDecimal totalValorPromocional = valorSemDesconto.subtract(valorDesconto);
		
		return totalValorPromocional;
	}
	
	/**
	 * Método que verifica se o lanche possuí o item e quantidade necessária para estar apto a promoção.
	 * @author Anderson Oliveira
	 * @param ingredientes
	 * @return boolean
	 */
	
	@Override
	public boolean verificarSeAptoNaPromocao(List<Ingrediente> ingredientes) {
		if (ingredientes.stream().filter(i -> i.getNome().equals("Queijo")).count() > 2) {
			return true;
		}
		return false;
	}

	@Override
	public ValorPromocao gerarValorPromocao(List<Ingrediente> ingredientes) {
		ValorPromocao valorPromocao = ValorPromocao.builder().build();
		
		if (this.verificarSeAptoNaPromocao(ingredientes)) {
			valorPromocao.setValorPromocional(this.calcularValorPromocional(ingredientes));
			valorPromocao.setPromocao(Promocao.MUITO_QUEIJO);
		}
		
		return valorPromocao;
	}

	

}
