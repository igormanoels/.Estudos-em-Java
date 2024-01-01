package Algoritmo_120;

import java.util.Scanner;

public class MaiorMedioMenor {
	static int num1, num2, num3, maior, menor, intermed;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê três números e imprimi o maior, o intermediário e o menor.");
		
		System.out.print("Informe o primeiro número: ");
			num1 = ler.nextInt();
		System.out.print("Informe o segundo número: ");
			num2 = ler.nextInt();
		System.out.print("Informe o terceiro número: ");
			num3 = ler.nextInt();
		
		if (num1 == num2 || num1 == num3 || num2 == num3) {
			System.out.println("\nNúmeros iguais não são aceitos!");
		}
		
		maior = (Math.max(num1, Math.max(num2, num3)));
		menor = (Math.min(num1, Math.min(num2, num3)));	
		intermed = (Math.addExact(num1, Math.addExact(num2, num3))- maior - menor);
				
		System.out.println("\nMaior: " + maior
				+ "\nIntermediário: " + intermed
				+ "\nMenor: " + menor);
		
		
		ler.close();
	}

}
