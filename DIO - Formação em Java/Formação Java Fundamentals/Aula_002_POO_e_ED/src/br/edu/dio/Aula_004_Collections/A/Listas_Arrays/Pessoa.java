package br.edu.dio.Aula_004_Collections.A.Listas_Arrays;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public Pessoa() {}
	
	public Pessoa(String...s) {
		this.nome = s[0];
		this.idade = Integer.parseInt(s[1]);
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
