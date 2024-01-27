package Algoritmo_164;

import java.util.Scanner;

public class ContadorTempo {

	public static void main(String[] args) {
		int tempo;
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê o tempo em segundo e imprimi sua contagem.");
		
		System.out.print("Por favor informe o tempo desejado em segundos: ");
		tempo = ler.nextInt();
		
		System.out.println("Iniciando: ");
		for (int i = 0; i <= tempo; i++) {
			System.out.println(i + " seg");
			
			try {
				Thread.sleep(1000); // tempo contado em milisegundos
			} catch (Exception e) {
				e.printStackTrace();
			} // temporizado para contar os segundos
		}
		
		ler.close();
	}

}
