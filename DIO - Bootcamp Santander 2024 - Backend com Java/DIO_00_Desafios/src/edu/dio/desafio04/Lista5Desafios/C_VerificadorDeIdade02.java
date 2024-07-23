package edu.dio.desafio04.Lista5Desafios;

import java.util.Scanner;

/*
 * Descrição
 * Você está desenvolvendo um programa simples em Java para verificar se um cliente é elegível para criar uma 
 * conta bancária. A condição é que o cliente deve ter pelo menos 18 anos de idade.
 * 
 * Entrada
 * O programa solicitará ao usuário que digite sua idade.
 * 
 * Saída
 * Utilizando apenas um bloco if e else, o programa verificará se a idade do cliente é igual ou superior a 18 anos.
 * Se a idade for maior ou igual a 18, o programa informará que o cliente é elegível para criar uma conta bancária.
 * Se a idade for menor que 18, o programa informará que o cliente não é elegível para criar uma conta bancária.
 * 
 */

public class C_VerificadorDeIdade02 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Favor informar sua idade: ");
		int idade = scanner.nextInt();
		
		if (idade >= 18) 
		{
			System.out.println("Voce esta elegivel para criar uma conta bancaria.");
		} 
		else 
		{
			System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
		}

		scanner.close();
	}
}
