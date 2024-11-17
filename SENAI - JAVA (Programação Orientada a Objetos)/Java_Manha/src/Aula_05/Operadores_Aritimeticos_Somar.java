package Aula_05;

import java.util.Scanner;

public class Operadores_Aritimeticos_Somar {

	public static void main(String[] args) {
		double valor1, valor2, res;
		boolean status;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
			valor1 = ler.nextDouble();
			
		System.out.println("Digite o segundo numero");
			valor2 = ler.nextDouble();
		
		res = valor1 + valor2;
			System.out.println("A soma dos valores é " + res);
		
		status = valor1 != valor2;
			System.out.println("Estado do valor se diferente = " + status);

		ler.close();
	}

}
