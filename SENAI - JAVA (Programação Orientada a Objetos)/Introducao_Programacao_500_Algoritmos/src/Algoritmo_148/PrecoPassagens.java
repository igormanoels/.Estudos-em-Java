package Algoritmo_148;

import java.util.Scanner;

public class PrecoPassagens {
	static int op;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê a opção de destino e imprimi o valor de Ida e Ida/Volta.");
		
		System.out.print("\nAqui você pode consultar o preço da passagem para sua viagem ideal."
				+ "\n  Digite 1 para Região Norte."
				+ "\n  Digite 2 para Região Nordeste."
				+ "\n  Digite 3 para Região Centro-Oeste."
				+ "\n  Digite 4 para Região Sul."
				+ "\n\nInforme a opção desejada: ");
			op = ler.nextInt();
		
		switch (op) {
			case 1: {
				System.out.print("\nValores - Ida: R$ 500,00 | Ida/Volta: R$ 900,00.");
				break;
			}
			case 2: {
				System.out.print("\nValores - Ida: R$ 350,00 | Ida/Volta: R$ 650,00.");
				break;
			}
			case 3: {
				System.out.print("\nValores - Ida: R$ 350,00 | Ida/Volta: R$ 600,00.");
				break;
			}
			case 4: {
				System.out.print("\nValores - Ida: R$ 300,00 | Ida/Volta: R$ 550,00.");
				break;
			}
		default:
			System.out.print("Opção inválida, inicie o programa novamente.");
		}
		
		
		ler.close();
	}

}
