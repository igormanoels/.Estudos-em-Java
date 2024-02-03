package Algoritmo_190;

import java.util.Scanner;

public class EscolheModelo {

	public static void main(String[] args) {
		String [] nome = new String [20];
		String [] gen = new String [20];
		int [] idade = new int [20];
		int cont = 1;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê os dados de 20 pessoas e imprimi o nome se for um homem acima de 21 anos.");
		
		for (int i = 0; i <= 29; i++) {
			System.out.print("Informe o " + cont + "º nome: ");
			nome[i] = ler.nextLine();
			System.out.print("Informe também o gênero: ");
			gen[i] = ler.nextLine().toLowerCase();
			System.out.print("Agora por favor a idade: ");
			idade[i] = ler.nextInt();
			ler.nextLine();			
			cont++;
		}
		
		System.out.println("=========================================="
				+ "\nNome:\t\tIdade:\t\tGênero:"
				+ "\n==========================================");
		for (int i = 0; i <= 29; i++) {
			if (gen[i].equals("masculino") && idade[i] >= 21) {
				System.out.println(nome[i] + "\t\t" + idade[i] + "\t\t" + gen[i]);
			} 
		}
		System.out.println("==========================================");
		
		ler.close();
	}

}
