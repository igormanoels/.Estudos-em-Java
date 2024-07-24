package edu.dio.exercicio09;

public class Livro implements Comparable<Livro>
{

	private String titulo;
	private String autor;
	private double preco;
	
	// Construtor da classe
	public Livro(String titulo, String autor, double preco) 
	{
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}
	

	// Método de comparação
	public int compareTo(Livro o) 
	{
		return Double.compare(preco, o.getPreco());
	}

	
	// Getters e Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	
	// Saída de Texto
	public String toString() 
	{
		return "\nLivro: " + titulo + ", Autor: " + autor 
				+ ", preço: R$ " + preco;
	}	
	
}
