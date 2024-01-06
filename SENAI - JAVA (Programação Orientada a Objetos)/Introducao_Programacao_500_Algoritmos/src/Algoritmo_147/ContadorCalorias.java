package Algoritmo_147;

import java.util.Scanner;

public class ContadorCalorias {
	static int op, calorias;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê as opções de refeição e imprimi o consumo calórico.");
		
		System.out.print("\nEscolha 3 pratos para sua refeição: Prato princiapal, Bebida e Sobremesa.");
		System.out.print("\nComo Prato principal escolha entre: "
				+ "\n  Digite 1 para Vegetáriano."
				+ "\n  Digite 2 para Peixe."
				+ "\n  Digite 3 para Frango."
				+ "\n  Digite 4 para Carne."
				+ "\nInforme a opção desejada: ");
		op = ler.nextInt();

		switch (op) {
			case 1: {
				calorias = calorias + 180;
				break;
			}
			case 2: {
				calorias = calorias + 230;
				break;
			}
			case 3: {
				calorias = calorias + 250;
				break;
			}
			case 4: {
				calorias = calorias +350;
				break;
			}
		default:
			System.out.print("\nOpção inválida, reinicie o programa.");
		}
		
		System.out.print("\nComo Bebida escolha entre: "
				+ "\n  Digite 1 para Chá."
				+ "\n  Digite 2 para Suco de Laranja."
				+ "\n  Digite 3 para Suco de Melão."
				+ "\n  Digite 4 para Refrigerante Diet."
				+ "\nInforme a opção desejada: ");
		op = ler.nextInt();

		switch (op) {
			case 1: {
				calorias = calorias + 20;
				break;
			}
			case 2: {
				calorias = calorias + 70;
				break;
			}
			case 3: {
				calorias = calorias + 100;
				break;
			}
			case 4: {
				calorias = calorias +65;
				break;
			}
		default:
			System.out.print("\nOpção inválida, reinicie o programa.");
		}
		
		System.out.print("\nComo Sobremesa escolha entre: "
				+ "\n  Digite 1 para Abacaxi."
				+ "\n  Digite 2 para Sorvete Diet."
				+ "\n  Digite 3 para Mousse Diet."
				+ "\n  Digite 4 para Mousse de Chocolate."
				+ "\nInforme a opção desejada: ");
		op = ler.nextInt();

		switch (op) {
			case 1: {
				calorias = calorias + 75;
				break;
			}
			case 2: {
				calorias = calorias + 110;
				break;
			}
			case 3: {
				calorias = calorias + 170;
				break;
			}
			case 4: {
				calorias = calorias + 200;
				break;
			}
		default:
			System.out.print("\nOpção inválida, reinicie o programa.");
		}
		
		System.out.print("O consumo total de calorias para a refeição desejada é de " + calorias + "cal");
		
		
		ler.close();
	}

}
