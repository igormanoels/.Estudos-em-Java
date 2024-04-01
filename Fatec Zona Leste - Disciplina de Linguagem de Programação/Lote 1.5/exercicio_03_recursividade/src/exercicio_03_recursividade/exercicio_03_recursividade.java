package exercicio_03_recursividade;

import java.util.Scanner;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 3) Serie3 = (1/1) + (1/2) + (1/3) + ....+ (1/N) 
 */

public class exercicio_03_recursividade {

	public static void main (String args [])
	{
		double num, resp;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Algoritmo: Cálcula a série de 1/1 até 1/n usando recursividade."
				+ "\nInforme o número desejado: ");
		num = ler.nextDouble();
		
		resp = calcSerie(num);
		System.out.print("Resposta para a série é " + resp);
		ler.close();
	}
	
	 /************************************************
     * Função que calcula a série com recursividade
     */
	static double calcSerie(double n)
	{
		if (n == 1) 
		{
			return 1;
		} 
		else 
		{
			return 1.0 /  n + calcSerie(n-1);
		}
	}
	
}
