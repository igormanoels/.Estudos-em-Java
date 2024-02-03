package Algoritmo_185;

import java.util.Scanner;

public class RaizQuadradaQuinzeX {

	public static void main(String[] args) {
		double [] raiz = new double [15];
		int cont = 1;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê 15 números e imprimi sua raiz quadrada.\n");
		
		for (int i = 0; i <= 14; i++) {
			System.out.print("Informe o " + cont + "º número: ");
			raiz[i] = Math.sqrt(ler.nextDouble());
			System.out.println("A " + cont + "º raiz quadrada é " + raiz[i] + "\n");
			cont += 1;
		}
		
		ler.close();
	}

}
