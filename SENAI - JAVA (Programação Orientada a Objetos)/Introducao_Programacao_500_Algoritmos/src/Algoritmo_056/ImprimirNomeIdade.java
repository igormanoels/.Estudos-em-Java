package Algoritmo_056;

import java.util.Scanner;

public class ImprimirNomeIdade {

	public static void main(String[] args) {
		String nome;
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Algoritmo: Lê o nome e idade e imprime os dados do usuário.");
		
		System.out.print("Informe seu nome ");
			nome = ler.nextLine();
		System.out.print("Informe sua idade ");
		 	idade = ler.nextInt();
		 
		System.out.println("\nNome: " + nome + "\nIdade: " + idade);
		
		ler.close();
	}

}
