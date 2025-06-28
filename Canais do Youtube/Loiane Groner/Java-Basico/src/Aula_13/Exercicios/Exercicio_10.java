package Aula_13.Exercicios;

import java.util.Scanner;

// 10. Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit. 

public class Exercicio_10 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe a temperatura atual: ");
		double temp = ler.nextDouble();
		
		double fareh = ((temp * 9/5) + 32);
		
		System.out.printf("A temperatura convertida para Farenheit é %.1f", fareh);
		
		
		ler.close();
	}
	
}
