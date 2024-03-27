package exercicio_07_vetores_matrizes;

import java.util.Scanner;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  7. A partir do exercício 6 (vetor classificado) solicitar um valor qualquer e 
 *  verificar a sua existência no vetor (utilizar pesquisa binária).
 */

public class exercicio_07_vetores_matrizes {

	static int vet[] = new int[20];

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		geraVetor();
		classificaVetor();
		
		System.out.print("\n\nDigite um número e veremos se ele está no vetor: ");
		int num  = ler.nextInt();
		
		verificaNum(num);
		
		ler.close();
	}
	
	
	/*****************************************************
	 * Procedure que gera o vetor com valores de 0 a 100
	 */
	static void geraVetor()
	{
		System.out.print("Vetor gerado: ");
		for (int i = 0; i < vet.length; i++) 
		{
			vet[i] = (int) (Math.round(Math.random() * 100) + 1);
		}
		exibeVetor();
	}
	
	
	/*************************************
	 * Procedure que classifica o vetor 
	 */
	static void classificaVetor()
	{
		int aux;
		System.out.print("\nVetor Clasificado: ");
		for (int i = 0; i < vet.length - 1; i++) 
		{
			for (int j = i + 1; j < vet.length; j++) 
			{
				if (vet[i] > vet[j]) 
				{
					aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;
				}
			}
		}
		exibeVetor();
	}
	
	
	/**************************************************************
	 * Procedure que verifica se a entrada está presente no vetor
	 */
	static void verificaNum(int n)
	{
		int c = 0;
		for (int i = 0; i < vet.length; i++) 
		{
			if (n == vet[i]) 
			{
				c++;
			}
		}
		System.out.print("\n\nO número " + n + " está presente no vetor " + c + " vezes.");
	}
	
	
	/********************************
	 * Procedure que exibe o vetor
	 */
	static void exibeVetor()
	{
		for (int i = 0; i < vet.length; i++) 
		{
			System.out.print(vet[i] + " ");
		}
	}

	
}
