package br.com.anderson.oliveira.hamburgueria.ingrediente.modelos;

import java.math.BigDecimal; 
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.anderson.oliveira.hamburgueria.lanche.modelos.Lanche;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 

@Entity
@Table(name = "ingrediente")
@Getter @Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ingrediente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nome", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "valor", nullable = false)
    private BigDecimal valor;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "ingredientes", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@Builder.Default
	private Set<Lanche> lanches = new HashSet<>();
	
	@Override
    public String toString() {
        return "Ingrediente{" +
                	"nome='" + nome + '\'' +
                	", valor=" + valor +
                '}';
    }
    
}
