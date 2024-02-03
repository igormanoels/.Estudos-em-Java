package Algoritmo_187;

import java.util.Scanner;

public class CalcFuncao {

	public static void main(String[] args) {
		int res, n, b;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê e imprimi o valor de \"B\" elevado a \"N\".");
		
		do 
		{
			System.out.print("Informe o valor de \"b\": ");
			b = ler.nextInt();
		} while (b < 2 || b % 1 == 0);
		
		do 
		{
			System.out.print("Informe o valor de \"n\": ");
			n = ler.nextInt();
		} while (n < 1 || n % 1 == 1 );
		
		res = (int) Math.pow(b, n);
		System.out.print("O valor para essa função é de: " + res);
		
		ler.close();
		
	}

}
