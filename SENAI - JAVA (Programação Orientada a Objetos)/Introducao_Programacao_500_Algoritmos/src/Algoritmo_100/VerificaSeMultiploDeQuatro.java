package Algoritmo_100;

import java.util.Scanner;

public class VerificaSeMultiploDeQuatro {
	static double num;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	
		do {
			System.out.println("Informe um número");
			num = ler.nextDouble();
		} while (num < 1000);
		
		num = num / 100;
		
		if (num % 4 == 0) {
			System.out.println("O número informado é múltiplo de 4");
		} else {
			System.out.println("O número informado não é múltiplo de 4");
		}
		
		ler.close();
	}

}
