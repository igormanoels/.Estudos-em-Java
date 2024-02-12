package Algoritmo_32;

import java.util.Scanner;

public class LerEImprimirNumero {

	public static void main(String[] args) {
		int num;

		System.out.println("Algoritmo: Lê e imprime um valor do usuário.");
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe um valor ");
			num = ler.nextInt();
		System.out.println("O número informado foi o " + num);
		
		ler.close();
	}

}
