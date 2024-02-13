package Algoritmo_225;

import java.util.Scanner;

public class SeparadorDeLetrasDeTras {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê uma palavra e imprime a palavra de trás pra frente até completar a palavra.");
		
		System.out.print("Favor informar a palavra desejada: ");
		var nome = ler.nextLine();
		
		System.out.println("Palavra informada: " + nome);
		
		for (int i = nome.length(); i >= 0; i--) {
			System.out.println(nome.substring(i));
		}
		
		
		ler.close();
	}

}
