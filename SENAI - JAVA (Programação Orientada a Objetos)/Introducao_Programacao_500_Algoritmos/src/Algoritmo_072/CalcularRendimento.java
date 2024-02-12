package Algoritmo_072;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcularRendimento {
	static double deposit, tax, valor, valorTotal, rendimento;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("###,###,###,###.00");
		
		System.out.println("Algoritmo: Lê o depósito e a taxa e imprime o valor do rendimento e o valor total.");

		System.out.print("Informe o valor depositado: R$ ");
			deposit = ler.nextDouble();
		System.out.print("Informe a taxa de rendimento: ");
		 	tax = ler.nextDouble();	 	
		
		valorTotal = calcvalor(deposit, tax);
		rendimento = (valorTotal - deposit);

		String valorTFormatado = formatar.format(valorTotal);
			System.out.println("\nO valor corrigido é de R$ " + valorTFormatado);
		String rendFormatado = formatar.format(rendimento);
			System.out.println("O rendimento é de R$ " + rendFormatado);
				
		ler.close();
	}
	
	static double calcvalor(double dep, double tx) {
		double resp = (dep + ( dep * (tx/100)));
		return resp;
	}

}
