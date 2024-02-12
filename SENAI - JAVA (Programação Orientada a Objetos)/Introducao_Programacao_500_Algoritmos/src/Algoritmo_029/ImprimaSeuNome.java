package Algoritmo_029;

import java.util.Scanner;

public class ImprimaSeuNome {

	public static void main(String[] args) {
		String nome;
		
        System.out.println("Algoritmo: Lê e imprimi o nome do usuário.");
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe seu nome: ");
		nome = ler.nextLine();
			System.out.println("O nome digitado foi: " +nome);
		
		ler.close();
	}

}
