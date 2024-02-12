package Algoritmo_87;

import java.util.Scanner;

public class CapitalDoBrasil {
	
	public static void main (String[]args) {
		String resp;
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê a resposta do aluno e retorna se ele acertou.");
		
		System.out.print("Qual é a capital do Brasil?"
							+ "\nResposta: ");
			resp = ler.nextLine();
			
		if (resp.equals("Brasília")) {
			System.out.print("\nResposta correta! Parabéns continue assim!!!");
		} 
			else if (resp.equals("brasília") || resp.equals("Brasilia") || resp.equals("Brazilia") || resp.equals("Brazília") || 
					resp.equals("brasilia") || resp.equals("brasília") ) {
				System.out.print("\nVocê Mandou bem. Mas fique atento a ortográfica correta!");
			}
			else {
				System.out.print("\nResposta errada! Continue estudando mais, na próxima você vai acertar!");
			}
		/* 
		 * equals					---> é usado quando se quer comparar todos os caractéres do um texto
		 * equalsIgnoreCase() 		---> é usado quando se quer comparar o texto ignorando letras M ou m
		 * 
		 */
		
		ler.close();

	}
}
