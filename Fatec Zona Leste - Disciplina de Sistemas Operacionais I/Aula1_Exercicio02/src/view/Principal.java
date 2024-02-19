package view;

import java.util.Scanner;
import controller.Controle;

public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Controle contador = new Controle();
		System.out.println("Algoritmo: Lê uma entrada do usuário e Imprime a quantidade de palavras.");
		
		System.out.print("Favor informar o texto desejado: ");
		var palavras = ler.nextLine();
		
		System.out.println("\nQuantidade de palavras do texto: " + contador.ContadorDePalavras(palavras));
		
		
		ler.close();
	}

}
