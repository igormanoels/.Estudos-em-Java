package br.edu.dio.Aula_001_ClasseEencapsulamento;

public class Main {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Igor");
		pessoa.setIdade(21);

		System.out.println(pessoa.getNome());


		var pessoa2 = new Pessoa("Elisa", 21);
		System.out.println(pessoa2.getNome());
	}

}


class Pessoa {

	private String nome;
	private int idade;

	// construtor vazio
	public Pessoa() {}
	
	// Sobrecarga de método
	public Pessoa(String nm) {
		this.nome  = nm;
	}
	
	// Sobrecarga de método
	public Pessoa(String nm, int id) {
		this.nome  = nm;
		this.idade = id;
	}	
	
	
	// Métodos de acesso
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
