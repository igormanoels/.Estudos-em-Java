package Algoritmo_158;

import java.util.Scanner;

public class Calc_x {
	
	public static void main(String[] args) {
		double x, res;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê o valor de 'x' e imprimi o resultado de sua função.");
		
		System.out.print("Informe o valor de f(x): ");
		x = ler.nextDouble();
		
		if (x!= 2) {
			res = (8 / (2 - x));
			System.out.println("\nf(x) = " + res);
		} else {
			System.out.println("\nNão há resultados possíveis para essa função.");
		}
		
		
		ler.close();
	}

}
