package Algoritmo_031;

import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		double valor1, valor2, valor3, res;
		
        System.out.println("Algoritmo: Lê 3 valores e imprime a média.");

		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor ");
			valor1 = ler.nextDouble();
		System.out.print("Informe o segundo valor ");
			valor2 = ler.nextDouble();
		System.out.print("Informe o terceiro valor ");
			valor3 = ler.nextDouble();
		
		res = (( valor1 + valor2 + valor3) / 3);
			System.out.println("A média dos três valores é " + res);

		ler.close();
	}

}
