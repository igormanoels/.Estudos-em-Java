package Algoritmo_37;

import java.util.Scanner;

public class ProdutoDeDoisNumeros {

	public static void main(String[] args) {
		int valor1, valor2, res;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número");
		valor1 = ler.nextInt();
		
		System.out.println("Informe o segundo número");
		valor2 = ler.nextInt();
		
		res = (valor1 * valor2);
			System.out.println("O produto dos valores informado é " + res);
			
		
		
		
		
	}

}
