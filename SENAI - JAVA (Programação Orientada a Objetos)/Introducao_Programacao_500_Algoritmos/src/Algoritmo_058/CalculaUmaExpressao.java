package Algoritmo_058;

import java.util.Scanner;

public class CalculaUmaExpressao {
	static double num1, num2, num3, res;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Algoritmo: Lê 3 valores e imprime o resultado de uma Expressão.");
		
		System.out.print("Informe o primeiro valor: ");
		 	num1 = ler.nextDouble();
		System.out.print("Informe o segundo valor: ");
		 	num2 = ler.nextDouble();
		System.out.print("Informe o terceiro valor: ");
		 	num3 = ler.nextDouble();
		
		res = calcExpressao(num1, num2, num3);
			System.out.println("\nResultado: " + res);
		
		ler.close();
	}

	static double calcExpressao(double a, double b, double c) {
		double calc = ( a + (b / (c + a)) + (2 * (a - b)) + (Math.log(64) / Math.log(2)));
		return calc;
	}
	

}
