package br.com.anderson.oliveira.hamburgueria.lanche;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import br.com.anderson.oliveira.hamburgueria.ingrediente.IngredienteService;
import br.com.anderson.oliveira.hamburgueria.ingrediente.modelos.Ingrediente;
import br.com.anderson.oliveira.hamburgueria.lanche.itens.LancheValorPromocao;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class LancheTest {
	
	@Inject
	IngredienteService ingredienteService;
	
	@Inject 
	LancheService lancheService;
	
	@Test
	public void precoLancheCenario1test() {
		List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

		Ingrediente bacon = ingredienteService.listarPorId(2L);
		Ingrediente haburguerCarne = ingredienteService.listarPorId(3L);
		Ingrediente queijo = ingredienteService.listarPorId(4L);
		
		ingredientes.add(bacon);
		ingredientes.add(haburguerCarne);
		ingredientes.add(queijo);
		
		LancheValorPromocao lanche = lancheService.calcularValorLanche(1L, ingredientes);
		BigDecimal valorTotalIngredientes = bacon.getValor().add(new BigDecimal(0));
		
		assertEquals(lanche.getValor(), valorTotalIngredientes);

	}
	
	/*@Test
	public void precoLancheCenario2test() {
		
	}
	
	@Test
	public void precoLancheCenario3test() {
		
	}*/

}
