package Algoritmo_198;

import java.util.Scanner;

public class NumNaturaisDeUmIntervalo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê o limite inferior e o superior de um intervalo e imprime seus números naturais.");
		
		System.out.print("Favor informar o limite inferior: ");
		var limInf = ler.nextInt();
		System.out.print("Favor informar o limite superior: ");
		var limSup = ler.nextInt();
		
		System.out.print("\nContando... ");
		for (int i = limInf; i <= limSup; i++) 
		{
			if (i >= 0) {
				System.out.print(i + " ");
				
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		
		ler.close();
	}

}
