package Algoritmo_43;

import java.util.Scanner;

public class LogaritmoBaseDez {

	public static void main(String[] args) {
		double log;
		
		System.out.println("Algoritmo: Lê um valor e imprime o seu logaritmo na base 10.");
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe um valor ");
			log = ler.nextDouble();
		
		log = (Math.log10(log));
			System.out.println("\nLog base 10: " + log);
		
		ler.close();
	}

}
