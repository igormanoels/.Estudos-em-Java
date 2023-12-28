package Algoritmo_108;

import java.util.Scanner;

public class PrimeiroNomeAlternado {
	static String nomeCompleto, primeiroNome;
	static int posicao;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê o nome completo do José e imprimi apenas o primeiro nome.");
		
		System.out.print("José, boa tarde! Informe seu nome completo: ");
			nomeCompleto = ler.nextLine();
		
		posicao = nomeCompleto.indexOf(" ");
		
		
		if (posicao != -1) {
			primeiroNome = nomeCompleto.substring(0, posicao);
			if (primeiroNome.equals("José") || primeiroNome.equals("josé")) {
			System.out.println("\nObrigado " + primeiroNome + ", seu cadastro foi atualizado!");
			}
				else {
				System.out.println("\nO nome fornecido não bate com o cadastro!");
			}
		}	
		
		
		ler.close();
	}

}
