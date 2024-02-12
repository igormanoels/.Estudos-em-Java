package Algoritmo_207;

import java.util.Scanner;

public class OprodutoPelaSoma {

	public static void main(String[] args) {
		var res = 0;
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê o Multiplicando e Multiplicador, e imprime o produto pela soma.");
		
		System.out.print("Favor informar o Multiplicando: ");
		var mult = ler.nextInt();
		
		System.out.print("Favor infomar o Multiplicador: ");
		var multdr = ler.nextInt();
		do 
		{
			if (multdr < mult) 
			{
				System.out.print("\nO Multiplicador não pode ser menor: ");
				multdr = ler.nextInt();
			}
		} while (multdr < mult);
		
		for (int i = 1; i <= multdr; i++) {
			res = res + mult;
		}
		
		System.out.print("\nProduto: " + res);
		
		ler.close();
	}

}
