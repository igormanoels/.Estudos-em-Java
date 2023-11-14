package Algoritmo_53;

import java.util.Scanner;

public class DiagonalParalelepipedo {

	public static void main(String[] args) {
		double num1, num2, num3, diagonal;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o lado A");
		num1 = ler.nextDouble();
		
		System.out.println("Informe o lado B");
		num2 = ler.nextDouble();
		
		System.out.println("Informe o lado C");
		num3 = ler.nextDouble();
		
		diagonal = (Math.sqrt((Math.pow(num1, 2) + (Math.pow(num2, 2) + (Math.pow(num3, 2))))));
			System.out.println("A diagonal é " + diagonal);
	}

}
