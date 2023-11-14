package Algoritmo_33;

import java.util.Scanner;

public class LerEImprimirDoisNumeros {

	public static void main(String[] args) {
		int num1, num2;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor ");
		 	num1 = ler.nextInt();
		 
		System.out.println("Informe o segundo valor ");
			num2 = ler.nextInt();
		
		System.out.println("O primeiro valor informado foi o " + num1 + " e o segundo foi o " + num2 );
	}

}
