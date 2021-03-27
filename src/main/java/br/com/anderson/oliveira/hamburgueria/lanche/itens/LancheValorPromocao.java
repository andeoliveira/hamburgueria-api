package br.com.anderson.oliveira.hamburgueria.lanche.itens;

import java.math.BigDecimal;
import java.util.List;

import br.com.anderson.oliveira.hamburgueria.lanche.modelos.Lanche;
import br.com.anderson.oliveira.hamburgueria.promocao.itens.ValorPromocao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LancheValorPromocao {
	
	private Lanche lanche;
	private BigDecimal valor;
	private List<ValorPromocao> promocoes;
	
}
