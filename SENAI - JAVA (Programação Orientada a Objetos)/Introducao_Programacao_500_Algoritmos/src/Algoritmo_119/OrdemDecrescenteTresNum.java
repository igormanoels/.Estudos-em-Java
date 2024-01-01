package Algoritmo_119;

import java.util.Scanner;

public class OrdemDecrescenteTresNum {
	static int num1, num2, num3;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê três números e imprimi em ordem crescente.");
		
		System.out.print("Informe o primeiro número: ");
			num1 = ler.nextInt();
		System.out.print("Informe o segundo número: ");
			num2 = ler.nextInt();
		System.out.print("Informe o terceiro número: ");
			num3 = ler.nextInt();
/*
 * sequencia de eventos para teste de mesa
 * 1 2 3 
 * 1 3 2	
 * 2 1 3
 * 2 3 1
 * 3 1 2
 * 3 2 1
 */
		if (num1 == num2 || num1 == num3 || num2 == num3) {
			System.out.println("\nNúmeros repetidos não são permitidos");
		}
		
		if (num1 > num3 && num1 > num2 && num2 > num3) {
			System.out.println("\nOrdem: " + num1 + ", " + num2 + ", " + num3 + ".");
		}
			else if (num1 > num3 && num1 > num2 && num3 > num2) {
				System.out.println("\nOrdem: " + num1 + ", " + num3 + ", " + num2 + ".");
			}
			else if (num2 > num3 && num2 > num1 && num1 > num3) {
				System.out.println("\nOrdem: " + num2 + ", " + num1 + ", " + num3 + ".");
			}
			else if (num2 > num3 && num2 > num1 && num3 > num1) {
				System.out.println("\nOrdem: " + num2 + ", " + num3 + ", " + num1 + ".");
			}
			else if (num3 > num2 && num3 > num1 && num1 > num2) {
				System.out.println("\nOrdem: " + num3 + ", " + num1 + ", " + num2 + ".");
			}
			else if (num3 > num2 && num3 > num1 && num2 > num1) {
				System.out.println("\nOrdem: " + num3 + ", " + num2 + ", " + num1 + ".");
			}
				
			
		ler.close();
	}

}
