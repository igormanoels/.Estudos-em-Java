package Algoritmo_161;

import java.util.Scanner;

public class CincoQuadrados {

	public static void main(String[] args) {		
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê 5 números e imprimi o seu quadrado.");
		
		for (int i = 1; i <= 5; i++) 
		{
			System.out.print("Informe o " + i + "º número: ");
			var n = ler.nextDouble();
			n = Math.pow(n,2);
			System.out.println("O " + i + "º quadrado é " + n +".\n");
		}
		
		ler.close();
	}

}
