package Algoritmo_085;

import java.util.Scanner;

public class DescobreOMaior {
		static int num1, num2, num3, maior;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê 3 números e imprimi qual o maior.");
		
		System.out.print("Informe o primeiro número: ");
			num1 = ler.nextInt();
		System.out.print("Informe o segundo número: ");
			num2 = ler.nextInt();
		System.out.print("Informe o terceiro número: ");	
			num3 = ler.nextInt();
		
		if (num1 == num2 || num1 == num3 || num2 == num3) {
			System.out.println("\nErro!!! Não é permito números iguais, inicie novamente o programa.");
		}
			else if (num1 > num2) {
				if (num1 > num3) {
					System.out.print("\nO " + num1 + " é o maior número.");
				}
				else {
					System.out.print("\nO " + num3 + " é o maior número");
				}
			}
			else if (num2 > num1) {
				if (num2 > num3) {
					System.out.print("\nO " + num2  + " é o maior número");
				}
				else {
					System.out.print("\nO " + num3 + " é o maior número");
				}
			}
		
		ler.close();
	}

}
