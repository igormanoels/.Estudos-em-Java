package Algoritmo_37;

import java.util.Scanner;

public class ProdutoDeDoisNumeros {

	public static void main(String[] args) {
		int valor1, valor2, res;
		
		System.out.println("Algoritmo: Lê e imprime o produto entre dois valores.");
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número ");
			valor1 = ler.nextInt();
		System.out.print("Informe o segundo número ");
			valor2 = ler.nextInt();
		
		res = (valor1 * valor2);
			System.out.println("Produto: " + res);
		
		ler.close();
	}

}
