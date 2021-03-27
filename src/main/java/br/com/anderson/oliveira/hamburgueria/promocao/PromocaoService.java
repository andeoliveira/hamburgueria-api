package br.com.anderson.oliveira.hamburgueria.promocao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.anderson.oliveira.hamburgueria.ingrediente.modelos.Ingrediente;
import br.com.anderson.oliveira.hamburgueria.promocao.enuns.Promocao;
import br.com.anderson.oliveira.hamburgueria.promocao.itens.PromocaoLight;
import br.com.anderson.oliveira.hamburgueria.promocao.itens.PromocaoMuitaCarne;
import br.com.anderson.oliveira.hamburgueria.promocao.itens.PromocaoMuitoQueijo;
import br.com.anderson.oliveira.hamburgueria.promocao.itens.ValorPromocao;

@ApplicationScoped
public class PromocaoService {
	
	
	@Inject 
	PromocaoLight promoLight;
	
	@Inject 
	PromocaoMuitaCarne promoMuitaCarne;
	
	@Inject 
	PromocaoMuitoQueijo promocaoMuitoQueijo;
	
	public List<Promocao> listarTodas() {
		List<Promocao> todasPromocoes = Arrays.asList(Promocao.values());
		return todasPromocoes;
	}
	
	public List<ValorPromocao> calcularValorPromocional(List<Ingrediente> ingredientes) {
		List<ValorPromocao> promocoes = new ArrayList<ValorPromocao>();
		
		promocoes.add(promoLight.gerarValorPromocao(ingredientes));
		promocoes.add(promoMuitaCarne.gerarValorPromocao(ingredientes));
		promocoes.add(promocaoMuitoQueijo.gerarValorPromocao(ingredientes));
		
		return promocoes;
	}
	
}
