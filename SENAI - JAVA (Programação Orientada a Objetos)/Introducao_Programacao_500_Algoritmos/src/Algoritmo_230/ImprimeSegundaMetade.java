package Algoritmo_230;

import java.util.Scanner;

public class ImprimeSegundaMetade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê uma palavra e imprime a segunda metade da palavra.");
		
		System.out.print("Favor informar a palavra desejada: ");
		var nome = ler.nextLine();
		var meio = nome.length() / 2;
		
		if (nome.length() % 2 == 0)
		{
			for (int i = meio; i < nome.length(); i++) {
				System.out.print(nome.charAt(i));
			}
		}
		else
		{
			System.out.println("Não faça.");
		}
		ler.close();
	}

}
