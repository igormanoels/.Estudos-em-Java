package edu.dio.exercicio03;

public class Numeros implements Comparable<Numeros>
{
	private int numero;
	
	public Numeros(int num) 
	{
		this.numero = num;
	}
	
	@Override
	public int compareTo(Numeros o) 
	{	
		return Integer.compare(numero, o.getNumero());
	}
	
	// Getter e Setter
	public int getNumero() 
	{
		return numero;
	}
	
	public void setNumero(int num) 
	{
		this.numero = num;
	}
	
	// To String
	@Override
	public String toString() 
	{
		return String.valueOf(numero);
	}
}
