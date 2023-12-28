package Algoritmo_106;

import java.util.Scanner;

public class ManipulandoString {
		static String nome, n;
		static char letra;
		
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê um nome e o imprimi caso começe com a letra A.");
		
		System.out.print("Informe seu Nome: ");
			nome = ler.nextLine();
/*
 *	letra = nome.charAt(0);
 *	seleciona a primeira letra e trás para a variável tipo "char"		
 *	n = String.valueOf(letra);
 *	converte a variável letra de "char" para "string"
 *	depois bata fazer o teste lógico usando n.equals("a") || n.equals("A");
 *	
 */		
		if (nome.startsWith("a")|| nome.startsWith("A")){
			System.out.print("\nSeu nome começa com a letra A");
		}
		else {
			System.out.print("\nSeu nome não começa com a letra A");
		}
		
		
		ler.close();
	}

}
