package edu.dio.aula04;

	import java.util.Scanner;

	/*
	 * 	Tipos de Escopo
	 * 		- Escopo de Classe - variáveis globais
	 * 		- Escopo de Método - variáveis do método
	 * 		- Escopo de Fluxo - variáveis 
	 * 
	 * 	É o bloco onde a variável foi declarada, portando a mesma não pode ser 
	 * 	manipulada por rotinas e códigos fora do seu bloco de declaração.
	 */
	
public class Escopo 
{
	static double saldo = 1000.00; // variável de escopo da classe
	
	public static void main(String[] args) 
	{
		double saque; //variável de escopo de método
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Favor informar o valor do saque: ");
		saque = ler.nextDouble();
		saldo = saldo - saque; // manipulando variáveis de classe e método
		
		
		// Retorno de valores das variáveis após manipulação
		System.out.println("Saldo: R$" + saldo + "\nValor sacado: R$" + saque); 
		
		
		for (int i = 0; i < args.length; i++) // o i é uma variável de escopo de fluxo
		{
			try 
			{
				System.out.println("Encerrando em " + i + " seg");
				Thread.sleep(1000);
			} catch (Exception e) 
			{
			}
		}
		
		ler.close();
		
	}
	
	
}
