package com.empresa.colaboradores.cargos;

import com.empresa.Endereco;
import com.empresa.colaboradores.PessoaFisica;

public class OperadorDeCaixa extends PessoaFisica 
{
	protected Double remuneracao;
	
	
	// CONSTRUTOR
	public OperadorDeCaixa(String nome, String documento, String categoria, Endereco endereco, double remuneracao) 
	{
		super(nome, documento, categoria, endereco);
		this.remuneracao = remuneracao;
	}
	
	
	// GETTERS AND SETTERS
	public Double getRemuneracao() {
		return remuneracao;
	}

	public void setRemuneracao(Double remuneracao) {
		this.remuneracao = remuneracao;
	}

	
	// TOSTRING
	@Override
	public String toString() 
	{
		return super.toString() + "\nRemuneracao: " + remuneracao + "\n\n";
	}
	
	
}
