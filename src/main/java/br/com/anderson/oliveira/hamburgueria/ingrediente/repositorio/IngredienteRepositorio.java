package br.com.anderson.oliveira.hamburgueria.ingrediente.repositorio;

import java.util.List;

import br.com.anderson.oliveira.hamburgueria.ingrediente.modelos.Ingrediente;

public interface IngredienteRepositorio {
	
	Ingrediente buscarIngredientePorId(Long id);
	
	List<Ingrediente> buscarTodosIngredientes();

	
	
}
