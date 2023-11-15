package Algoritmo_75;

import java.util.Scanner;

public class CalculadoraDePeso {
	static double peso, pesogram, novopeso;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o peso");
		 	peso = ler.nextDouble();
		
		double respesog = calcpesog(peso);
			System.out.println("Peso em gramas: " + respesog);
		
		double novopesog = calcnvpesog(respesog);
			System.out.println("Novo peso: " + novopesog);
	
	}
	
	static double calcpesog(double a) {
		double pesog = (a * 1000);
		return pesog;
	}
	
	static double calcnvpesog(double a) {
		double nvpeso = ((a * 1.12)/1000);
		return nvpeso;
	}
	
}
