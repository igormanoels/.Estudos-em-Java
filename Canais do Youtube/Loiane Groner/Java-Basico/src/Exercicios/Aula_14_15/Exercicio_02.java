package Exercicios.Aula_14_15;

import java.util.Scanner;

// 2. Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo. 

public class Exercicio_02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o número desejado: ");
		int num = ler.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("O número informado é par.");
		} else {
			System.out.println("O número informado é impar.");
		}
				
		
		ler.close();
	}
	
}
