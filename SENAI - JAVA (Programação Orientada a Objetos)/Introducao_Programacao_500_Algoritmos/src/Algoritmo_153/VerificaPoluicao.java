package Algoritmo_153;

import java.util.Scanner;

public class VerificaPoluicao {
	static double indice;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê o índice de poluição e imprimi se as atividades serão suspensas.");

		System.out.print("Informe o índice de poluição: ");
			indice = ler.nextDouble();
		
		if (indice < 0.3) {
			System.out.print("\nÍndice de poluição aceitável.");
		} 
		else {
			if (indice < 0.4 ) {
				System.out.print("\nSuspender as atividades industriais do grupo 1.");
			} 
			else {
				if (indice < 0.5) {
					System.out.print("\nSuspender as atividades industriais dos grupos 1 e 2.");
				} 
				else {
					System.out.print("\nSuspender as atividades industriais dos grupos 1, 2 e 3.");
				}
			}
		}
		
		
		ler.close();
	}

}
