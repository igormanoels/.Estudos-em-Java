package exercicios.exercicio_10;

public class Dependente {
	private String nome;
	private String cpf;
	private int idade;
	
	public Dependente() {}
	
	public Dependente(String...vet) {
		this.nome = vet[0];
		this.cpf = vet[1];
		this.idade = Integer.parseInt(vet[2]);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(String idade) {
		this.idade = Integer.parseInt(idade);
	}
	
	public String toString() {
		return "Dependente: " + nome + ", cpf: " + cpf + ", idade: " + idade;
	}
}
