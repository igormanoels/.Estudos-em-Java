package Algoritmo_132;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversorDeMoedas {
		static int op;
		static double valor, convert;
		static String valorFormatado;
		
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("###,###,###,###.00");
		System.out.println("Algoritmo: Lê um valor e imprimi a conversão para a moeda desejada.");
		
		System.out.println("\nNesse programa é possível converter valores em: "
						 + "\nOpção 1 - Dólar Americano"
						 + "\nOpção 2 - Libra Esterlina"
						 + "\nOpção 3 - Euro"
						 + "\nOpção 4 - Franco Suíço");
		
		System.out.print("\nInforme a opção: ");
			op = ler.nextInt();
		System.out.print("Informe o valor que deseja ser convertido: R$ ");
			valor = ler.nextDouble();
			convert = valor;
		
		switch (op) {
			case 1: {
				convert = valor * 4.85;
				break;			
			}
			case 2: {
				convert = valor * 6.18;
				break;
			}
			case 3: {
				convert = valor * 5.36;
				break;
			}
			case 4: {
				convert = valor * 5.78;
				break;
			}
			default:
				System.out.print("\nOpção Inválida!");
				break;
		}
		
		if (convert != valor) {
			valorFormatado = formatar.format(convert);
			System.out.print("\nO valor informado convertido fica em: R$ " + valorFormatado);
		}
		
		
		ler.close();
	}

}
