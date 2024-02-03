package Algoritmo_189;

import java.util.Scanner;

public class ConverTemps {

	public static void main(String[] args) {
		double [] fahr = new double[3];
		double [] cels = new double[3];
		int cont = 1;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê 3 temperaturas em Fahrenheit e imprimi sua conversão em Celcius.\n");
		
		for (int i = 0; i <=2 ; i++) {
			System.out.print("Favor informar a " + cont + "º temperatura em Fahrenheit: ");
			fahr[i] = ler.nextDouble();
			cels[i] = (( 5 * (fahr[i] - 32)) / 9);
			cont++;
		}
		
		System.out.println("\nFahrenheit \t Celsius");
		
		for (int i = 0; i <= 2; i++) {
			System.out.println(fahr[i] + " \t\t " + cels[i]);
		}
		
		
		
		
		ler.close();
	}

}
