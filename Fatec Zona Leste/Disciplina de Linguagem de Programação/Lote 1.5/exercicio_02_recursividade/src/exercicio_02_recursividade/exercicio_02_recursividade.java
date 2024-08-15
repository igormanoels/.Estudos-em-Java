package exercicio_02_recursividade;

import java.util.Scanner;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 2) Serie2 = (N) + (N-1) + (N-2) + ... + (1) 
 */
public class exercicio_02_recursividade {

	public static void main(String args [])
	{
		int num, soma;
		Scanner ler = new Scanner(System.in);
		System.out.print("Algoritmo: Soma os valores de \"n\" até 1."
				+ "\nInforme o número desejado: ");
		num = ler.nextInt();
		soma = calcNum(num);
		System.out.print("Soma dos números de " + num + " até 1, o total é " + soma);
				
		ler.close();
	}
	
	 /*********************************************************
     * Função que calcula a média dos valores entre 10 a 200.
     */
	static int calcNum(int n)
	{
		if (n == 1) 
		{
			return 1;	
		} 
		else 
		{
			return n + calcNum(n-1);
		}
	}
}
