package exercicio_05_recursividade;

import java.util.Scanner;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 5) Serie5 = (N)! + (N-1)! + (N-2)! + ... + (1)!
 */

public class exercicio_05_recursividade {

	public static void main(String[] args) 
	{
		double res, num;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Algoritmo: Cálcula a soma de N! até 1!."
				+ "\nInforme o número desejado: ");
		num = ler.nextDouble();
		
		res = calcSerie(num);
		System.out.println("Resposta: " + res);
		
		ler.close();
	}
	
	 /************************************************************************
     * Função que cálcula a soma dos fatoriais de n até 1 com recursividade.
     */
	static double calcSerie(double n)
	{
		if (n == 1) 
		{
			return Fat(n);
		} 
		else 
		{
			return Fat(n) + calcSerie(n-1);
		}
	}
	
	 /*********************************************************
     * Função que calcula o fatorial de um número.
     */
	static double Fat(double n)
	{
		if (n == 0 || n == 1) 
		{
			return 1;
		} else 
		{
			return n * Fat(n-1);
		}
	}
}
