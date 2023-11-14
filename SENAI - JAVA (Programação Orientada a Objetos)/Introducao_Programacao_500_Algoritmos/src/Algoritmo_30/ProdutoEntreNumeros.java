package Algoritmo_30;

import java.util.Scanner;

public class ProdutoEntreNumeros {

	public static void main(String[] args) {
		double valor1, valor2, res;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor ");
		 	valor1 = ler.nextDouble();
		 	
		System.out.print("\nInforme o segundo valor ");
		  	valor2 = ler.nextDouble();
		  
		res = valor1 * valor2;
			System.out.println("\nO produto dos valores informado é " + res);
	}

}
