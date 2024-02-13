package Algoritmo_224;

import java.util.Scanner;

public class SeparadorDeLetrasDeFrente {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê uma palavra e imprime a palavra completa em seguida vai retirando a última letra.");
		
		System.out.print("Favor informar a palavra desejada: ");
		var nome = ler.nextLine();
		
		System.out.println("Palavra informada: " + nome);
		
		for (int i = 0 ; i < nome.length(); i++) {
			System.out.println(nome.substring(0, nome.length()-i));
		}
		
		
		ler.close();
	}

}
