package Algoritmo_057;

import java.util.Scanner;

public class CalculaMediaArredondadaETruncada {
		static double truncada, arredondada, n1, n2;
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Algoritmo: Lê duas notas e imprime a Média Truncada e Arredondada.");
		
		System.out.print("Informe a primeira nota: ");
		 	n1 = ler.nextDouble();
		System.out.print("Informe a segunda nota: ");
		 	n2 = ler.nextDouble();
		
		 arredondada = (Math.round(n1 + n2) / 2);
		 	System.out.println("\nMédia Arredondada: " + arredondada);
		 truncada = (((n1 * 0.9)+(n2 * 0.9)) /2);
		 	System.out.println("Média Truncada: " + truncada);
				
		ler.close();
	}

}
