package Aula_05;

import java.util.Scanner;

public class Operadores_Aritimeticos_Multiplicacao {

	public static void main(String[] args) {
		double valor1, valor2, res;
		boolean status;

		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o primeiro valor");
		valor1 = ler.nextDouble();

		System.out.println("Informe o segundo valor");
		valor2 = ler.nextDouble();

		res = valor1 * valor2;
		System.out.println("A multiplicação entre os valores é " + res);

		status = valor1 >= valor2;
		System.out.println("O status do primeiro valor ser maior ou igual " + status);

		ler.close();
	}

}
