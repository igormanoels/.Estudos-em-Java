package Algoritmo_054;

import java.util.Scanner;

public class CalcAreaTriangulo {

	public static void main(String[] args) {
		double base, altura, area;
		
		System.out.println("Algoritmo: Lê a Base e Altura e imprime a Área de um Triângulo.");
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o valor da base");
			base = ler.nextDouble();
		System.out.println("Informe o valor da altura");
			altura = ler.nextDouble();
		
		area = ((base * altura) / 2);
			System.out.println("O valor da área é " + area);
			
		ler.close();
	}

}
