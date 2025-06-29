package Exercicios.Aula_01_13;

import java.util.Scanner;

// 5. Faça um Programa que converta metros para centímetros. 

public class Exercicio_05 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um valor em metros: ");
		double metros = ler.nextDouble();
		
		double centimetros = metros * 100;
		
		System.out.printf("\n%f convertido em centimetros é %.2f", metros, centimetros);
		
		
		ler.close();
		
	}

}
