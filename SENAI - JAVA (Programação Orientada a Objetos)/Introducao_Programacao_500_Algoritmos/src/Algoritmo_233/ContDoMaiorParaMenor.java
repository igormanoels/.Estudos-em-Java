package Algoritmo_233;

import java.util.Scanner;

public class ContDoMaiorParaMenor {

	public static void main(String[] args) {
		int maior, menor;
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê dois número e imprime os valores do menor para o maior.");
		
		System.out.print("Favor informar o primeiro número: ");
		var num1 = ler.nextInt();
		System.out.print("Favor informar o segundo número: ");
		var num2 = ler.nextInt();
		
		if (num1 < num2) 
		{
			menor = num1;
			maior = num2;
		} 
		else 
		{
			menor = num2;
			maior = num1;
		}
		
		System.out.print("Contando... ");
		for (int i = menor; i <= maior; i++) 
		{
			System.out.print(i + " ");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
		
		
		ler.close();
	}

}
