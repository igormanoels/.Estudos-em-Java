package Aula_15_Heranca;

public class TrabalhandoComHeranca {
/*
 * objetos da classe mãe
 */
	public class Pessoa {
		private String nome;
		private String endereco;
		private String telefone;
		private String nacionalidade;
		private String naturalidade;
		private String email;	
		
		public String getEndereco() {
			return endereco;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getNacionalidade() {
			return nacionalidade;
		}
		public void setNacionalidade(String nacionalidade) {
			this.nacionalidade = nacionalidade;
		}
		public String getNaturalidade() {
			return naturalidade;
		}
		public void setNaturalidade(String naturalidade) {
			this.naturalidade = naturalidade;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
				
	}
}
