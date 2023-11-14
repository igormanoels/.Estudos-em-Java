package Algoritmo_64;

import java.util.Scanner;

public class ConvertCentigEmFahr {
	
	public static void main(String[] args) {
		double f, c;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe a Temperatura atual");
		c = ler.nextDouble();
		
		f = calcfahr(c);
			System.out.println("A temperatura em Fahrenheit é " + f);
	}
	
	static double calcfahr(double temp) {
		double res;
		
		res = ((9 * temp + 160) / 5);
		return res;
	}

}
