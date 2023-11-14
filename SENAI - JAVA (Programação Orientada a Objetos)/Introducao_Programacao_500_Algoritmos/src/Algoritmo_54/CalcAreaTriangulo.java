package Algoritmo_54;

import java.util.Scanner;

public class CalcAreaTriangulo {

	public static void main(String[] args) {
		double base, altura, area;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o valor da base");
			base = ler.nextDouble();
			
		System.out.println("Informe o valor da altura");
			altura = ler.nextDouble();
		
		area = ((base * altura) / 2);
			System.out.println("O valor da área é " + area);
	}

}
