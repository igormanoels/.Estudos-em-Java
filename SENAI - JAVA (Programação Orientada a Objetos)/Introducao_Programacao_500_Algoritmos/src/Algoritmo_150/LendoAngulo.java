package Algoritmo_150;

import java.util.Scanner;

public class LendoAngulo {
	static double ang, rad;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê o ângulo em graus e imprimi se o ângulo pertence a um seno quadrante par ou co-seno impar.");
		
		System.out.print("Informe o valor do ângulo em graus: ");
			ang = ler.nextDouble();
			rad = (ang * (Math.PI / 180));
			// fórmula para converter graus em radianos
			
		if (((rad > (Math.PI/2) && rad <= Math.PI)) || (rad > (3 * (Math.PI / 2)) && rad <= (2*Math.PI))) {
			System.out.print("\nSeno: " + Math.sin(rad));
		} 
		else {
			System.out.print("\nCo-seno: " + Math.cos(rad));
		}
		
		
		ler.close();
	}

}
