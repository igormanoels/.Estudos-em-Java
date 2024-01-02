package Algoritmo_131;

import java.util.Scanner;

public class ExibeSala {
	static String nome;
	static char letra;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê o nome de um aluno e imprimi para qual sala ele deve ir.");

		System.out.print("Informe seu nome: ");
			nome = ler.nextLine();
		
		letra = nome.charAt(0);
		
		if (letra <= 'K') {
			System.out.println("\nFavor comparecer ao Bloco F - sala 101");
		} 
			else {
				if (letra <= 'N') {
					System.out.println("\nFavor comparecer ao Bloco F - sala 102");
				} 
					else {
						System.out.println("\nFavor comparecer ao Bloco F - sala 103");
					}
			}
		
		
		ler.close();
	}

}
