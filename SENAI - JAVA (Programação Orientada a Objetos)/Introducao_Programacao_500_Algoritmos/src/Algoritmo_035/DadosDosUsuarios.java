package Algoritmo_035;

import java.util.Scanner;

public class DadosDosUsuarios {

	public static void main(String[] args) {
		String nome, endereco, telefone;
		
		System.out.println("Algoritmo: Lê e imprime os dados do contato do usuário.");
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		 	nome = ler.nextLine();
		System.out.print("Informe seu endereço: ");
			endereco = ler.nextLine();
		System.out.print("Informe seu telefone: ");
			telefone = ler.nextLine();
	
		System.out.println("\nNome: " + nome);
		System.out.println("Endereço: " + endereco);
		System.out.println("Telefone: " + telefone);
			
		ler.close();
	}

}
