package Algoritmo_047;

import java.util.Scanner;

public class UnidadeDezenaCentena {

	public static void main(String[] args) {
		int num, unid, deze, cent;
		
		System.out.println("Algoritmo: Lê um número e imprime a Centena, Dezena e Unidade.");
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.print("Informe um número ");
			num = ler.nextInt();
		} while ( num < 100);
	
		cent = (num / 100);
			System.out.print("Centena: " + cent);
		deze = ((num % 100) / 10);
			System.out.print(", Dezena: " + deze);
		unid = ((num % 100) % 10);
			System.out.print(", Unidade: " + unid);
			
		ler.close();
	}

}
