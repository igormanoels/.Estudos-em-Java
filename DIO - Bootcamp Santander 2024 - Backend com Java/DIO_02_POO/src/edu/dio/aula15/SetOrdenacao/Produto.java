package edu.dio.aula15.SetOrdenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>
{
	private String nome;
	private int cod;
	private double preco;
	private int quant;
	
	public Produto(String nm, int cd, double pr, int qt) 
	{
		this.nome = nm;
		this.cod = cd;
		this.preco = pr;
		this.quant = qt;
	}
	
	
	// Compara as entradas pelo código do produto, mantendo o código como "chave primária"	
	public int hashCode() 
	{
		return Objects.hash(getCod());
	}

	public boolean equals(Object obj) 
	{
		if (this == obj)return true;
		if (!(obj instanceof Produto nome))return false;
		return getCod() == nome.getCod();
	}


	// Saída de dados por string
	public String toString() 
	{
		return "Produto [nome=" + nome + ", cod=" + cod + ", preco=" + preco + ", quant=" + quant + "]\n";
	}

	
	// Método de comparação
	public int compareTo(Produto obj) 
	{
		return nome.compareToIgnoreCase(obj.getNome());
	}	

	
	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}
}

class ComparatorPorPreco implements Comparator<Produto>
{
	@Override
	public int compare(Produto o1, Produto o2) {
		return Double.compare(o1.getPreco(), o2.getPreco());
	}
}