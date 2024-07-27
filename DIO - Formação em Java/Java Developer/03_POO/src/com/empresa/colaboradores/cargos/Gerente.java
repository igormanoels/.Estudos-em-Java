package com.empresa.colaboradores;

import com.empresa.Endereco;

public class Gerente extends PessoaJuridica
{
	private Double bonificacao;
	private int quantVendas;
	
	public Gerente(String nome, String documento, String categoria, Double remuneração, Endereco endereco, int quantVendas) 
	{
		super(nome, documento, categoria, remuneração, endereco);
		this.quantVendas = quantVendas;
	}

}
