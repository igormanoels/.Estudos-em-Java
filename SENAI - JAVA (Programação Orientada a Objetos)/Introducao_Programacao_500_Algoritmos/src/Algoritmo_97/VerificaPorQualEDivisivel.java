package Algoritmo_97;

import java.util.Scanner;

public class VerificaPorQualEDivisivel {
	static double num;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um número");
		 	num = ler.nextDouble();
		
		if (num % 10 == 0) {
			System.out.println("O número informado é múltiplo de 10");
		} else if (num % 2 == 0) {
			System.out.println("O número informado é múltiplo de 2");

		} else if ( num % 5 == 0) {
			System.out.println("O número informado é múltiplo de 5");
		}
		
		ler.close();
	}

}
