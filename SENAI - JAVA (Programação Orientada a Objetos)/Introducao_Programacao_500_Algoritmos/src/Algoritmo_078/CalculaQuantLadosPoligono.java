package Algoritmo_078;

import java.util.Scanner;

public class CalculaQuantLadosPoligono {
	static double lados, ndiagonais;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê a quantidade de lados e imprimi o número de diagonais de um polígono.");
		
		System.out.print("Informe a quantidade de lados que o polígono possui: ");
			lados = ler.nextDouble();
		
		ndiagonais = (lados * (lados - 3) / 2);
			System.out.println("\nO número de diagonais para esse polígono é de: " + ndiagonais + " lados");
		//nd = n (n —3)! 2. 
		
		ler.close();
	}

}
