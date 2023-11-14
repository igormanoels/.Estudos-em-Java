package Algoritmo_61;

import java.util.Scanner;

public class CalcularQuintoTermoPG {
	static double razao, termo;
	
	public static void main(String[] args) {
		double res = calcPG();
			System.out.println("O quinto termo para essa PG é " + res);
	}
	
	public static double calcPG() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor da razão");
			razao = ler.nextDouble();
		System.out.println("Informe o valor do termo");
			termo = ler.nextDouble();
		
		double calculo = (termo * (Math.pow(razao, 4)));
		return calculo;
		
	}
	
}
