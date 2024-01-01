package Algoritmo_125;

import java.util.Scanner;

public class VerificaIdade {
	static int idade;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê idade e imprimi se é idoso, menor ou maior de idade.");
			
		System.out.print("Informe sua idade por favor: ");
			idade = ler.nextInt();
			
		if (idade >= 65) {
			System.out.print("\nA pessoa é idosa, dê preferencia a ela.");
		} else {
			if (idade <= 17) {
				System.out.print("\nAcesso negado, por ser menor de idade.");
			} else {
				System.out.print("\nAcesso liberado, por ser maior de idade.");
			}
		}
				
		
		ler.close();
	}

}
