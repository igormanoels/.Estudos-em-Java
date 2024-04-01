package exercicio_01_recursividade;

import java.util.Scanner;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 1) Serie1 = (1+2+3+...+100)
 */

public class exercicio_01_recursividade {
	
	public static void main(String[] args) 
	{
		int num;
		Scanner ler = new Scanner(System.in);
		System.out.print("Algoritmo: Conta de \"n\" a 100 com recursividade."
				+ "\nInforme o valor para \"n\": ");
		num = ler.nextInt();
		
		num = contador(num);
		System.out.print("Número: " + num);
		
		ler.close();
	}
	
	 /*******************************************
     * Função recursiva que conta de N até 100.
     */
	static int contador(int n)
	{
		if (n < 100) 
		{
			n++;
			return contador(n);
		} 
		else 
		{	
			return n;
		}
	}
}
