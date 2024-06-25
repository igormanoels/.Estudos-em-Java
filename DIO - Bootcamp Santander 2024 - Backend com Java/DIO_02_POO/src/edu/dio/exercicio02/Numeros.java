package edu.dio.exercicio02;

public class Numeros implements Comparable<Numeros>
{
	private int numero;
	
	// Construtor da classe
	public Numeros(int num) 
	{
		this.numero = num;
	}
	
	
	// Método de comparação implementado
	public int compareTo(Numeros o) {
		return Integer.compare(numero, o.getNumero());
	}
	

	// Getters e Setters
	public int getNumero() 
	{
		return numero;
	}
	
	public void setNumero(int num) 
	{
		this.numero = num;
	}	
	
	public String toString() 
	{
		return String.valueOf(numero);
	}

}
