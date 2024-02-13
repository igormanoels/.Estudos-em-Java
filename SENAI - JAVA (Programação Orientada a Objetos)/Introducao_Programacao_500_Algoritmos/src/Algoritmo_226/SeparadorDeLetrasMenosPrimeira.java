package Algoritmo_226;

import java.util.Scanner;

public class SeparadorDeLetrasMenosPrimeira {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê uma palavra e imprime ela removendo da primeira em diante.");
		
		System.out.print("Informe a palavra desejada: ");
		var nome = ler.nextLine();
		
		System.out.println("Palavra Informada: " + nome);
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.substring(i));
		}
		ler.close();
	}

}
