package Algoritmo_033;

import java.util.Scanner;

public class LerEImprimirDoisNumeros {

	public static void main(String[] args) {
		int num1, num2;

		System.out.println("Algoritmo: Lê e imprime dois números informados pelo usuário.");
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor ");
		 	num1 = ler.nextInt();
		System.out.println("Informe o segundo valor ");
			num2 = ler.nextInt();
		
		System.out.println("O primeiro valor informado foi o " + num1 + " e o segundo foi o " + num2 );
		ler.close();
	}

}
