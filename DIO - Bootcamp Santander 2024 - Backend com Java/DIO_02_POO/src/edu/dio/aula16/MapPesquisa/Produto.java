package edu.dio.aula16.MapPesquisa;

public class Produto 
{

	private String nome;
	private double preco;
	private int quantidade;
	
	
	// construtor da classe
	public Produto(String nome, double preco, int quantidade) 
	{
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	// to String 
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade +"]";
	}	
	
}
