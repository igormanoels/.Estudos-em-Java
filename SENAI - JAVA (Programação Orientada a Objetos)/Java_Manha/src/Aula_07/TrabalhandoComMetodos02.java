package Aula_07;

import java.util.Scanner;

public class TrabalhandoComMetodos02 {

	public static void main(String[] args) {
		double num1, num2;
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o primeiro valor");
		num1 = ler.nextDouble();
		System.out.println("Informe o segundo valor");
		num2 = ler.nextDouble();

		somar(num1, num2);
		/*
		 * static void somar()
		 * quando o método vem sem a declaração quanto ao tipo de sua visibiliadde
		 * o método se torna torna publico, isso porque todo método é naturalmente
		 * público
		 */
		ler.close();
	}

	static void somar(double a, double b) {
		double res = a + b;
		System.out.println("Soma: " + res);
		/*
		 * o valor que entra na variavel via passagem de parametro é chamdo de
		 * assinatura
		 * de método, é a quantidade de parametros q indica qual metodo sera iniciado.
		 * Uma passagem
		 * de parametro com 3 variaveis chama um método que contém 3 variaveis quando o
		 * nome for o mesmo
		 * A ideia é ter uma sobrecarga de método, ou seja, um polimorfismo
		 */
	}

}
