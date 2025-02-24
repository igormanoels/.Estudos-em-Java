package br.com.dio.Aula_001;


import java.util.Scanner;
/*
 * Escreva um código que recebe a base e a altura de um retangulo, calcule sua área e exiba na tela
 * 
 */

public class ex_003 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe a base: ");
		float base = ler.nextFloat();
		
		System.out.print("Informe a altura: ");
		float altura = ler.nextFloat();
		
		float res = base * altura;
		System.out.printf("\n\nResultado: %s", res);
		
		
		ler.close();
	}
}
