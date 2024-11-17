package Algoritmo_239;

import java.util.Scanner;

public class CalcSerieComFatorial {

	public static void main(String[] args) {
		float solu = 1;
		int fat = 1;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê um número e imprime a divisão entre n elevado ao número e dividido pelo seu fatorial.");
		
		System.out.print("Favor informar o número desejado: ");
		var n = ler.nextInt();
			
		for (int i = 1; i <= n; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				fat*=j;
			}
			solu = (float) (solu + (((Math.pow(n, i)) / (fat))));	
		}
		
		System.out.printf("\nSolução: %.2f", solu);
		
		
		ler.close();
	}

}
