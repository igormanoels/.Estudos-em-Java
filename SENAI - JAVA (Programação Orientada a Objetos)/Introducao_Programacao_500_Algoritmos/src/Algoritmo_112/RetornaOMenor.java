package Algoritmo_112;

import java.util.Scanner;

public class RetornaOMenor {
	static int num1, num2;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê dois números e imprimi o menor.");
		
		System.out.print("Informe o primeiro número: ");
			num1 = ler.nextInt();
		System.out.print("Informe o segundo número: ");
			num2 = ler.nextInt();
		
			
		if (num1 == num2) {
			System.out.print("\nO números são iguais.");
		} 
			else if (num1 < num2){
				System.out.print("\nO menor é " + num1);
			}	
			else {
				System.out.print("\nO menor é " + num2);
			}
		
		
		ler.close();
	}

}
