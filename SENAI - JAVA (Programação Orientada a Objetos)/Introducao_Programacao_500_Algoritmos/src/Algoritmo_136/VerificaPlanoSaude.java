package Algoritmo_136;

import java.util.Scanner;

public class VerificaPlanoSaude {
	static int idade;
	static String nome;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê a idade e o nome e imprimi preço do plano de saúde.");

		System.out.print("Por favor, informe seu nome: ");
		nome = ler.nextLine();
		System.out.print(nome + ", qual sua idade? ");
		idade = ler.nextInt();

		// A idade registrada para a pessoa mais velha do mundo foi de 122 anos
		if (idade < 0) {
			System.out.println("\nIdade inválida.");
		} 
		else {
			if (idade <= 10) {
				System.out.print("\nO plano para " + nome + ", irá custar R$ 30,00.");
			}
			else if (idade <= 29) {
				System.out.print("\nO plano para " + nome + ", irá custar R$ 60,00.");
			}
			else if (idade <= 45) {
				System.out.print("\nO plano para " + nome + ", irá custar R$ 120,00.");
			}
			else if (idade <= 59) {
				System.out.print("\nO plano para " + nome + ", irá custar R$ 150,00.");
			}
			else if (idade <= 65) {
				System.out.print("\nO plano para " + nome + ", irá custar R$ 250,00.");
			}
			else if (idade <= 125) {
				System.out.print("\nO plano para " + nome + ", irá custar R$ 400,00.");
			}
			else {
				System.out.println("\nIdade inválida.");
			}
		}

		
		ler.close();
	}

}
