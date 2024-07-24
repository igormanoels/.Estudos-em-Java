package edu.dio.aula04Construtor;

public class Pessoa 
{
	private String nome;
	private String cpf;
	private String endereco;
	
	public String getNome() 
	{
		return nome;
	}
	
	public String getCpf() 
	{
		return cpf;
	}
	
	public String getEndereco() 
	{
		return endereco;
	}
	
	// Similar ao conceito de setters, porém atuando junto ao objeto criado via parametro
	public Pessoa(String nome, String cpf, String endereco) 
	{
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}

}
