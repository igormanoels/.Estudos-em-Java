package Algoritmo_69;

import java.util.Scanner;

public class RecebeNumeradorEDenominador {
	static double numerador, denominador;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Algoritmo: Lê o numerador e denominador e imprime um número decimal.");

		System.out.print("Informe o numerador para o cálculo: ");
		 	numerador = ler.nextDouble();
		System.out.print("Informe o denominador para o cálculo: ");
		 	denominador = ler.nextDouble();
		
		double res = calcoperacao(numerador, denominador);
			System.out.println("\nO resultado é " + res);
		
		ler.close();
	}
	
	static double calcoperacao(double a, double b) {
		double resp = (a/b);
		return resp;
	}

}
