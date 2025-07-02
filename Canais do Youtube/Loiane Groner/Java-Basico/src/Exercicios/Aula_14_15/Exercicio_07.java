package Exercicios.Aula_14_15;

import java.util.Scanner;

// 7. Faça um Programa que leia três números e mostre o maior e o menor deles. 

public class Exercicio_07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num1, num2, num3, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
		
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
		
		if (num1 < num2) {
			if (num1 < num3) {
				menor = num1;
			} else {
				menor = num3;
			}
		} else if (num2 < num1){
			if (num2 < num3) {
				menor = num2;
			} else {
				menor = num3;
			}
		}
		
		ler.close();
	}
	
}
