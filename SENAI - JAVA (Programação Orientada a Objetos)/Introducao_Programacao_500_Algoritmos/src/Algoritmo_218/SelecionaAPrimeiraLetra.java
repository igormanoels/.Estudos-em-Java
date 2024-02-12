package Algoritmo_218;

import java.util.Scanner;

public class SelecionaAPrimeiraLetra {

	public static void main(String[] args) {
		String[] nomes = new String[12];
		String[] letras = new String[12];
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê 15 nome e imprime a primeira letra de cada um.");
		
		for (int i = 0; i < letras.length; i++) 
		{
			System.out.print("Favor informar o " + (i+1) + "º nome: ");
			nomes[i] = ler.nextLine();
			letras[i] = String.valueOf(nomes[i].charAt(0)).toUpperCase();
		}
		
		System.out.println("\nNomes:\t\t\tLetras:");
		
		for (int i = 0; i < letras.length; i++) 
		{
			System.out.println(nomes[i] + "\t\t\t" + letras[i] );
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		ler.close();
	}

}
