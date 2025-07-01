package Exercicios.Aula_14_15;

import java.util.Scanner;

// 1. Faça um Programa que peça dois números e imprima o maior deles. 


public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Informe o primeiro número: ");
		num1 = ler.nextInt();
		
		System.out.print("Informe o segundo número: ");
		num2 = ler.nextInt();
		
		if (num1 > num2) {
			System.out.println("O primeiro número é o maior.");
		} else {
			System.out.println("O segundo número é o maior.");
		}
			
		
		ler.close();
	}

}
