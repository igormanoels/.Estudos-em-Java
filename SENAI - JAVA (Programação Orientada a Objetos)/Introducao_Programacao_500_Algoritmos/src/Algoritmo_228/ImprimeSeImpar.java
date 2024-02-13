package Algoritmo_228;

import java.util.Scanner;

public class ImprimeSeImpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê uma palavra e imprime se for impar conforme regra.");
		
		System.out.print("Favor informar a palavra desejada: ");
		var nome = ler.nextLine().toUpperCase();
		
		if (nome.length() % 2 != 0) 
		{
			System.out.println(nome.charAt(nome.length()/2));
			System.out.println(nome.substring((nome.length()/2) - 1, (nome.length()/2) + 2));
			System.out.println(nome.substring(0));
		} 
		else 
		{
			System.out.println("Não faço");
		}
		
		
		ler.close();
	}

}
