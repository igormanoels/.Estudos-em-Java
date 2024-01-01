package Algoritmo_121;

import java.util.Scanner;

public class MaiorEMenorDeCinco {
	static int num1, num2, num3, num4, num5, maior, menor;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê cinco números e imprimi o maior e o menor.");

		System.out.print("Informe o primeiro número: ");
			num1 = ler.nextInt();
		System.out.print("Informe o segundo número: ");
			num2 = ler.nextInt();
		System.out.print("Informe o terceiro número: ");
			num3 = ler.nextInt();
		System.out.print("Informe o quarto número: ");
			num4 = ler.nextInt();
		System.out.print("Informe o quinto número: ");
			num5 = ler.nextInt();
			
		maior = Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5))));
		menor = Math.min(num1, Math.min(num2, Math.min(num3, Math.min(num4, num5))));
		
		System.out.println("\nO Maior número é: " + maior
						 + "\nO Menor número é: " + menor);
		
		
		ler.close();
	}

}
