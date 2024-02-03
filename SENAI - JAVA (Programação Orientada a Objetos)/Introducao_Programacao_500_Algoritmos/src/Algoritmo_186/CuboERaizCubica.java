package Algoritmo_186;

import java.util.Scanner;

public class CuboERaizCubica {

	public static void main(String[] args) {
		double [] cubo = new double[4];
		double [] raizcub = new double[4];
		double num;
		int cont = 1;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê 4 números e imprimi sua raiz cúbica e o valor ao cubo.");
		
		for (int i = 0; i <= 3; i++) {
			System.out.print("\nFavor informar o " + cont + "º número: ");
			num = ler.nextDouble();
			cubo[i] = Math.pow(num, 3);
			raizcub[i] = Math.cbrt(num);
			System.out.println("O Cubo: " + cubo[i] + " - Raiz Cúbica: " + raizcub[i]);
			cont++;
		}

		ler.close();
	}

}
