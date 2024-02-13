package Algoritmo_229;

import java.util.Scanner;

public class ImprimeAMetade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê uma palavra e imprime a primeira metade da palavra.");
		
		System.out.print("Favor informar a palavra desejada: ");
		var nome = ler.nextLine();
		
		if(nome.length() % 2 == 0)
		{
			var meio= (((int) nome.length()) / 2);
			
			for (int i = 0; i < meio; i++) 
			{
				System.out.print(nome.charAt(i));
				//System.out.println(nome.substring(nome.length() - i));
			}
		}
		else 
		{
			System.out.print("Não faço.");
		}
		
		
		ler.close();
	}

}
