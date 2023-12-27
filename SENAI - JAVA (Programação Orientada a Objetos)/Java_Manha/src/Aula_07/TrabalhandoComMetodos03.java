package Aula_07;

import java.util.Scanner;

public class TrabalhandoComMetodos03 {
	static double numA, numB, numC;

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o valor de A");
		numA = ler.nextDouble();
		System.out.println("Informe o valor de B");
		numB = ler.nextDouble();
		System.out.println("Informe o valor de C");
		numC = ler.nextDouble();

		bhask(numA, numB, numC);
		ler.close();
	}

	static void bhask(double a, double b, double c) {
		double delta, x1linha, x2linha;

		delta = ((Math.pow(b, 2) - 4 * a * c));
		System.out.println("Delta = " + delta);

		x1linha = (-b + (Math.sqrt(delta)) / 2 * a);
		System.out.println("x1 linha = " + x1linha);
		x2linha = (-b - (Math.sqrt(delta)) / 2 * a);
		System.out.println("x2 linha = " + x2linha);
	}

}
