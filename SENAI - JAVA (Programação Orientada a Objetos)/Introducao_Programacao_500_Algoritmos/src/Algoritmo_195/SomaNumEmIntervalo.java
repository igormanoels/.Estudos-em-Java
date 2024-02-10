package Algoritmo_195;

import java.util.Scanner;

public class SomaNumEmIntervalo {

	public static void main(String[] args) {
		var soma = 0;
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Imprime a soma dos números entre 25 e 200.");
		
		for (int i = 25; i <= 200; i++) 
		{
			if (i % 2 == 0) 
			{
				soma = soma + i;
			}
		}
		
		System.out.println("Total da soma = " + soma);
		
		ler.close();
	}

}
