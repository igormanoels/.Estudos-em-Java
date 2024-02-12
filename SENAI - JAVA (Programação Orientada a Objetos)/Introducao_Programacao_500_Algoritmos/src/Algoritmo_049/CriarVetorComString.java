package Algoritmo_49;

import java.util.Scanner;

public class CriarVetorComString {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Algoritmo: Lê um nome e imprime os caracteres separados.");
		
		System.out.println("Informe seu nome completo");
		 	String nome = ler.nextLine();
		
		System.out.println("Todo o nome: " + nome);
		System.out.println("Primeiro Caractere: " + nome.charAt(0));
		System.out.println("Último Caractere: " + nome.charAt(nome.length()-1));
		System.out.println("Do primeiro ao terceiro: " + nome.substring(0, 3));
		System.out.println("O quarto caracteres: " + nome.charAt(3));
		System.out.println("Todos menos o primeiro: " + nome.substring(1));
		System.out.println("Os dois ultimos caracteres: " + nome.substring(nome.length()-2));
		
		ler.close();
	}

}
