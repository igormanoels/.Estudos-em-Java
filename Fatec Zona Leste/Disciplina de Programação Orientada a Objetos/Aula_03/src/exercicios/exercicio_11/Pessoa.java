package exercicios.exercicio_11;

public class Pessoa {
	private String nome;
	private String cpf;
	
	public Pessoa() {}
	
	public Pessoa(String...vet) {
		this.nome = vet[0];
		this.cpf = vet[1];
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void embarcar() {
		System.out.println("Embarcou!");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome + ", cpf: " + cpf;
	}
}
