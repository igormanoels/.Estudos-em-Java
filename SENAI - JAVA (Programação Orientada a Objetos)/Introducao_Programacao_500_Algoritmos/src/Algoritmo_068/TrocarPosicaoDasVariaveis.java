package Algoritmo_68;

import java.util.Scanner;

public class TrocarPosicaoDasVariaveis {
	static double num1, num2;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Algoritmo: Lê dois valores e imprime em posição trocada.");
		
		System.out.print("Informe o primeiro valor: ");
		 	num1 = ler.nextDouble();
		System.out.print("Informe o segundo valor: ");
			num2 = ler.nextDouble();
		
		System.out.println("\nA posição 1: " + num1 + " e a posição 2: " + num2);

		double res1 = trocarposicao1(num2);
		double res2 = trocarposicao2(num1);
		System.out.println("A posição 1: " + res1 + " e a posição 2: " + res2);
		
		ler.close();
	}
	
	static double trocarposicao1(double va) {
		double resp1 = va;
		return resp1;
	}
	
	static double trocarposicao2(double vb) {
		double resp2 = vb;
		return resp2;
	}
	
}
