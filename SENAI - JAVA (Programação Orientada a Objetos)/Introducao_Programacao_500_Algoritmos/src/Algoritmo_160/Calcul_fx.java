package Algoritmo_160;

import java.util.Scanner;

public class Calcul_fx {

	public static void main(String[] args) {
		double x, y;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê o valor de 'x' e imprimi o resultado da função.");
		System.out.print("Informe o valor de 'x' = ");
		x = ler.nextDouble();
		
		if (x <= 1) {
			y = 1;
		} 
		else 
		{
			if (x <= 2) 
			{
				y = 2;
			} 
			else 
			{
				if (x <=3) 
				{
					y = Math.pow(x,2);
				} 
				else 
				{
					y = Math.pow(x, 3);
				}
			}
		}
		
		System.out.println("\nf(x): " + y);
		
		ler.close();
	}

}
