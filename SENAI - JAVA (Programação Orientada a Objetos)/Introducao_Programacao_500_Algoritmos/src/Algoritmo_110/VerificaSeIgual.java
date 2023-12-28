package Algoritmo_110;

import java.util.Scanner;

public class VerificaSeIgual {
	static int num1, num2;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê dois números e imprimi se são iguais ou não.");

		System.out.print("Infome o primeiro número: ");
			num1 = ler.nextInt();
		System.out.print("Informe o segundo número: ");
			num2 = ler.nextInt();
		
			if (num1 == num2) {
				System.out.print("\nOs números são iguais.");
			} else {
				System.out.print("\nOs números são Diferentes.");
			}
			
			
		ler.close();
	}

}
