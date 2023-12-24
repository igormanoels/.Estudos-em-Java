package Algoritmo_79;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculaMontanteParaAplicacao {
	static double valor, montante, taxa, tempo;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("###,###,###.00");
		System.out.println("Algoritmo: Lê taxa, tempo e aplicação e imprimi o montante.");
		
		System.out.print("Informe o valor a ser aplicado: R$ ");
			valor = ler.nextDouble();
		System.out.print("Informe o tempo da aplicação em meses: ");
			tempo = ler.nextInt();
		System.out.print("Informe a taxa a qual a aplicação está sujeita: ");
			taxa = ler.nextDouble();
			
		montante = calcmontante(valor, tempo, taxa);
		String montanteFormatado = formatar.format(montante);
		System.out.println("\nO montante para essa aplicação será de: R$ " + montanteFormatado);
		
		ler.close();
	}
	
	static double calcmontante(double c, double t, double i) {
		double m; 			
		// Fórmula que eu conheço 
		//m = (c * (Math.pow( 1 + (i/100),t)));
		//
		//Fórmula do livro
		i = (i/100);
		m = (c *(((Math.pow((1+i), t)-1)/i)));
		return m;
	}

}
