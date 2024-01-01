package Algoritmo_123;

import java.util.Scanner;

public class VerificaTipoTriangulo {
	static int ladoA, ladoB, ladoC;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê três lados e imprimi o tipo do triângulo.");
		
		System.out.print("Informe o valor do lado A: ");
			ladoA = ler.nextInt();
		System.out.print("Informe o valor do lado B: ");
			ladoB = ler.nextInt();
		System.out.print("Informe o valor do lado C: ");
			ladoC = ler.nextInt();
			
		if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoC) {
			if (ladoA == ladoB && ladoA == ladoC) {
				System.out.print("\nEsse é um triângulo Equilatero");	
			} 
				else {
					if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
						System.out.print("\nEsse é um triângulo Isosceles");
					} else {
						System.out.print("\nEsse é um triângulo Escaleno");
					}
			}
		} else {
			System.out.print("\nNão é possível que seja um triângulo");
		}
		
		
		ler.close();
	}

}
