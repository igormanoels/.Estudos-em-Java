package Algoritmo_197;

import java.util.Scanner;

public class ExibeEContaNumsImpares {

	public static void main(String[] args) {
		var soma = 0;
		var cont = 0;
 		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê a quantidade de números Impares a ser exibido e imprime na sequencia e a somatória.");
		
		System.out.print("Favor informar quantos números gostaria de ver a partir de zero: ");
		var quant = ler.nextInt();
		
		System.out.print("\nContando... ");
		
		do 
		{
			cont++;
			if (cont % 2 != 0) 
			{
				System.out.print(cont + " ");
				quant--;
				soma = soma + cont;
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		} while(quant != 0);
		
		System.out.println("\nSomatória dos números impares: " + soma);
		
		ler.close();
	}

}
