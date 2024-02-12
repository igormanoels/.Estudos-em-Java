package Algoritmo_44;

import java.util.Scanner;

public class CalculaLogaritmo {
	static double log, base;
	
	public static void main(String[] args) {
		System.out.println("Algoritmo: Lê um número e base. Depois imprime seu logaritmo.");
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("informe o valor para cálcular o logaritmo ");
		 	log = ler.nextDouble();
		System.out.print("Informe agora a base para o cálculo ");
		 	base = ler.nextDouble();
		
		log = (Math.log(log)/Math.log(base));
			System.out.println("\nLogaritmo: " + log);
		
		ler.close();	
	}

}
