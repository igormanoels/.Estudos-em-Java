package edu.dio.desafio07.POO.dominio;

public abstract class Conteudo 
{
	protected final double xpPadrao = 10;
	
	private String titulo;
	private String descricao;

	public abstract double calcularXP();

	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
