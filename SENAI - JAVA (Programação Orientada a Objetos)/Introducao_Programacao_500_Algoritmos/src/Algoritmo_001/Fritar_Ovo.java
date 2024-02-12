package Algoritmo_01;

import java.util.Scanner;

public class Fritar_Ovo {
	public static void main(String[] args) {
		String resposta;
		System.out.println("Algoritmo para fritar um ovo");

		Scanner ler = new Scanner(System.in);

		do {
			System.out.println("Você já pegou a frigideira, ovo, óleo e o sal?");
			resposta = ler.nextLine();
			// ler.close();
		} while (resposta.equals("não"));

		System.out.println("Coloque o óleo na frigideira e acenda o fogo");

		System.out.println("Assim que o óleo esquentar coloque o ovo");

		System.out.println("Agora basta esperar ficar pronto");

		ler.close();
	}
}
