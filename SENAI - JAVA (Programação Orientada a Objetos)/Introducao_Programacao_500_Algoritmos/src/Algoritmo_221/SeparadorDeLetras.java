package Algoritmo_221;

import java.util.Scanner;

public class SeparadorDeLetras {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê um nome e imprime as letras uma abaixo da outra.");
		
		System.out.print("Favor informar o nome desejado: ");
		var nome = ler.nextLine();
		
		char[] letras = new char[nome.length()];
		
		System.out.println("Nome informado: " + nome + "\n");
		for (int i = 0; i < letras.length; i++) 
		{
			letras[i] = nome.charAt(i);
			System.out.println(letras[i]);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		ler.close();
	}

}
