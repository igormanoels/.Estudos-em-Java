package Algoritmo_061;

import java.util.Scanner;

public class CalcularQuintoTermoPG {
	static double razao, termo;

	public static void main(String[] args) {
		System.out.println("Algoritmo: Lê o termo e a razão e imprime o quinto termo da série.");

		double res = calcPG();
		System.out.println("\nO quinto termo para essa PG é " + res);
	}

	private static double calcPG() {
		Scanner ler = new Scanner(System.in);

		System.out.print("Informe o valor da razão: ");
		razao = ler.nextDouble();
		System.out.print("Informe o valor do termo: ");
		termo = ler.nextDouble();

		double calculo = (termo * (Math.pow(razao, 4)));
		return calculo;

	}

}
