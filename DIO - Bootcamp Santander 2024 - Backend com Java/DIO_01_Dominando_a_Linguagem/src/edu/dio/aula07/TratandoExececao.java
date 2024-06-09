package edu.dio.aula07;

import java.util.Scanner;

	//java.lang.NullPointerException - Serve para o tratamento de variáveis nulas
	// java.langArithmeticException - Serve para o tratamento de divisões por zero
	// java.sql.SQLException - Serve para o tratamento de erros ao interagir com o Banco de Dados
	// java.io.FileNotFoundException - Serve para tratar o erro ao ler ou escrever em um arquivo que não existe

public class TratandoExececao 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		
		// Tente (executa)... Pegue(captura o erro)... Finalmente (executa ignorando o erro)
		try 
		{
			System.out.print("Informe o dividendo: ");
			int valor1 = ler.nextInt();
		
			System.out.print("Informe o divisor: ");
			int valor2 = ler.nextInt();
			
			double res = valor1 / valor2;
			System.out.println("Resultado da divisão: " + res );
		} 
		catch (Exception e) //Exception é um identificador de erro genérico, e é a variavél que recebe o erro ocorrido
		{
			System.err.println("\nErro: " + e);
			System.out.println("Ambos valores precisam ser numéricos");
		}
		 
		
		ler.close();
	}
	
	
}
