package br.com.dio.Aula_001;

import java.util.Scanner;

public class MyClass {
	
	String global;
	final String constante = "Texto fixo";
	
	// Minha classe principal
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um texto qualquer: ");
		String nome = ler.nextLine();
		
		/*
		 * Conteúdo do meu programa
		 * 
		 * 
		 * 
		 */
		
		int numero = 11;
		var convertBinary = Integer.toBinaryString(numero);
		
		System.out.printf("Texto ===>  %s", nome);
		System.out.printf("\n\nSeu texto em binário ===>  %s", convertBinary);
		
		
		
		
		ler.close();
	}
}
