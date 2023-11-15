package Algoritmo_67;

import java.util.Scanner;

public class CalcularPrestacaoAtrasada {
	static double tempo, valor, taxa;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de dias de atraso");
		 	tempo = ler.nextDouble();
		System.out.println("Informe o valor da parcela");
		 	valor = ler.nextDouble();
		System.out.println("Informe a taxa de juros");
			taxa = ler.nextDouble();
		
		double novovalor =calcatraso(tempo, valor, taxa);
			System.out.println("O valor corrigo a pagar é de R$ " + novovalor);
	}
	
	static double calcatraso(double temp, double val, double tax) {
		double res = (valor+(valor*(taxa/100)*tempo));
		return res;
	}

}
