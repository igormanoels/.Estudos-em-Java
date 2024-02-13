package Algoritmo_227;

import java.util.Scanner;

public class ImprimeSeQuantImpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê uma palavra e imprime ela se a quantidade de letras for impar.");
		
		System.out.print("Favor informar a palavra desejada: ");
		var nome = ler.nextLine().toUpperCase();
		
		System.out.print("Palavra informada: " + nome + "\n");
		if (nome.length() % 2 != 0) 
		{
			System.out.println(nome.substring(0));
			System.out.println(nome.substring(1));
			System.out.println(nome.charAt(nome.length() / 2));
		} 
		else 
		{
			System.out.println("Não faço!");
		}
		
		
		ler.close();
	}

}
