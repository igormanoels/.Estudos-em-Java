package Algoritmo_74;

import java.util.Scanner;

public class CalcularQuantidadeSalariosMinimos {
	static double salmin, salario, quant;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o valor do salário minimo vigente");
			salmin = ler.nextDouble();
		System.out.println("Informe o valor do seu salário");
		 	salario = ler.nextDouble();
		 	
		double res = calcquant(salmin,salario);
			System.out.println("A quantidade de salarios minimos é " + res);
		
	}
	
	static double calcquant(double salm, double sal) {
		quant = (sal/salm);
		return quant;
	}
}
