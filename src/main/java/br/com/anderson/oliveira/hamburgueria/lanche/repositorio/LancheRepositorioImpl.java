package br.com.anderson.oliveira.hamburgueria.lanche.repositorio;

import java.util.List; 

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.anderson.oliveira.hamburgueria.lanche.modelos.Lanche;

@RequestScoped
public class LancheRepositorioImpl implements LancheRepositorio {
	
	private EntityManager em;
	
	public LancheRepositorioImpl(EntityManager em) {
		this.em = em;
	}
	
	@Override
	public Lanche buscarLanchePorId(Long id) {
		return em.find(Lanche.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Lanche> buscarTodosLanches() {
		Query query = em.createQuery("SELECT b FROM Lanche b");
		return (List<Lanche>) query.getResultList();
	}

}
