package exercicio_00_recursividade;

import java.util.Scanner;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * Exemplo: Recursividade com fatorial
 */

public class exercicio_00_recursividade {
	
	public static void main(String[] args) 
	{
		int num, fat;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Algoritmo: Cálcula o Fatorial com o uso de recursividade."
				+ "\nInforme um número para saber o seu Fatorial: ");
		num = ler.nextInt();
		
		fat = calcFat(num);
		System.out.println("Fatorial de " + num + " é " + fat);
		ler.close();
		
	}
	
	/*************************************************
	 * Function que cálcula o valor do fatorial de n
	 */
	public static int calcFat(int n)
	{
		if (n == 0 || n == 1) 
		{
			return 1;
		} 
		else 
		{
			return n * calcFat(n - 1);
		}
	}

}
