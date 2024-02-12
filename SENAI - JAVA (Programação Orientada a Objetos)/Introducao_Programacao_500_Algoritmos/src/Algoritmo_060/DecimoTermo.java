package Algoritmo_60;

import java.util.Scanner;

public class DecimoTermo {
	static double dec, razao, termo;
		
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Algoritmo: Lê o termo e a razão e imprime a Décimo termo da série.");
		
		System.out.print("Informe qual o termo: ");
			termo = ler.nextDouble();
		System.out.print("Informe qual a razão: ");
			razao = ler.nextDouble();
		
		dec = (termo + (9*razao));
			System.out.println("\nO Décimo termo desta P.A.: " + dec);
	
		ler.close();
	}

}
