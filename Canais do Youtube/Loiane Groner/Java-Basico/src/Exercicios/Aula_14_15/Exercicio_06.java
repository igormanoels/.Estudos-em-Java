package Exercicios.Aula_14_15;

import java.util.Scanner;

// 6. Faça um Programa que leia três números e mostre o maior deles. 

public class Exercicio_06 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num1, num2, num3, maior = 0;
		
		System.out.print("Informe 3 números inteiros separados por espaço: ");
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		num3 = ler.nextInt();
		
		if (num1 > num2) {
			if (num1 > num3) {
				maior = num1;
			} else {
				maior = num3;
			}
		} else if (num2 > num1){
			if (num2 > num3) {
				maior = num2;
			} else {
				maior = num3;
			}
		} 
		
		
		System.out.println("O maior número é " + maior);
		
		ler.close();
	}
	
}
