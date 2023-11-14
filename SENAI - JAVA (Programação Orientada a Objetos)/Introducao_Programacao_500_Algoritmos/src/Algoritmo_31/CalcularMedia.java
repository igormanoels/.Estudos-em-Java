package Algoritmo_31;

import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		double valor1, valor2, valor3, res;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor ");
		valor1 = ler.nextDouble();
		
		System.out.println("Informe o segundo valor ");
		valor2 = ler.nextDouble();
		
		System.out.println("Informe o terceiro valor");
		valor3 = ler.nextDouble();
		
		res = (( valor1 + valor2 + valor3) / 3);
			System.out.println("A média dos três valores é " + res);
		
	}

}
