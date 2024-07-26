package com.empresa.colaboradores;

import com.empresa.Endereco;

public class Vendedor extends PessoaFisica
{
	private Double bonificacao;
	private int quantidadeVendas;

	// CONSTRUTORES
	public Vendedor(String nome, String documento, String categoria, Double remuneração, Endereco endereco, int quantidadeVendas) 
	{
		super(nome, documento, categoria, remuneração, endereco);
		this.quantidadeVendas = quantidadeVendas;
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
	
	// TOSTRING
	@Override
	public String toString() {
		return super.toString() + "\nNúmero de Vendas: " + quantidadeVendas + "\nBonificação: " + bonificacao;
	}
	
	
	

}
