package Algoritmo_073;

import java.util.Scanner;

public class InteiroFracaoArredondado {
	static double num,fracao, arredondado;
	static int inteiro; 
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê um número e imprimi o número inteiro, arredondado e a fração.");
		
		System.out.print("Informe um valor fracionado: ");
			num = ler.nextDouble();
			
		inteiro = (int) num;
			System.out.println("\nInteiro = " + inteiro);
		arredondado = (Math.round(num));
			System.out.println("Arredondamento = " + arredondado);
		fracao = (num - inteiro);
			System.out.println("Fracionado = " + fracao);
			
		ler.close();
	}

}
