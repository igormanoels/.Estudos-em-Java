package Exercicios.Aula_14_15;

import java.util.Scanner;

/* 8. Faça um programa que pergunte o preço de três produtos e informe qual produto você 
 * deve comprar, sabendo que a decisão é sempre pelo mais barato. 
 */ 

public class Exercicio_08 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double preco1, preco2, preco3;
		
		System.out.println("Informe o valor do preço de 3 produtos, separados por espaço: ");
		preco1 = ler.nextDouble();
		preco2 = ler.nextDouble();
		preco3 = ler.nextDouble();
		
		if (preco1 < preco2 && preco1 < preco3) {
			System.out.println("O produto mais barato é o 1.");
		} else if (preco2 < preco1 && preco2 < preco3){
			System.out.println("O produto mais barato é o 2.");			
		} else {
			System.out.println("O produto mais barato é o 3.");
		}
	
		ler.close();
	}
	
}
