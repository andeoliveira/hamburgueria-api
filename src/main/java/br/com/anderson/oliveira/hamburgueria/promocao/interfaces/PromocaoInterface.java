package br.com.anderson.oliveira.hamburgueria.promocao.interfaces;

import java.math.BigDecimal;
import java.util.List;

import br.com.anderson.oliveira.hamburgueria.ingrediente.modelos.Ingrediente;
import br.com.anderson.oliveira.hamburgueria.promocao.itens.ValorPromocao;

public interface PromocaoInterface {
	public BigDecimal calcularValorPromocional(List<Ingrediente> ingredientes);
	public boolean verificarSeAptoNaPromocao(List<Ingrediente> ingredientes);
	public ValorPromocao gerarValorPromocao(List<Ingrediente> ingredientes);
}
