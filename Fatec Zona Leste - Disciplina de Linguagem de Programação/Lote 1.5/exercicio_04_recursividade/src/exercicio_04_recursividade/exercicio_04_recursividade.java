package exercicio_04_recursividade;

import java.util.Scanner;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 4) Serie4 = (N/1) +(N-1 / 2 ) + (N-2 / 3) + .... + (1/N) 
 */

public class exercicio_04_recursividade {

	public static void main(String[] args) 
	{
		double num, res;
		Scanner ler = new Scanner (System.in);
		
		System.out.print("Algoritmo: Cálcula a série de N/1 até 1/N."
				+ "\nInforme o valor de \"n\": ");
		num = ler.nextDouble();
		
		res = calcSerie(num, 1);
		System.out.print("Resultado: " + res);
		
		ler.close();
	}
	
	
	/**********************************************************
     * Função que cálcula a série proposta com recursividade.
     */
	static double calcSerie(double n, int i)
	{
		if (n == 1)
		{
			return n / i;
		} 
		else 
		{	
			return n / i + calcSerie(n-1, i+1);
		}
	}
	
}
