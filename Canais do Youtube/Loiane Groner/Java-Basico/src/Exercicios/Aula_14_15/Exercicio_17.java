package Exercicios.Aula_14_15;

import java.util.Scanner;

/* 17. Faça um Programa que peça um número correspondente a um determinado ano 
 * e em seguida informe se este ano é ou não bissexto. 
 */

public class Exercicio_17 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o ano desejado: ");
		int ano = ler.nextInt();
		
		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			System.out.println("É bissexto.");
		} else {
			System.out.println("Não é bissexto.");
		}
			
				
		ler.close();
	}
	
}
