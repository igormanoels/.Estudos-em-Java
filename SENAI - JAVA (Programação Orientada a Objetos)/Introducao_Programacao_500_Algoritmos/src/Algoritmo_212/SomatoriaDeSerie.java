package Algoritmo_212;

import java.util.Scanner;

public class SomatoriaDeSerie {

	public static void main(String[] args) {
		var total = 0;
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê 20 números e imprime a somátoria dos números em que o seu quadrado não for maior que 225.");
	
		for (int i = 1; i <= 20; i++) {
			System.out.print("Informe o " + i + "º valor: ");
			var num = ler.nextInt();
			if (Math.pow(num, 2) < 225) {
				total = total + num;
			}
		}
	
		System.out.print("\nSomatória: " + total);
		
		ler.close();
	}

}
