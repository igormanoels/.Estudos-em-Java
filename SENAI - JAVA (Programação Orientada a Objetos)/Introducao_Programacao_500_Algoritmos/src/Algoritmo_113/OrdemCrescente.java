package Algoritmo_113;

import java.util.Scanner;

public class OrdemCrescente {
	static int num1, num2;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê dois números e imprimi em ordem crescente.");

		System.out.print("Informe o primeiro número: ");
			num1 = ler.nextInt();
		System.out.print("Informe o segundo número: ");
			num2 = ler.nextInt();
		
		if (num1 == num2) {
			System.out.print("\nOs números informado são iguais.");
		} 
			else if (num1 < num2){
				System.out.print("\nEm ordem: " + num1 + ", " + num2 + ".");
			}
			else {
				System.out.print("\nEm ordem: " + num2 + ", " + num1 + ".");
			}
			
		
		ler.close();
	}

}
