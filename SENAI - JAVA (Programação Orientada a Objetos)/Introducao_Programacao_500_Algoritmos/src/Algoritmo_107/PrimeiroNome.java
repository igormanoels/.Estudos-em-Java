package Algoritmo_107;

import java.util.Scanner;

public class PrimeiroNome {
	static String nomeCompleto, primeiroNome;
	static int posicao;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê o nome completo e imprimi apenas o primeiro nome.");
		
		System.out.print("Informe seu nome: ");
		nomeCompleto = ler.nextLine();
		posicao = nomeCompleto.indexOf(" ");
		
		if (posicao != -1) {
			primeiroNome = nomeCompleto.substring(0, posicao);
			System.out.println("Seu primeiro nome é " + primeiroNome);
		}
		else {
			System.out.println("Não há espaços no nome fornecido");
		}
		
		
		ler.close();
	}

}
