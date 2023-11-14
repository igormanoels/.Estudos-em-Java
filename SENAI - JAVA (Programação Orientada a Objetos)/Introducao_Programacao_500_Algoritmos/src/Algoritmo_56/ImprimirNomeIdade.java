package Algoritmo_56;

import java.util.Scanner;

public class ImprimirNomeIdade {

	public static void main(String[] args) {
		String nome;
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe seu nome");
			nome = ler.nextLine();
			
		System.out.println("Informe sua idade");
		 	idade = ler.nextInt();
		 
		System.out.println("\n\nNome: " + nome + "\nIdade: " + idade);
		
		
		
	}

}
