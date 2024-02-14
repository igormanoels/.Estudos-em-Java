package Algoritmo_238;

import java.util.Scanner;

public class CalcSerieComDiv {

	public static void main(String[] args) {
		float solu = 0;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê um número e imprime a função segundo a regra de cálculo com divisão.");
		
		System.out.print("Favor informar o número desejado: ");
		float num = ler.nextInt();
		var cont = num;
		
		for (int i = 1; i <= num; i++) {
			solu = solu + (1 / cont);
			cont--;
		}
		
		System.out.printf("\nResultado: %.2f", solu);
		
		
		ler.close();
	}

}
