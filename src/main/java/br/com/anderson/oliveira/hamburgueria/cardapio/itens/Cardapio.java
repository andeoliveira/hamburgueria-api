package br.com.anderson.oliveira.hamburgueria.cardapio.itens;

import java.util.List;

import br.com.anderson.oliveira.hamburgueria.lanche.itens.LancheValorPromocao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cardapio {
	private List<LancheValorPromocao> lanches;
	private String dataHoraProcessamento;
}
