package br.com.anderson.oliveira.hamburgueria.lanche.repositorio;

import java.util.List;

import br.com.anderson.oliveira.hamburgueria.lanche.modelos.Lanche;

public interface LancheRepositorio {
	
	Lanche buscarLanchePorId(Long id);
	
	List<Lanche> buscarTodosLanches();
}
