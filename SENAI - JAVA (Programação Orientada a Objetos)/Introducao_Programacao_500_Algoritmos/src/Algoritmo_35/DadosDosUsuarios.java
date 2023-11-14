package Algoritmo_35;

import java.util.Scanner;

public class DadosDosUsuarios {

	public static void main(String[] args) {
		String nome, endereco, telefone;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe seu nome");
		 	nome = ler.nextLine();
		System.out.println("Informe seu endereço");
			endereco = ler.nextLine();
		System.out.println("Informe seu telefone");
			telefone = ler.nextLine();
	
		System.out.println("Nome: " + nome);
		System.out.println("Endereço: " + endereco);
		System.out.println("Telefone: " + telefone);
			
	}

}
