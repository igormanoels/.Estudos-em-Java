package Algoritmo_64;

import java.util.Scanner;

public class ConvertCentigEmFahr {
	static double f, c;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Algoritmo: Lê a temperatura e imprime a conversão para Fahrenheit.");
		
		System.out.print("Informe a Temperatura atual: ");
			c = ler.nextDouble();
		
		f = calcfahr(c);
			System.out.println("\nA temperatura em Fahrenheit: " + f);
	
		ler.close();
	}
	
	static double calcfahr(double temp) {
		double res = ((9 * temp + 160) / 5);
		return res;
	}

}
