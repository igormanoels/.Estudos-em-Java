package Algoritmo_65;

import java.util.Scanner;

public class CalcularVolume {
	static double resp, res, altura, raio;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Algoritmo: Lê altura e o raio. E imprime o Volume.");
		
		System.out.print("Informe o raio: ");
			raio = ler.nextDouble();
		System.out.print("Informe a altura: ");
			altura = ler.nextDouble();
		
		res = CalcVolume(raio, altura);
			System.out.println("\nVolume: " + res);
		
		ler.close();
	}
	
	static double CalcVolume(double a, double b) {
		resp = ((Math.PI * (Math.pow(a, 2)) * b ));
		return resp;
	}

}
