package Algoritmo_109;

import java.util.Scanner;

public class OrdenandoNomes {
	static String nome1, nome2;
	static char letra1, letra2;
	
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê dois nomes e imprimi classifica em ordem alfabética.");

		System.out.print("Informe o primeiro nome: ");
		 	nome1 = ler.nextLine();
		System.out.print("Informe o segundo nome: ");
			nome2 = ler.nextLine();
		
		letra1 = nome1.charAt(0);
		letra2 = nome2.charAt(0);
		
		if (letra1 < letra2) {
			System.out.println("A ordem é: " + nome1 + ", " + nome2);
		} else {
			System.out.println("A ordem é: " + nome2 + ", " + nome1);
		}
		
		
		ler.close();
	}
}
