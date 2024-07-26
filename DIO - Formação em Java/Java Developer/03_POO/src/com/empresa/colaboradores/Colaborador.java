package com.empresa.colaboradores;

import com.empresa.Endereco;

public abstract class Colaborador 
{
	protected String nome;
	protected String documento;
	protected String categoria;
	protected Double remuneracao;
	private Endereco endereco;
	
	
	// CONSTRUTOR
	public Colaborador(String nome, String documento, String categoria, Double remuneração, Endereco endereco) 
	{
		this.nome = nome;
		this.documento = documento;
		this.categoria = categoria;
		this.remuneracao = remuneração;
		this.endereco = endereco;
	}

	
	// GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Double getRemuneracao() {
		return remuneracao;
	}

	public void setRemuneracao(Double remuneracao) {
		this.remuneracao = remuneracao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
