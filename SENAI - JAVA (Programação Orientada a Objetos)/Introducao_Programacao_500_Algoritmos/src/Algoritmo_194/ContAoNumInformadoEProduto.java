package Algoritmo_194;

import java.util.Scanner;

public class ContAoNumInformadoEProduto {

	public static void main(String[] args) {
		int [] produto = new int[100];
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê um número e imprime a contagem de zero até ele e os produtos.");
		
		System.out.print("Informe um número e retornaremos uma contagem e o produto: ");
		var num = ler.nextInt();
		
		System.out.print("\nContagem\t\tProduto\n");
		
		for (int i = 1; i <= num ; i++) {
			produto[i] = (int) (Math.pow(i, 2));
			System.out.println(i + "\t\t\t" + produto[i]);
		}
		
		
		ler.close();
	}

}
