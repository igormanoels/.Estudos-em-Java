package Algoritmo_045;

import java.util.Scanner;

public class CalculaQuadradoRaiz {
	static double num, quad, raiz;
	
	public static void main(String[] args) {
		System.out.println("Algoritmo: Lê um valor e imprime seu quadrado e raiz.");
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe um número ");
		 	num = ler.nextDouble();
		
		quad = (Math.pow(num, 2));
			System.out.println("\nQuadrado: " + quad);
		raiz = (Math.sqrt(num));
			System.out.println("Raiz quadrada: " + raiz);
		 	
		ler.close();
	}

}
