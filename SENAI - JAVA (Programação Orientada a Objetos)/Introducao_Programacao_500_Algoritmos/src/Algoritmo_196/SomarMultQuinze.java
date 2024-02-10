package Algoritmo_196;

import java.util.Scanner;

public class SomarMultQuinze {

	public static void main(String[] args) {
		var soma = 0;
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê um número e imprime a soma dos multiplos de 5 desse intervalo.");
		
		System.out.print("Favor informar um número: ");
		var lim = ler.nextInt();
		
		for (int i = 0; i <= lim ; i+=5) 
		{
			if (i % 5 == 0) 
			{
				soma = soma +i;
			}
		}
		
		System.out.print("Somatória dos múltiplos de 5 é igual a " + soma);
	
		
		ler.close();
	}

}
