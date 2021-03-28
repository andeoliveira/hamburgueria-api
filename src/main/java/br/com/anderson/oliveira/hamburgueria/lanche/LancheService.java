package br.com.anderson.oliveira.hamburgueria.lanche;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.anderson.oliveira.hamburgueria.ingrediente.IngredienteService;
import br.com.anderson.oliveira.hamburgueria.ingrediente.modelos.Ingrediente;
import br.com.anderson.oliveira.hamburgueria.lanche.itens.LancheValorPromocao;
import br.com.anderson.oliveira.hamburgueria.lanche.modelos.Lanche;
import br.com.anderson.oliveira.hamburgueria.lanche.repositorio.LancheRepositorioImpl;
import br.com.anderson.oliveira.hamburgueria.promocao.PromocaoService;

@ApplicationScoped
public class LancheService {
	
	@Inject
	LancheRepositorioImpl lancheRepo;
	
	@Inject
	IngredienteService ingredienteService;
	
	@Inject
	PromocaoService promocaoService;
	
	/**
	 * Método retorna todos os lanches.
	 * @author Anderson Oliveira
	 * @return todosLanches
	 */
	
	public List<Lanche> listarTodos() {
		List<Lanche> todosLanches = new ArrayList<Lanche>();
		todosLanches = lancheRepo.buscarTodosLanches();
		return todosLanches;
	}
	
	/**
	 * Método retorna o lanche correspondente ao id.
	 * @author Anderson Oliveira
	 * @param id
	 * @return lanche
	 */
	
	public Lanche listarPorId(Long id) {
		Lanche lanche = new Lanche();
		lanche = lancheRepo.buscarLanchePorId(id);
		return lanche;
	}
	
	/**
	 * Método retorna as promoções e valor ativo para o lanche a partir de seus ingredientes.
	 * @author Anderson Oliveira
	 * @param id
	 * @return lancheValorPromocao
	 */
	
	public LancheValorPromocao calcularValorLanche(Long lancheid, List<Ingrediente> ingredientes) {
		
		Lanche lanche = this.listarPorId(lancheid);
		
		if (lanche!= null) {
			LancheValorPromocao lancheValorPromocao = LancheValorPromocao.builder()
					.lanche(lanche)
					.valor(this.ingredienteService.somarValorIngredientesDoLanche(ingredientes))
					.promocoes(promocaoService.calcularValorPromocional(ingredientes))
					.build();
			
			return lancheValorPromocao;
		}
		
		return null;
		
	}
	
	
}
