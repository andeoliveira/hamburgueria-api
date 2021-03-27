package br.com.anderson.oliveira.hamburgueria.promocao.enuns;

public enum Promocao {
	
	LIGHT("Promoção light: 10% de desconto"),
	MUITA_CARNE("Promoção Muita carne: Cada 3 porções de carne, o cliente paga apenas 2."),
	MUITO_QUEIJO("Promoção Muito queijo: Cada 3 porções de queijo, o cliente paga apenas 2.");
	
	private String descricao;
	
	Promocao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDesString() {
		return descricao;
	}

	
}
