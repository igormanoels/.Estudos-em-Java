package Algoritmo_235;

import java.util.Scanner;

public class OmaiorEmenorEntreDez {

	public static void main(String[] args) {
		int num, maior = -999999999, menor = 999999999;
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê 10 números e imprime o maior e o menor.");
		
		for (int i = 0; i < 10 ; i++) 
		{
			System.out.print("Favor informar o " + (i+1) + "º número: ");
			num = ler.nextInt();
			maior = Math.max(maior, num);
			menor = Math.min(menor, num);
		}
		
		System.out.println("\nMaior: " + maior + "\t|\tMenor: " + menor);
		
		
		ler.close();
	}

}
