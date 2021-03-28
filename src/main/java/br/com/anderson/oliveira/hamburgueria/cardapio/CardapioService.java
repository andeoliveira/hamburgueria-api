package br.com.anderson.oliveira.hamburgueria.cardapio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.anderson.oliveira.hamburgueria.cardapio.itens.Cardapio;
import br.com.anderson.oliveira.hamburgueria.ingrediente.IngredienteService;
import br.com.anderson.oliveira.hamburgueria.lanche.itens.LancheValorPromocao;
import br.com.anderson.oliveira.hamburgueria.lanche.modelos.Lanche;
import br.com.anderson.oliveira.hamburgueria.lanche.repositorio.LancheRepositorioImpl;
import br.com.anderson.oliveira.hamburgueria.utils.DataUtils;

@ApplicationScoped
public class CardapioService {
	
	@Inject
	LancheRepositorioImpl lancheRepo;
	
	@Inject
	IngredienteService ingredienteService;
	
	/**
	 * Método responsável por carregar todos os lanches e seus valores.
	 * @autor: Anderson Oliveira
	 * @return cardapio
	 */
	
	public Cardapio listarLanches() {
		
		List<Lanche> lanches = this.lancheRepo.buscarTodosLanches();
		List<LancheValorPromocao> todosLanchesPromocoes = new ArrayList<LancheValorPromocao>();
		
		Cardapio cardapio = Cardapio.builder()
				.dataHoraProcessamento(DataUtils.dateTimeParaDataStringPT_BR(LocalDateTime.now()))
				.build();
		
		if (lanches != null && lanches.size() > 0) {
			for(Lanche lanche : lanches) {
				
				LancheValorPromocao lancheValor = LancheValorPromocao.builder()
										.lanche(lanche)
										.valor(this.ingredienteService.somarValorIngredientesDoLanche(lanche.getIngredientes()))
										.promocoes(null)
										.build();
				todosLanchesPromocoes.add(lancheValor);
				
			}
		}
		
		cardapio.setLanches(todosLanchesPromocoes);
		
		return cardapio;
	}
	
	
}	
