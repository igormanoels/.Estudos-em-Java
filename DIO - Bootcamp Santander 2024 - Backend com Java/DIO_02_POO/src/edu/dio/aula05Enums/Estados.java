package edu.dio.aula05Enums;

/*
 * 	Os Enums são conjuntos de objetos já predefinidos em um sistema de acordo com sua regra de negócio.
 * 	Com o intuito de faciliar e reutilizar os códigos durante o uso da aplicação.
 */
public enum Estados {
	
	// Variaveis predeterminadas do enum
	saoPaulo ("SP", "São Paulo"),
	rioJaneiro ("RJ", "Rio de Janeiro"),
	minas ("MG", "Minas Gerais"),
	bahia ("BA", "Bahia");
	
	private String sigla;
	private String nome;
	
	private Estados(String sigla, String nome) 
	{
		this.nome = nome;
		this.sigla = sigla;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSigla() {
		return sigla;
	}
}
