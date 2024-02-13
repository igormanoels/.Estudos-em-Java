package Algoritmo_223;

import java.util.Scanner;

public class SeparadorDeLetrasCat {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê uma palavra e imprime uma letra e vai adicionando uma até imprimir a palavra completa.");

		System.out.print("Favor informar a palavra desejada: ");
		var nome = ler.nextLine();
		
		System.out.println("Palavra informada: " + nome);
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.substring(0, i+1));
		}
		
	
		ler.close();
	}

}
