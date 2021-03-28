package br.com.anderson.oliveira.hamburgueria.lanche.modelos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import br.com.anderson.oliveira.hamburgueria.ingrediente.modelos.Ingrediente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="lanche")
@Builder
@Getter @Setter 
@AllArgsConstructor
@NoArgsConstructor
public class Lanche {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nome", length = 100, nullable = false)
	private String nome;
	
	@Column(name = "urlimagem", length = 2000, nullable = false)
	private String urlimagem;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "lancheingrediente", joinColumns = {@JoinColumn(name="lancheid")}, inverseJoinColumns = {@JoinColumn(name="ingredienteid")})
	@Builder.Default
	private List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
	
	

	
}
