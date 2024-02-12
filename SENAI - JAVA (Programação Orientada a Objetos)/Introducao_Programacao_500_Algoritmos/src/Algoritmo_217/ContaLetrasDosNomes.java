package Algoritmo_217;

import java.util.Scanner;

public class ContaLetrasDosNomes {

	public static void main(String[] args) {
		int[] letrasNome = new int[8];
		String[] nomes = new String[8];
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê oito nomes e imprime a quantidade de letras que tem em cada nome.");
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.print("Favor informar o " + (i+1) + "º nome: ");
			nomes[i] = ler.nextLine();
			letrasNome[i] = nomes[i].length();
		}
		
		System.out.println("\nNomes\t\tQuant. de Letras");
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i] + "\t\t\t" + letrasNome[i]);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		ler.close();
	}

}
