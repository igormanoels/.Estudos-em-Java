package Algoritmo_86;

import java.util.Scanner;

public class VerificaNumero {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê um número e imprimi se ele é Positivo, Negativo ou Nulo.");
		
		System.out.print("Digite um número: ");
			int num = ler.nextInt();
		
		if (num == 0) {
			System.out.print("\nO número informado é nulo.");
		}
			else if (num > 0) {
				System.out.print("\nO número informado é Positivo.");
			}
			else if (num < 0) {
				System.out.print("\nO número informado é Negativo");
			}
		
		
		ler.close();
	}

}
