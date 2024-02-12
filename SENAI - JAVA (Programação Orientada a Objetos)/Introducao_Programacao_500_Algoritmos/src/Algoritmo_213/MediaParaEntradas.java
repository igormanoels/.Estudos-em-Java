package Algoritmo_213;

import java.util.Scanner;

public class MediaParaEntradas {

	public static void main(String[] args) {
		var total = 0;
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê 12 números e imprime sua média.");
		
		for (int i = 1; i <= 12; i++) {
			System.out.print("Favor informar o " + i + "ºnúmero: " );
			var num = ler.nextInt();
			total = total + num;
		}
		
		System.out.println("\nMédia " + total/12);
		
		ler.close();
	}

}
