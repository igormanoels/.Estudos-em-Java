package Algoritmo_075;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraDePeso {
	static double peso, pesogram, novopeso;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("0.00");
		System.out.println("Algoritmo: Lê o peso e imprimi em gramas e o novo peso 12% maior.");
		
		System.out.print("Informe o peso: ");
		 	peso = ler.nextDouble();
		
		double respesog = calcpesog(peso);
		String respesogFormatado = formatar.format(respesog);
			System.out.println("\nPeso em gramas: " + respesogFormatado + " gramas");
		
		double novopesog = calcnvpesog(respesog);
		String novopesogFormatado = formatar.format(novopesog);
			System.out.println("Novo peso: " + novopesogFormatado + "kg");
		
		ler.close();
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
