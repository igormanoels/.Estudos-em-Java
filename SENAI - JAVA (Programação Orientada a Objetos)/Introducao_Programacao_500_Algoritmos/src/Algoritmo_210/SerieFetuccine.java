package Algoritmo_210;

import java.util.Scanner;

public class SerieFetuccine {

	public static void main(String[] args) {
		int [] fetu = new int[10];
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê os dois números do usuário e imprime 10 termos da série de Fetuccine.");
		
		System.out.print("Favor informar o primeiro termo: ");
		fetu[0] = ler.nextInt();
		System.out.print("Favor informar o segundo termo: ");
		fetu[1] = ler.nextInt();
		
		for (int i = 2; i < fetu.length; i++) 
		{
			if (i % 2 == 0) 
			{
				fetu[i] = fetu[i-1] - fetu[i-2];
			}
			else
			{
				fetu[i] = fetu[i-1] + fetu[i-2];
			}
		}
		
		System.out.print("\nSérie de Fetuccine: ");
		for (int i = 0; i < fetu.length; i++) 
		{
			System.out.print(fetu[i] + " ");
		}
		
		
		ler.close();
	}

}
