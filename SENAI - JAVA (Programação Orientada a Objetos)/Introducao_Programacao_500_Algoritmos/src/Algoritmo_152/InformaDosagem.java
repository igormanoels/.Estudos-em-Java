package Algoritmo_152;

import java.util.Scanner;

public class InformaDosagem {
	static int idade, dose;
	static double peso;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê o peso e a idade e imprimi a dose em gotas para o paciente.");

		System.out.print("Informe a idade do paciente: ");
			idade = ler.nextInt();
		System.out.print("Agora informe o peso do paciente: ");	
			peso = ler.nextDouble();
			
			
		if (idade < 12) {
			if (peso < 5 ) {
				System.out.print("\nNão há dose indicada desse medicamento para esse paciente es questão."
						+ "\nFavor buscar orientação do pediatra que acompanha seu tratamento.");
			} 
			else if ( peso >= 5 || peso <= 9) {
				dose = 125 / 20;
				System.out.print("\nA dose indicada é de " + dose + " gotas.");
			}
			else if ( peso > 9 || peso <= 16) {
				dose = 250 / 20;
				System.out.print("\nA dose indicada é de " + dose + " gotas.");
			}
			else if ( peso > 16 || peso <= 24) {
				dose = 375 / 20;
				System.out.print("\nA dose indicada é de " + dose + " gotas.");
			}
			else if ( peso > 24 || peso <= 30) {
				dose = 500 / 20;
				System.out.print("\nA dose indicada é de " + dose + " gotas.");
			}
			else if ( peso > 30) {
				dose = 750 / 20;
				System.out.print("\nA dose indicada é de " + dose + " gotas.");
			}
		} 
		else {
			if (peso > 60) {
				dose = 1000 / 20;
				System.out.print("\nA dose indicada é de " + dose + " gotas.");
			} 
			else {
				dose = 875 / 20;
				System.out.print("\nA dose indicada é de " + dose + " gotas.");
			}
		}
		
		
		ler.close();
	}

}
