package Aula_13.Exercicios;

import java.util.Scanner;

// 6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área. 

public class Exercicio_06 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o valor do raio: ");
		double raio = ler.nextDouble();
		
		double circulo = (Math.PI * (Math.pow(raio, 2)));
		
		System.out.printf("A área do circulo é %.2f", circulo);
		
		
		ler.close();
	}
	
}
