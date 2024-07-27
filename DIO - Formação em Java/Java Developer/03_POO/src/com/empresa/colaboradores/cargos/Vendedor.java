package com.empresa.colaboradores.cargos;

import com.empresa.Endereco;
import com.empresa.colaboradores.PessoaFisica;

public class Vendedor extends PessoaFisica
{
	private Double bonificacao;
	private int quantidadeVendas;
	private double remuneracao;

	
	// CONSTRUTORES
	public Vendedor(String nome, String documento, String categoria, Endereco endereco, double remuneracao) 
	{
		super(nome, documento, categoria, endereco);
		this.remuneracao = remuneracao;
	}

	
	// GETTERS AND SETTERS
	public Double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(Double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public int getQuantidadeVendas() {
		return quantidadeVendas;
	}

	public void setQuantidadeVendas(int quantidadeVendas) {
		this.quantidadeVendas = quantidadeVendas;
	}
	
	public double getRemuneracao() {
		return remuneracao;
	}

	public void setRemuneracao(double remuneracao) {
		this.remuneracao = remuneracao;
	}


	// TOSTRING
	@Override
	public String toString() 
	{
		return super.toString() + "\nRemuneracao: " + remuneracao + "\n" + "Bonificação: " + bonificacao  + "\n\n";
	}
	
	
}
