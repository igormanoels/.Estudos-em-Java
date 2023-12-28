package Algoritmo_104;

import java.util.Scanner;

public class VerificaIdadeESexo {

	public static void main(String[] args) {
		String sexo, nome;
		int idade;
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê o nome, idade e sexo e imprimi se aceito ou não.");
		
		System.out.print("Qual seu gênero? ");
			sexo = ler.nextLine();
		System.out.print("Informe seu Nome: ");
			nome = ler.nextLine();
		System.out.print("Olá " + nome + "! Qual sua idade? ");
			idade = ler.nextInt();
		
		if (sexo.equals("Feminino") || sexo.equals("feminino")) {
			if (idade >= 25) {
				System.out.print("\nParabéns " + nome + ", você foi aceita!");
			}
			else {
				System.out.print("\nInfelizmente é necessário ter 25 anos ou mais.");
			}
		} else{
			System.out.println("\nInfelizmente você não será aceito. Mas agradecemos sua participação.");
		}
		
			
		ler.close();
	}

}
