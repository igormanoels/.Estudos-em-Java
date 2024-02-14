package Algoritmo_232;

import java.util.Scanner;

public class ContandoDoMenorParaMaior {

	public static void main(String[] args) {
		int maior, menor;
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê dois números e imprime uma contagem regressiva do maior ao menor.");
		
		
		System.out.print("Informe o primeiro número: ");
		var num1 = ler.nextInt();
		System.out.print("Informe o segundo número: ");
		var num2 = ler.nextInt();
		
		if (num1 > num2) 
		{
			maior = num1;
			menor = num2;
		}
		else
		{
			maior = num2;
			menor = num1;
		}
		
		System.out.print("Contando... ");
		for (int i = maior; i >= menor; i--) 
		{
			System.out.print(i + " ");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		ler.close();
	}

}
