package com.empresa.colaboradores;

import com.empresa.Endereco;

public class PessoaJuridica
{
	protected String nome;
	protected String documento;
	protected String categoria;
	private Endereco endereco;
	
	
	// CONSTRUTORES
	public PessoaJuridica(String nome, String documento, String categoria, Endereco endereco) 
	{
		this.nome = nome;
		this.documento = documento;
		this.categoria = categoria;
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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
	// TO STRING
	@Override
	public String toString() 
	{
		return "Pessoa Jurídica\n "
				+ "Nome:" + nome + ", Documento:" + documento + ", Categoria:" + categoria
				+ endereco.toString() + "\n";
	}
	
	
}
