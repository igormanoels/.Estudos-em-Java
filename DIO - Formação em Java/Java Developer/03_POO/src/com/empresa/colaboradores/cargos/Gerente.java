package com.empresa.colaboradores.cargos;

import com.empresa.Endereco;
import com.empresa.colaboradores.PessoaJuridica;

public class Gerente extends PessoaJuridica
{
	private Double bonificacao;
	private int quantVendas;
	private double remuneracao;
	
	
	// CONSTRUTOR
	public Gerente(String nome, String documento, String categoria, Endereco endereco, Double remuneracao) 
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

	public int getQuantVendas() {
		return quantVendas;
	}

	public void setQuantVendas(int quantVendas) {
		this.quantVendas = quantVendas;
	}

	public Double getRemuneracao() {
		return remuneracao;
	}

	public void setRemuneracao(double remuneracao) {
		this.remuneracao = remuneracao;
	}
		
	
	// TOSTRING
		@Override
		public String toString() 
		{
			return super.toString() + "\nRemuneracao: " + remuneracao + "\n"
					+ "Bonificação: " + bonificacao  + "\n\n";
		}
	
		
}
