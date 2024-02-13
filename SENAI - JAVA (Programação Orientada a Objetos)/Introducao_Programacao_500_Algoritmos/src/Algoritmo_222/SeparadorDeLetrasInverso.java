package Algoritmo_222;

import java.util.Scanner;

public class SeparadorDeLetrasInverso {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê um nome e imprime as letras ao inverso.");
		
		System.out.print("Informe a palavra desejada: ");
		var nome = ler.nextLine();
		
		char[] letras = new char[nome.length()];
		
		System.out.println("Palavra informada: " + nome + "\n");
		
		for (int i = nome.length() - 1; i >= 0; i--) 
		{
		    letras[nome.length() - 1 - i] = nome.charAt(i);
		    System.out.println(letras[nome.length() - 1 - i]);
		}

		
		ler.close();
	}

}
