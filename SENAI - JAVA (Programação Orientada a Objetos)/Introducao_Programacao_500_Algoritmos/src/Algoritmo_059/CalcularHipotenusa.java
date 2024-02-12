package Algoritmo_059;

import java.util.Scanner;

public class CalcularHipotenusa {
	static double resp, cateto1, cateto2, hipot;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Algoritmo: Lê os valores dos catetos e imprime a Hipotenusa.");
		
		System.out.print("Informe o valor do primeiro cateto: ");
		 	cateto1 = ler.nextDouble();
		System.out.print("Informe o valor do segundo cateto: ");
		 	cateto2 = ler.nextDouble();
		 	
		resp = calchipot(); 	
		System.out.println("\nO valor da hipotenusa é " + hipot);
			
		ler.close();
	}
	
	static double calchipot() {
		hipot = (Math.sqrt((Math.pow(cateto1, 2) + Math.pow(cateto2, 2))));
		return hipot;
	}

}
