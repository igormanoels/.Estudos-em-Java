package Algoritmo_159;

import java.util.Scanner;

public class Calcu_x {

	public static void main(String[] args) {
		double x, fx;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê o valor de 'x' e imprimi o resultado de sua função.");
		
		System.out.print("Informe o valor de 'x': ");
		x = ler.nextDouble();
		
		if (x > 4 || x < (-4))
		{
			fx = (5 * x + 3) / (Math.pow(x,2) - 16);
			System.out.println("\nf(x) = " + fx);
		}
		else 
		{
			System.out.println("\nNão há resultados possíveis para essa função.");
		}
		
		ler.close();
	}

}
