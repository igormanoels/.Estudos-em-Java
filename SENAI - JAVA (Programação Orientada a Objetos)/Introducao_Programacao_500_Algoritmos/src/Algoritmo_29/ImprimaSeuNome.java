package Algoritmo_29;

import java.util.Scanner;

public class ImprimaSeuNome {

	public static void main(String[] args) {
		String nome;
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe seu nome: ");
		nome = ler.nextLine();
			System.out.println("O nome digitado foi: " +nome);
	}

}
