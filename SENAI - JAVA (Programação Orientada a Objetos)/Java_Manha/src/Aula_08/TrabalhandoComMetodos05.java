package Aula_08;

import java.util.Scanner;

public class TrabalhandoComMetodos05 {
	static double num1, num2;

	public static void main(String[] args) {
		double total;
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o primeiro número");
		num1 = ler.nextDouble();

		System.out.println("Informe o segundo número");
		num2 = ler.nextDouble();

		total = somar(num1, num2);
		/*
		 * envia os dados das variaveis para o metodos, e retorna o valor correspondente
		 * a operação
		 * já atribuindo para a variavel local, no qual será exibida
		 */
		System.out.println("Total:  " + total);
		ler.close();
	}

	static double somar(double valor1, double valor2) {
		double soma = (valor1 + valor2);
		return soma;
		// atenção para ao fazer o retorno não marcar () porque se não se torna uma
		// chamada de metodo

	}

}
