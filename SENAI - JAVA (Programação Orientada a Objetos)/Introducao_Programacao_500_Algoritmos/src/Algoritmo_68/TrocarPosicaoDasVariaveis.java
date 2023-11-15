package Algoritmo_68;

import java.util.Scanner;

public class TrocarPosicaoDasVariaveis {
	static double num1, num2;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor");
		 	num1 = ler.nextDouble();
		System.out.println("Informe o segundo valor");
			num2 = ler.nextDouble();
		
		System.out.println("A posição 1 tem o valor de " + num1 + " e a posição 2 o valor de " + num2);

		double res1 = trocarposicao1(num2);
		double res2 = trocarposicao2(num1);
		System.out.println("A posição 1 tem o valor de " + res1 + " e a posição 2 o valor de " + res2);

	}
	
	static double trocarposicao1(double valor) {
		double resp = valor;
		return resp;
	}
	
	static double trocarposicao2(double valor) {
		double resp = valor;
		return valor;
	}
	
}
