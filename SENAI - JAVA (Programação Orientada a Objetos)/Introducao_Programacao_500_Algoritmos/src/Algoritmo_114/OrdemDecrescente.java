package Algoritmo_114;

import java.util.Scanner;

public class OrdemDecrescente {
	static int num1, num2;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê dois números e imprimi em ordem decrescente.");

		System.out.print("Informe o primeiro número: ");
			num1 = ler.nextInt();
		System.out.print("Informe o segundo número: ");
			num2 = ler.nextInt();
			
			if (num1 == num2) {
				System.out.print("\nOs números informados são iguais.");
			} 
				else if(num1 > num2) {
					System.out.print("\nEm ordem: " + num1 + ", " + num2 + ".");
				}
				else {
					System.out.print("\nEm ordem: " + num2 + ", " + num1 + ".");
				}
			
			
		ler.close();
	}

}
