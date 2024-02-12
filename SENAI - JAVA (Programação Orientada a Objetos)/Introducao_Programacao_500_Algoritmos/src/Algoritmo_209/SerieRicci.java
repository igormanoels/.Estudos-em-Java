package Algoritmo_209;

import java.util.Scanner;

public class SerieRicci {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê os dois números do usuário e imprime a série de Ricci.");
		
		System.out.print("Informe quantos termos serão representados: ");
		var quant = ler.nextInt();
		
		int [] ricci = new int[quant];
		
		System.out.print("Favor informar o primeiro termo: ");
		ricci[0] = ler.nextInt();
		System.out.print("Favor informar o segundo termo: ");
		ricci[1] = ler.nextInt();
		
		if (quant > 2) {
			for (int i = 2; i < ricci.length; i++) 
			{
				ricci[i] = ricci[i-1] + ricci[i-2];
			}
			
			System.out.print("Série de Ricci: ");
			for (int i = 0; i < ricci.length; i++) 
			{
				System.out.print(ricci[i] + " ");
			}
		}
		else
		{
			System.out.print("Não existem série para os valores informados.");
		}
		
		
		ler.close();
	}

}
