package br.com.anderson.oliveira.hamburgueria.lanche;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.anderson.oliveira.hamburgueria.ingrediente.IngredienteService;
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
	
	public LancheValorPromocao calularValorLanche(Long lancheid) {
		
		Lanche lanche = this.listarPorId(lancheid);
		
		if (lanche!= null) {
			LancheValorPromocao lancheValorPromocao = LancheValorPromocao.builder()
					.lanche(lanche)
					.valor(this.ingredienteService.somarValorIngredientesDoLanche(lanche.getIngredientes()))
					.promocoes(promocaoService.calcularValorPromocional(lanche.getIngredientes()))
					.build();
			
			return lancheValorPromocao;
		}
		
		return null;
		
	}
	
	
}
