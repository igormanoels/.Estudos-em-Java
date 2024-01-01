package Algoritmo_122;

import java.util.Scanner;

public class VerificaTriangulo {
	static int ladoA, ladoB, ladoC;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê três lados e imprimi se pode ser ou não um triângulo.");

		System.out.print("Informe o valor do lado A: ");
			ladoA = ler.nextInt();
		System.out.print("Informe o valor do lado B: ");
			ladoB = ler.nextInt();
		System.out.print("Informe o valor do lado C: ");
			ladoC = ler.nextInt();
		
		if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
			System.out.println("\nPode ser um triângulo");
		}
			else {
			System.out.println("\nNão é possível que seja triângulo");
		}
		
		
		ler.close();
	}

}
