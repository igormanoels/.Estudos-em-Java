package Algoritmo_84;

import java.util.Scanner;

public class VerificaParOuImpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê um número e imprimi se ele é impar ou par.");
		
		System.out.print("Informe um número: ");
		int num = ler.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("\nO número informado é par");
		}
			else {
				System.out.print("\nO número informado é impar");
			}
			
		ler.close();
	}

}
