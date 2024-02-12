package Algoritmo_053;

import java.util.Scanner;

public class DiagonalParalelepipedo {

	public static void main(String[] args) {
		double num1, num2, num3, diagonal;
		
		System.out.println("Algoritmo: Lê os lados do paralelepípedo e imprime a Diagonal.");

		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o lado A ");
			num1 = ler.nextDouble();
		System.out.print("Informe o lado B ");
			num2 = ler.nextDouble();
		System.out.print("Informe o lado C ");
			num3 = ler.nextDouble();
		
		diagonal = (Math.sqrt((Math.pow(num1, 2) + (Math.pow(num2, 2) + (Math.pow(num3, 2))))));
			System.out.println("\nA diagonal é " + diagonal);
			
		ler.close();
	}

}
