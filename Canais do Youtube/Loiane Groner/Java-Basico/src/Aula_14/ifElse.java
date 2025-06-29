package Aula_14;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = ler.nextInt();
		
		if (idade >= 18) {
			System.out.println("É maior de idade.");
		} else {
			System.out.println("Não é maior de idade.");
		}
		
		
		
		// Outro exemplo
		System.out.print("\n\nInforme o preço do produto: ");
		double valor = ler.nextDouble();
		
		if (valor <= 10) {
			System.out.println("Está barato, pode comprar.");
		} else if (valor > 10 && valor < 15) {
			System.out.println("Você pode pedir desconto.");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Pode pesquisar mais.");
		} else {
			System.out.println("Está muito caro.");
		}
		
		ler.close();
	}
	
}
