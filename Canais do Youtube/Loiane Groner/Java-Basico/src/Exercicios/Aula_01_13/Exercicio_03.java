package Exercicios.Aula_01_13;

import java.util.Scanner;

// 3. Faça um Programa que peça dois números e imprima a soma. 

public class Exercicio_03 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		int numero1 = ler.nextInt();
		
		System.out.print("Informe o segundo número: ");		
		int numero2 = ler.nextInt();
		
		int resultado = numero1 + numero2;
		System.out.print("A soma é igual a " + resultado);
		
		
		ler.close();
	}
	
}
