package br.com.anderson.oliveira.hamburgueria.promocao.itens;

import java.math.BigDecimal;

import br.com.anderson.oliveira.hamburgueria.promocao.enuns.Promocao;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Builder
public class ValorPromocao {
	
	private Promocao promocao;
	public BigDecimal valorPromocional;
	
}
