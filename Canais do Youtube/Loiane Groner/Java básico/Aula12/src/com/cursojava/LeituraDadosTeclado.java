package com.cursojava;

import java.util.Scanner;

public class LeituraDadosTeclado {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		// Faz a leitura de uma linha completa
		System.out.print("Digite seu nome completo: ");
		String nomeCompleto = ler.nextLine();
		System.out.println("Olá, " + nomeCompleto);
		
		
		// Faz a leitura até o primeiro espaço digitado
		System.out.print("Digite seu primeiro nome: ");
		String nome = ler.next();
		System.out.println("Seu primeiro nome é: " + nome);
		
		
		// Faz a leitura de um valor inteiro
		System.out.print("Digite sua idade: ");
		int idade = ler.nextInt();
		System.out.println("Idade: " + idade);
		
		
		// Faz a leitura de um valor decimal
		System.out.print("Digite sua altura: ");
		double altura = ler.nextInt();
		System.out.println("Idade: " + altura);
		
		
		// Faz a leitura de valores variados em uma mesma entrada
		System.out.println("Informe seu nome, idade, altura, peso e nome da mãe");
		String nome2 = ler.next();
		int idade2 = ler.nextInt();
		float altura2 = ler.nextFloat();
		double peso2 = ler.nextDouble();
		String nomeMae = ler.next();
		
		System.out.println("Dados digitados: " + nome2 + "\n" + idade2 + "\n" + altura2 + "\n" + peso2 + "\n" + nomeMae);
		
		
		
		ler.close();
	}
}
