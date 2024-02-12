package Algoritmo_036;

import java.util.Scanner;

public class SomarValores {

	public static void main(String[] args) {
		int valor1, valor2, res;
		
		System.out.println("Algoritmo: Lê e imprime a soma entre dois valores.");
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor ");
			valor1 = ler.nextInt();
		System.out.print("Informe o segundo valor ");
		 	valor2 = ler.nextInt();
		
		res = (valor1 + valor2);
			System.out.println("Soma: " + res);
			
		ler.close();
	}

}
