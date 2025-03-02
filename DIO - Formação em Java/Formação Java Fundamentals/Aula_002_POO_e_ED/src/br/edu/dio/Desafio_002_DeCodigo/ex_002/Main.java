package br.edu.dio.Desafio_002_DeCodigo.ex_002;

import java.util.Scanner;

/* 
 * Descrição
 * Crie um programa que receba um número inteiro positivo n e exiba os n primeiros números da sequência de Fibonacci.
 * 
 * Entrada
 * A entrada deve receber um número inteiro positivo
 * 
 * Saída
 * Deverá retornar os nnn primeiros números da sequência de Fibonacci separados por espaço.
 * 
 * 
 */

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fibo[] = new int[n];
        fibo[0] = 0;
        fibo[1] = 1;
		
		for (int i = 2; i < n; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		
		for (int i : fibo) System.out.print(i + " ");

		
        scanner.close();
	}
}
