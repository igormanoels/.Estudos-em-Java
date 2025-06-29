package Aula_13.Exercicios;

import java.util.Scanner;

/* 11. Faça um Programa que peça 2 números inteiros e um número real. 
 * Calcule e mostre: 
 * 		a. o produto do dobro do primeiro com metade do segundo . 
 * 		b. a soma do triplo do primeiro com o terceiro. 
 * 		c. o terceiro elevado ao cubo. 
 */

public class Exercicio_11 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe 2 números inteiros e 1 real separados por espaço: ");
		int num1 = ler.nextInt();
		int num2 = ler.nextInt();
		float num3 = ler.nextFloat();
		
		System.out.println("a. o produto do dobro do primeiro com metade do segundo: " + (Math.pow(num1, 2) + (num2 / 2)));
		System.out.println("b. a soma do triplo do primeiro com o terceiro: " + ((num1 * 3) + num3));
		System.out.println("c. o terceiro elevado ao cubo: " + (Math.pow(num3, 3)));
		
		ler.close();
	}
	
}
