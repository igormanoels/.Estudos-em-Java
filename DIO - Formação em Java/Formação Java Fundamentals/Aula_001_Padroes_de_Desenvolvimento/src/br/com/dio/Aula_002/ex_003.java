package br.com.dio.Aula_002;

import java.util.Scanner;

/*
 * Todos os números pares ou impares de um intervalo, segundo a escolha do usuário
 * 
 */

public class ex_003 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o menor valor: ");
		int inicio = ler.nextInt();
		
		System.out.print("Informe o maior valor: ");
		int fim = ler.nextInt();
		
		System.out.print("Deseja ver os números pares ou impares do intervalo? ");
		String numeros = ler.next();
		
		
		if (numeros.equalsIgnoreCase("par") || numeros.equalsIgnoreCase("pares")) {
			for (int i = inicio; i <= fim; i++) {
				if (i % 2 == 0) {
					System.out.print(i + " ");
				}
			}
		} else {
			for (int i = inicio; i <= fim; i++) {
				if (i % 2 != 0) {
					System.out.print(i + " ");
				}
			}
		}
		
		
		ler.close();
	}

}
