package Algoritmo_236;

import java.util.Scanner;

public class CalcSerieSomando {

	public static void main(String[] args) {
		float res = 0;
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê um número e imprime a função segundo a regra de cálculo.");
		
		System.out.print("Favor informar o número desejado: ");
		float num = ler.nextFloat();
		
		for (int i = 1; i <= num; i++) 
		{
			res = res + (1f / i);
		}
		
		System.out.printf("\nResultado: %.2f", res);
		
		
		ler.close();
	}

}
