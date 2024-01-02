package Algoritmo_135;

import java.util.Scanner;

public class ClassificaEleitor {
	static int idade;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê a idade e imprimi a classicação do eleitor.");

		System.out.print("Informe a idade do eleitor: ");
			idade = ler.nextInt();
			
		if (idade < 16) {
			System.out.print("\nNão é um eleitor ativo.");
		} 
			else if (idade < 18) {
				System.out.print("\nVoto facultativo.");
			}
			else if (idade < 66) {
					System.out.println("\nVoto obrigatório.");
			}
			else {
				System.out.print("\nVoto facultativo.");
			} 
		
		
		ler.close();
	}

}
