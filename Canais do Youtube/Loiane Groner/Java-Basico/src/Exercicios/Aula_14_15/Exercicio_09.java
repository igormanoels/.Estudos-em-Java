package Exercicios.Aula_14_15;

import java.util.Scanner;

// 9. Faça um Programa que leia três números e mostre-os em ordem decrescente.

public class Exercicio_09 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num1, num2, num3, maior = Integer.MIN_VALUE, menor = maior+1, meio = menor;
		
		System.out.print("Informe 3 números inteiros separados por espaço: ");
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		num3 = ler.nextInt();
		
		if (num1 > num2) {
			if (num1 > num3) {
				maior = num1;
				if (num2 > num3) {
					meio = num2;
					menor = num3;
				} else {
					meio = num3;
					menor = num2;
				}
			} else {
				maior = num3;
				meio = num1;
				menor = num2;
			}
		} else if (num2 > num1){
			if (num2 > num3) {
				maior = num2;
				if (num1 > num3) {
					meio = num1;
					menor = num3;
				} else {
					meio = num3;
					menor = num1;
				}
			} else {
				maior = num3;
				meio = num2;
				menor = num1;
			}
		}
		
		System.out.println("Ordem dos número: " + maior + " " + meio + " " + menor);

		
		
		ler.close();
	}
	
}
