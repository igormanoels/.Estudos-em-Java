package br.com.dio.Aula_001;

import java.util.Scanner;
/*
 * Escreva um código que recebe o tamanho do lado de um quadrado, calcule sua área e exiba na tela
 * 
 */

public class ex_002 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o valor do lado do quadrado: ");
		float lado = ler.nextFloat();
		
		float res = (float) Math.pow(lado, lado);
		System.out.printf("\n\nResultado: %s", res);
		
		ler.close();
	}
}
