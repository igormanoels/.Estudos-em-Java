package Aula_05;

import java.util.Scanner;

public class Operadores_Aritimeticos02 {

	public static void main(String[] args) {
		double valor_01;
		double valor_02;
		double total;
		boolean status;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um valor");
			valor_01 = ler.nextDouble();
		
		System.out.println("Digite outro valor");
			valor_02 = ler.nextDouble();

		total = valor_01 + valor_02;
			System.out.println("A soma é " + total);
		
		status = valor_01 > valor_02;
			System.out.println(status);
		// retorna true ou false após comparar os valores de entrada conforme a operação

	}

}
