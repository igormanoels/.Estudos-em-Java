package Algoritmo_074;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcularQuantidadeSalariosMinimos {
	static double salmin, salario, quant;
	static String resFormatado;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat ("0.00");
		
		System.out.println("Algoritmo: Lê o salário mínimo e o atual e imprimi a quantidade de salários mínimos recebidos.");
		
		System.out.print("Informe o valor do salário minimo vigente: R$ ");
			salmin = ler.nextDouble();
		System.out.print("Informe o valor do seu salário: R$ ");
		 	salario = ler.nextDouble();
		 	
		double res = calcquant(salmin,salario);
		resFormatado = formatar.format(res);
;			System.out.println("\nA quantidade de salarios minimos é " + resFormatado);
			
		ler.close();		
	}
	
	static double calcquant(double salm, double sal) {
		quant = (sal/salm);
		return quant;
	}
}
