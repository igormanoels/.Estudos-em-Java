package Algoritmo_220;

import java.util.Scanner;

public class RepeteNomeNaQuantDeLetras {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê um nome e imprime conforme a quantidade de letras.");
		
		System.out.print("Favor informar um nome: ");
		var nome = ler.nextLine();
		var quant = nome.length();
		
		for (int i = 0; i < quant; i++) {
			System.out.println((i+1) + " - " + nome);
		}
		
		
		ler.close();
	}

}
