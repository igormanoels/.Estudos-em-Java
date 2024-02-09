package Algoritmo_193;

import java.util.Scanner;

public class RetornaNumPares {

	public static void main(String[] args) {
		var num = 2; 
		var cont = 1;
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê um número e imprime a quantidade equivalente de números pares a partir de 2.");
		
		System.out.print("Informe a quantidade de números: ");
		var quant = ler.nextInt();
		
		System.out.print("Contando... ");

		do 
		{
			System.out.print(num + " ");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
			num+=2;
			cont+=1;
		} while(cont <= quant);
		
		ler.close();
	}

}
