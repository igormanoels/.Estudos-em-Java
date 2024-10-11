package teste;

import java.util.Scanner;

/* Ler o ano atual e o ano de nascimento de uma pessoa. 
 * Escrever uma mensagem que diga se ela poderá ou não votar este ano 
 * (não ê necessário considerar o mês em que a pessoa nasceu).
 */

public class Questao10 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anoAtual, anoNasc, idade;

		System.out.print("Informe o ano em que você nasceu: ");
		anoNasc = ler.nextInt();
		
		System.out.print("Informe o ano atual: ");
		anoAtual = ler.nextInt();
		
		idade = anoAtual - anoNasc;
		
		if (idade < 16) {
			System.out.println("Você não poderá votar.");
		} else if (idade < 18) {
			System.out.println("Você poderá votar, mas não é obrigado.");
		} else {
			System.out.println("Você é obrigado a votar.");
		}
		
		ler.close();
	}
}
