package br.edu.dio.Aula_004_Collections.A.Set;

public class Pessoa implements Comparable<Pessoa> {
	
	private int id;
	private String nome;
	private int idade;
	
	public Pessoa() {}
	
	public Pessoa(String...s) {
		this.idade = Integer.parseInt(s[0]);
		this.nome = s[1];
		this.idade = Integer.parseInt(s[2]);
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
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome; 
	}

	
    @Override
    public int compareTo(Pessoa outra) {
        return this.nome.compareTo(outra.nome); // Ordenação pelo nome
    }
}
