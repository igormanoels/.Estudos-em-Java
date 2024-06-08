package edu.dio.aula06;

import java.util.Iterator;

public class EstruturasRepeticao 
{
	public static void main(String[] args) 
	{
	
		// Estrutura de Repetição - Para
		for (int carneirinhos = 1; carneirinhos <= 10; carneirinhos++) 
		{
			System.out.println(carneirinhos + " carneirinhos");
		}
		System.out.println("Joãozinho dormiu!\n\n");
		
		
		// Usando for para ler valores de um vetor

		String aluno [] = {"IGOR", "JOÃO", "PAULO", "GABRIEL", "SERGIO"}; // Posições iniciadas em zero
		
		for (int i = 0; i < aluno.length; i++) 
		{
			System.out.println((i+1) + "º aluno: " + aluno[i]);
		}	
		System.out.println("\n\n");
		
		
		//Foreach
		for (String j : aluno) 
		{
			System.out.println("aluno: " + j);
		}	
		System.out.println("\n\n");
		
		
		// Condicionais de Iteração
		for (int num = 1; num <= 10; num++) 
		{
			if (num == 3)
			{
				continue; // Pula a iteração caso a condição seja atendida
			}
			else if (num == 6)
			{
				break; // Para a iteração caso a condição seja atendida
			}	
			System.out.println(num);
		}		
		System.out.println("\n\n");

		
		// Estrutura de Repetição - Enquanto
		int cont = 0;
		while (cont < 10) // Executa de acordo com a condição
		{
			cont++; 
			System.out.println("contando " + cont); 
		}	
		System.out.println("\n\n");

		
		// Estrutura de Repetição - Faça...Enquanto
		do // Garante a execução ao menos uma vez
		{
			System.out.println("regressiva: " + cont);
			cont--;
		} while (cont > 0);
	}
}
