package Algoritmo_146;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EstimativaDeConsumo {
	static double percurso, consumo;
	static String consFormatado;
	static int op;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("####.00");
		System.out.println("Algoritmo: Lê o percurso e imprimi o consumo estimado.");

		System.out.print("Informe a distância do percuso desejado: ");
			percurso = ler.nextDouble();
		System.out.print("Agora informe o tipo de véiculo. "
				+ "\n  Digite 1 para hatch."
				+ "\n  Digite 2 para sedan."
				+ "\n  Digite 3 para esportivo."
				+ "\nInforme a opção selecionada: ");
			op = ler.nextInt();
			
		switch (op) {
			case 1: {
				consumo = (percurso / 12);
				consFormatado = formatar.format(consumo);
				System.out.print("\nA estimativa de consumo é de " + consFormatado + " lts.");
				break;
			}
			case 2: {
				consumo = (percurso / 9);
				consFormatado = formatar.format(consumo);
				System.out.print("\nA estimativa de consumo é de " + consFormatado+ " lts.");
				break;
			}
			case 3: {
				consumo = (percurso / 7);
				consFormatado = formatar.format(consumo);
				System.out.print("\nA estimativa de consumo é de " + consFormatado+ " lts");
				break;
			}
		default:
			System.out.print("\nOpção inválida.");
		}
		
		
		ler.close();
	}

}
