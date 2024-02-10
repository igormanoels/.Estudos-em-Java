package Algoritmo_205;

import java.util.Scanner;

public class OMaiorDosInformados {

	public static void main(String[] args) {
		var max = -999999999; // O maior número negativo possível para uma variável do tipo inteiro
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê a quantidade de entradas, recebe os números e imprime o maior valor.");
		
		System.out.print("Gostaria de informar quantos números para ver qual o maior? ");
		var quant = ler.nextInt();
		
		int[] num = new int[quant];
		
		for (int i = 0; i < quant; i++) 
		{
			System.out.print("Favor informar o número desejado: ");
			num[i] = ler.nextInt();
		}
		
		System.out.print("\n" + quant + " valores lidos: ");
		
		for (int i = 0; i < num.length; i++) {
			max = Math.max(max, num[i]);
			System.out.print(num[i] + " ");
		}
		
		System.out.print("\nMaior valor: " + max);
		
		
		ler.close();
	}

}
