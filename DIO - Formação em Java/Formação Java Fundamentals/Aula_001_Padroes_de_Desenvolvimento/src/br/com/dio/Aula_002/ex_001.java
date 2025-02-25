package br.com.dio.Aula_002;

import java.util.Scanner;
/*
 * Escreva uma tabuada a partir de uma entrada. 
 * 
 */

public class ex_001 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe um valor para cálcular a sua tabuada: ");
		int tabuada = ler.nextInt();
		
		System.out.println("\nTabuada do " + tabuada);
		for (int i = 0; i <= 10; i++) {
			System.out.printf("%d x %d = %d \n", tabuada, i, (tabuada*i));
		}
		
		
		ler.close();
	}
	
}
