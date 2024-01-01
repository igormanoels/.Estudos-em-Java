package Algoritmo_126;

import java.util.Scanner;

public class VerificaNumero {
	static int num;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê um números e imprimi se ele se encaixa no	escopo.");
		
		System.out.print("Informe um número: ");
			num = ler.nextInt();
			
		if (num >= 0 && num <= 1000) {
			if (num == 5 || num == 200 || num == 400) {
				System.out.print("\nO número informado é igual a um dos 3 números estabelecidos.");
			} 
				else {
					if (num >= 500 && num <= 1000) {
						System.out.print("\nO número informado está dentro do intervalo.");
					} 
						else {
							System.out.print("\nO número informado está fora do intervalo.");
						}
				}
		} 
			else {
				System.out.print("\nNão é aceito um número maior que 1000, reinicie o programa.");
			}
		
		
		
		ler.close();
	}

}
