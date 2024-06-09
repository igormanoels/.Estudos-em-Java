package edu.dio.aula08;

import java.util.Scanner;

public class RealizandoDebug2 
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		String[] alunos = {"Alan", "Igor", "Jessica", "Pricila"};
		
		double media = calcMedia(alunos, ler);
		
		System.out.printf("\nMédia da turma: %.2f", media);
	}
	
	static double calcMedia(String[] alunos, Scanner ler)
	{
		double soma = 0;
		
		for (String aluno : alunos) 
		{
			System.out.print("Informe a nota do aluno(a) " + aluno + ": ");
			double nota = ler.nextDouble();
			soma += nota;
		}
		
		return soma / alunos.length;
		
	}

}
