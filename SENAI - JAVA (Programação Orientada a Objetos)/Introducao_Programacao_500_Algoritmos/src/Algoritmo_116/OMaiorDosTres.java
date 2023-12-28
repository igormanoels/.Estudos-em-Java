package Algoritmo_116;

import java.util.Scanner;

public class OMaiorDosTres {
	static int num1, num2, num3;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê três números e imprimi o maior.");

		System.out.print("Informe o primeiro número: ");
			num1 = ler.nextInt();
		System.out.print("Informe o segundo número: ");
			num2 = ler.nextInt();
		System.out.print("Informe o terceiro número: ");
			num3 = ler.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("\nO maior número é: " + num1);
		} 
			else if (num2 > num1 && num2 > num3){
				System.out.print("\nO maior número é: " + num2);
			}
			else {
				System.out.print("O meior núumero é: " + num3);
			}
			
			
		ler.close();
	}

}
