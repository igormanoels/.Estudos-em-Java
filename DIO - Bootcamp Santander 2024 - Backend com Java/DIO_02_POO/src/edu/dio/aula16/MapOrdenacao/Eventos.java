package edu.dio.aula16.MapOrdenacao;

public class Eventos 
{
	private String nome;
	// como eventos geralmente possuem várias atrações, atracao poderia ser uma collection
	private String atracao;
	
	// Construtor
	public Eventos(String nome, String atracao) 
	{
		this.nome = nome;
		this.atracao = atracao;
	}
	
	
	// Envio e recebimento
	public String getAtracao() {
		return atracao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setAtracao(String atracao) {
		this.atracao = atracao;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// Retorna texto
	public String toString() {
		return "Evento:" + nome + " - Atração: " + atracao + "\n"; 
	}
}
