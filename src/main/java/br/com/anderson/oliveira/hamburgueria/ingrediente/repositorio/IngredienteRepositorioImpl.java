package br.com.anderson.oliveira.hamburgueria.ingrediente.repositorio;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.anderson.oliveira.hamburgueria.ingrediente.modelos.Ingrediente;

@RequestScoped
public class IngredienteRepositorioImpl implements IngredienteRepositorio {
	
	private EntityManager em;
	
	public IngredienteRepositorioImpl(EntityManager em) {
		this.em = em;
	}
	
	@Override
	public Ingrediente buscarIngredientePorId(Long id) {
		return em.find(Ingrediente.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ingrediente> buscarTodosIngredientes() {
		Query query = em.createQuery("SELECT b FROM Ingrediente b");
		return (List<Ingrediente>) query.getResultList();
	}
	
	
	public Ingrediente buscarIngredientePorNome(String nome) {
		return em.find(Ingrediente.class, nome);
	}

}
