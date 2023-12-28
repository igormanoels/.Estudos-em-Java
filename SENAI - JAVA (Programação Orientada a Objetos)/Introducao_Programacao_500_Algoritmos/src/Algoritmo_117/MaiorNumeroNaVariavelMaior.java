package Algoritmo_117;

import java.util.Scanner;

public class MaiorNumeroNaVariavelMaior {
	static int num1, num2, num3, maior;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê três números e imprimi o maior.");

		System.out.print("Informe o primeiro número: ");
			num1 = ler.nextInt();
		System.out.print("Informe o segundo número: ");
			num2 = ler.nextInt();
		System.out.print("Informe o terceiro número: ");
			num3 = ler.nextInt();
			
		if (num1 == num2 && num1 == num3 && num2 == num3) {
			System.out.print("\nOs números são iguais. Reinicie o programa!");
		} 
			else if (num1 > num2 && num1 > num3) {
				maior = num1;
			}
			else if (num2 > num1 && num2 > num3) {
				maior = num2;
			}
			else {
				maior = num3;
			}
		
		if (maior != 0) {
			System.out.print("\nO maior número é: " + maior );
		}	
			
		ler.close();
	}

}
