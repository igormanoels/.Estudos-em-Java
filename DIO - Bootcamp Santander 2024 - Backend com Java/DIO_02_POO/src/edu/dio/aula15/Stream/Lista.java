package edu.dio.aula15.Stream;

public class Lista 
{
	private String item;
	private double preco;
	private int quant;
	
	public Lista(String item, double preco, int quant) 
	{
		this.item = item;
		this.preco = preco;
		this.quant = quant;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public int getQuant() {
		return quant;
	}
	
	public String getItem() {
		return item;
	}

}
