package Algoritmo_202;

import java.util.Scanner;

public class IntervaloComMultiplos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê um número e imprime os múltiplos de 3 e 5 a partir de 1.");
		
		System.out.print("Favor infomar até onde se deve contar: ");
		var lim = ler.nextInt();
		
		System.out.print("\nNúmeros múltiplos de 3 e 5: ");
		
		for (int i = 1; i <= lim; i++) {
			if (i % 3 == 0 & i % 5 == 0) {
				System.out.print(i + " ");
			}
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		ler.close();
	}

}
