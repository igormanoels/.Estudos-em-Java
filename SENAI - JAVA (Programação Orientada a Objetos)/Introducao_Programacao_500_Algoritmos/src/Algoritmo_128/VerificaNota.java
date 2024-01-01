package Algoritmo_128;

import java.util.Scanner;

public class VerificaNota {
	static double n1, n2, n3, n4, med;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê quatro notas e imprimi a avaliação.");
		
		System.out.print("Informe a primeira nota: ");
			n1 = ler.nextDouble();
		System.out.print("Informe a segunda nota: ");
			n2 = ler.nextDouble();
		System.out.print("Informe a terceira nota: ");
			n3 = ler.nextDouble();
		System.out.print("Informe a quarta nota: ");
			n4 = ler.nextDouble();
		
		med = ((n1 + n2 + n3 + n4) / 4);
		
		if (med >= 7) {
			System.out.print("\nParabéns, aprovado. Média: " + med);
		} else {
			if (med >= 3) {
				System.out.print("\nVocê vai para exame. Média: " + med);
			} else {
				System.out.print("\nVocê foi reprovado. Média: " + med);
			}
		}
		
		
		ler.close();
	}

}
