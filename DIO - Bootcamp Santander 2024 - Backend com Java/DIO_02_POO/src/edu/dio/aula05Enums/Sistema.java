package edu.dio.aula05Enums;

public class Sistema 
{
	public static void main(String[] args) 
	{
		for (Estados e: Estados.values()) 
		{
			System.out.println(e.getNome() + " - " + e.getSigla());
		}
		
		Estados sp = Estados.saoPaulo;
		
		System.out.println("\n\n" + sp.getNome());
	}
}
