package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Marca {
	
	@Id		// para o jpa, essa notação refere-se a PK
			// Para valor de auto-incremento usar AUTO quando não houver tabela, e Identity quando o DB já estiver pronto
	@GeneratedValue(strategy = GenerationType.IDENTITY)		
	private Long id; 
	private String descricao;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
