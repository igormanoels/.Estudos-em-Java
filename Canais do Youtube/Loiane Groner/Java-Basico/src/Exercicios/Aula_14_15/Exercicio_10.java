package Exercicios.Aula_14_15;

import java.util.Scanner;

/* 10. Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino, V-Vespertino ou 
 * N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!". Conforme o caso.
 */

public class Exercicio_10 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		char dia;
		
		System.out.print("Informe o turno em que você estuda"
				+ "\nEscolha uma opção - M-Matutino, V-Vespertino ou N-Noturno\n"
				+ "Digite a opção desejada: ");
		dia = ler.next().charAt(0);
		
		switch (dia) {
			case 'm': 
				System.out.println("Bom dia!");
				break;
			case 'v':
				System.out.println("Boa Tarde");
				break;
			case 'n':
				System.out.println("Boa Noite!");
				break;
			default:
				System.out.println("Valor inválido!");
				break;
		}
		
		
		ler.close();
	}
	
}
