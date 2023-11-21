package Algoritmo_67;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcularPrestacaoAtrasada {
	static double tempo, valor, taxa;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("###,###,###,###.00");
		
		System.out.println("Algoritmo: Lê tempo, parcela e taxa, e imprime o valor corrigido a pagar.");
		
		System.out.print("Informe a quantidade de dias de atraso: ");
		 	tempo = ler.nextDouble();
		System.out.print("Informe o valor da parcela: ");
		 	valor = ler.nextDouble();
		System.out.print("Informe a taxa de juros: ");
			taxa = ler.nextDouble();
		
		double novovalor =calcatraso(tempo, valor, taxa);
		String nvalorFormatado = formatar.format(novovalor);
			System.out.println("\nO valor corrigo a pagar é de R$ " + nvalorFormatado);
			
		ler.close();
	}
	
	static double calcatraso(double temp, double val, double tax) {
		double res = (valor+(valor*(taxa/100)*tempo));
		return res;
	}

}
