package Algoritmo_090;

import java.util.Scanner;

public class ImprimeSeMaiorQueVinte {

	public static void main(String[] args) {
		int num;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Inform um número");
			num = ler.nextInt();
		
		if (num < 20) {
			System.out.println("O número informado é menor que 20.");
			
		} else if (num == 20) {
			System.out.println("O número informado é igual a 20.");
		} else {
			System.out.println("O número informado é maior que 20.");
		}
		
		ler.close();
	}

}
