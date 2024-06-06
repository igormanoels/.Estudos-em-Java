package edu.dio.desafio01.ContaBanco;

	import java.util.Scanner;
	
	/*
	 * 	Sintaxe - Desafio
	 * 	1 - Crie o projeto ContaBanco que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
	 * 		Atributo			Tipo			Exemplo
	 * 		Numero				Inteiro			1021
	 * 		Agencia				Texto			067-8
	 * 		Nome Cliente		Texto			MARIO ANDRADE
	 * 		Saldo				Decimal			237.48
	 * 	Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.
	 * 	
	 * 	2 - Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada.
	 * 	3 - Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem
	 * 		"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".
	 */

public class ContaTerminal 
{
	static int conta;
	static String agencia;
	static String cliente;
	static double saldo;
	
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o número da conta: ");
		conta = ler.nextInt();
		ler.nextLine();

		System.out.print("Informe o número da agencia contendo o digíto: ");
		agencia = ler.nextLine();
		
		System.out.print("Informe por favor informe seu nome: ");
		cliente = ler.nextLine();
		
		System.out.print("Agora por favor informe o valor do depósito: R$ ");
		saldo = ler.nextDouble();
		ler.nextLine();
		
		imprimir();
		
		ler.close();
		
	}
	
	public static void imprimir()
	{
		String msg = "\n\nOlá ".concat(cliente).concat(", obrigado por criar uma conta em nosso banco.\nSua agência é ")
				.concat(agencia).concat(", conta: ").concat(String.valueOf(conta)).concat("\nE o seu saldo de R$ ")
				.concat(String.valueOf(saldo)).concat(" já está disponível para saque.");
		System.out.println(msg);
	}
}
