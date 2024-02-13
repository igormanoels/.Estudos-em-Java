package Algoritmo_231;

import java.util.Scanner;

public class ContaAsLetras {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê uma palavra e imprime a letra e o número de cada uma.");
		
		System.out.print("Informe a palavra desejada: ");
		var nome = ler.nextLine();
		
		for (int i = 0; i < nome.length(); i++) 
		{
			System.out.println((i+1) + "- " + nome.charAt(i));
		}
		
		
		ler.close();
	}

}
