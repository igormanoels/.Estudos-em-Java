package Algoritmo_83;

import java.util.Scanner;

public class NumeroInversoEAbsoluto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê um número e imprimi o seu inverso quando positivo, ou o absoluto.");
		
		System.out.print("Informe um número: ");
		int num = ler.nextInt();
		
		if(num == 0) {
			System.out.print("O número informado é zero, ele é absoluto.");
		}
			else if (num < 0) {
				num = (num * (- 1));
				System.out.print("\nO absoluto do número informado é: " + num);
			}
			else if (num > 0) {
				num = (num *(-1));
				System.out.print("\nO inverso do número informado é: " + num);
			}
			else {
				System.out.print("Erro!!! Inicie o programa novamente");
			}
		
		
		ler.close();
	}

}
