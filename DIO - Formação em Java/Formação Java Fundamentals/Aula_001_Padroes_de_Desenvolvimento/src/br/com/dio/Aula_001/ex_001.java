package br.com.dio.Aula_001;

import java.util.Scanner;

/*
 * Escreva um código que recebe o nome e o ano de anascimento alguém e imprima na tela a seguinte mensagem: "Olá, fulano, você tem 'X' Anos".
 */

public class ex_001 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		String nome = ler.next();
		
		
		System.out.print("Informe seu ano de nascimento: ");
		int anoNasc = ler.nextInt();
		
		System.out.printf("\n\nOlá %s, você tem %s anos.", nome, (2025-anoNasc));
		
		
		
		ler.close();
	}
}
