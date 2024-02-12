package Algoritmo_092;

import java.util.Scanner;

public class SomaOitoSubtraiCinco {
	static int valor1, valor2, soma;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor");
			valor1 = ler.nextInt();
		System.out.println("Informe o segundo valor");
		 	valor2 = ler.nextInt();
		 	
		soma = valor1 + valor2;
		
		if (soma > 20) {
			soma = soma + 8;
			System.out.println("Resultado: " + soma);
		} else {
			soma = soma - 5;
			System.out.println("Resultado: " + soma);
		}
		
		
		ler.close();
	}

}
