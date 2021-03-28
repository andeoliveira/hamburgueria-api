package br.com.anderson.oliveira.hamburgueria.ingrediente;

import java.math.BigDecimal; 
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.anderson.oliveira.hamburgueria.ingrediente.modelos.Ingrediente;
import br.com.anderson.oliveira.hamburgueria.ingrediente.repositorio.IngredienteRepositorioImpl;

@ApplicationScoped
public class IngredienteService {
	
	@Inject
	IngredienteRepositorioImpl ingredienteRepo;
	
	/**
	 * Método retorna todos os ingredientes.
	 * @author Anderson Oliveira
	 * @return todosIngredientes
	 */
	
	public List<Ingrediente> listarTodos() {
		
		List<Ingrediente> todosIngredientes = new ArrayList<Ingrediente>();
		todosIngredientes = ingredienteRepo.buscarTodosIngredientes();
		return todosIngredientes;
		
	}
	
	/**
	 * Método retorna o ingrediente correspondente ao id do paramêtro.
	 * @author Anderson Oliveira
	 * @param id
	 * @return ingrediente
	 */
	
	public Ingrediente listarPorId(Long id) {
		
		Ingrediente ingrediente = new Ingrediente();
		ingrediente = ingredienteRepo.buscarIngredientePorId(id);
		return ingrediente;
		
	}
	
	/**
	 * Método responsável pela soma dos valores de todos os ingredientes do lanche.
	 * @autor: Anderson Oliveira
	 * @param integredientes
	 * @return valorTotal
	 */
	
	public BigDecimal somarValorIngredientesDoLanche(List<Ingrediente> integredientes) {
		
		BigDecimal valorTotal =  integredientes.stream()
								.map(x -> x.getValor())
								.reduce(BigDecimal.ZERO, BigDecimal::add);
			
		
		return valorTotal;
	}
	
	public BigDecimal buscarValorIngrediente(String nome) {
		
		Ingrediente ingrediente = this.ingredienteRepo.buscarIngredientePorNome(nome);
		return ingrediente.getValor();
		
	}
}
