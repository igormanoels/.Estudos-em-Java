package Algoritmo_47;

import java.util.Scanner;

public class UnidadeDezenaCentena {

	public static void main(String[] args) {
		int num, unid, deze, cent;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Informe um número");
			num = ler.nextInt();
		} while ( num < 100);
	
		cent = (num / 100);
			System.out.print("Centena: " + cent);
		deze = ((num % 100) / 10);
			System.out.print(", Centena: " + deze);
		unid = ((num % 100) % 10);
			System.out.print(", Unidade: " + unid);
	}

}
