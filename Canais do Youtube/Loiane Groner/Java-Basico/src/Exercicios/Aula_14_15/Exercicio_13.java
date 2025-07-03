package Exercicios.Aula_14_15;

import java.util.Scanner;

/* 13. Faça um Programa que leia um número e exiba o dia correspondente da semana. 
 * (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido. 
 */

public class Exercicio_13 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o número para encontrar o dia da semana correspondente: ");
		int num = ler.nextInt();
		
		switch (num) {
			case 1: 
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda-Feira");
				break;
			case 3:
				System.out.println("Terça-Feira");
				break;
			case 4:
				System.out.println("Quarta-Feira");
				break;
			case 5:
				System.out.println("Quinta-Feira");
				break;
			case 6:
				System.out.println("Sexta-Feira");
				break;
			case 7: 
				System.out.println("Sábado.");
				break;
			default:
				System.out.println("Não há dia para o número informado.");
				break;
		}
		
		
		ler.close();
	}
	
}
