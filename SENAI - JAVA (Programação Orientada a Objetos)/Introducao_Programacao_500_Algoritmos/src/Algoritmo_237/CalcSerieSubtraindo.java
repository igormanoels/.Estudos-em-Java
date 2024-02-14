package Algoritmo_237;

import java.util.Scanner;

public class CalcSerieSubtraindo {

	public static void main(String[] args) {
		float res = 1;
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê um número e imprime a função segundo a regra de cálculo.");
		
		System.out.print("Favor informar o número desejado: ");
		float num = ler.nextFloat();
		
		for (int i = 2; i <= num; i++) 
		{
			if (i % 2 == 0) 
			{
				res = res - (1f / i);
			} 
			else 
			{
				res = res + (1f / i);
			}
			
		}
		
		System.out.printf("\nResultado: %.2f", res);
		
		
		ler.close();
	}

}
