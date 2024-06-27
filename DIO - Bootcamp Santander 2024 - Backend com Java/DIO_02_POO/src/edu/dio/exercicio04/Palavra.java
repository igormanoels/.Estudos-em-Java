package edu.dio.exercicio04;

import java.util.Objects;

public class Palavra //implements Comparable<Palavra>
{
	private String palavra;
	
	// Contrutor da classe
	public Palavra(String p) 
	{
		this.palavra = p;
	}	
	
//	
//	// Método de Comparação
//	public int compareTo(Palavra o) 
//	{
//		return palavra.compareToIgnoreCase(o.getPalavra());
//	}
//	
	
	// Método para impedir que as palavras se repitam
	public int hashCode()
	{
		return Objects.hash(getPalavra());
	}
	
	public boolean equals(Object o)
	{
		if (this == o)return true;
		if (!(o instanceof Palavra palavra))return false;
		return Objects.equals(getPalavra(), palavra.getPalavra());
	}
	
	
	// método para capturar a palavra
	public String getPalavra() 
	{
		return palavra;
	}
	
	// Retorno de palavra como string
	public String toString() 
	{
		return palavra;
	}


}
