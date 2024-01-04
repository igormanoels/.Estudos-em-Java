package Algoritmo_139;

import java.util.Scanner;

public class VerificaSegundoTurno {
	static int votos, eleitores;
	static String municipio;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê o município e a quantidade de eleitores e imprimi se haverá segundo turno.");

		System.out.print("Informe o nome do município: ");	
			municipio = ler.nextLine();
		System.out.print("Informe a quantidade de eleitores aptos para votar: ");
			eleitores = ler.nextInt();
		System.out.print("Informe a quantidade de votos do primeiro colocado na eleição: ");
			votos = ler.nextInt();
			
			if (eleitores > 20000) {
				if (votos > (eleitores / 2) ) {
					System.out.print("\nO primeiro colocado na eleição à prefeiro para " + municipio + ", foi eleito em primeiro turno.");
				} 
					else {
						System.out.print("\nEm " + municipio + ", haverá segundo turno.");
					}
			}
				else {
					System.out.print("\nO primeiro colocado na eleição à prefeito para " + municipio + ", foi eleito em primeiro turno.");
				}
			
			
		ler.close();
	}

}
