package Algoritmo_111;

import java.util.Scanner;

public class RetornaOMaior {
	static int num1, num2;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê dois números e imprimi o maior.");
		
		System.out.print("Informe o primeiro número: ");
			num1 = ler.nextInt();
		System.out.print("Informe o segundo número: ");
			num2 = ler.nextInt();
		
		if (num1 == num2) {
			System.out.print("\nOs números são iguais.");
		} 
			else if (num1 > num2){
				System.out.print("\nO maior " + num1);
			}
			else {
				System.out.print("\nO maior " + num2);
			}
		
		
		ler.close();
	}

}
