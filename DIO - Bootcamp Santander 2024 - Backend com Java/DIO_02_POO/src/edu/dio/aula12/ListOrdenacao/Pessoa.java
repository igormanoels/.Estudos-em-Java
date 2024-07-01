package edu.dio.aula12.ListOrdenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>
{
	private String nome;
	private int idade;
	private double altura;
	
	// Método construtor
	public Pessoa(String nome, int idade, double altura) 
	{
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	/* Método implementado da classe COMPARABLE
	 * retorna a comparação da idade com o valor da idade envida pelo método OrdenaçãoPessoa
	 */
	public int compareTo(Pessoa o) {
		return Integer.compare(idade, o.getIdade());
	}
	
	
	public String getNome() 
	{
		return nome;
	}
	
	public int getIdade() 
	{
		return idade;
	}
	
	public double getAltura() 
	{
		return altura;
	}
	
	@Override
	public String toString() 
	{
		return "Nome: " + nome + " - Idade: " + idade + " - Altura: " + altura + "\n";
	}
	
}

class ComparatorPorAltura implements Comparator<Pessoa>
{
	@Override
	public int compare(Pessoa o1, Pessoa o2) 
	{
		// TODO Auto-generated method stub
		return Double.compare(o1.getAltura(), o2.getAltura());
	}
	
}

