package Algoritmo_130;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculaLucro {
	static double preco;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("###,###,###.00");
		System.out.println("Algoritmo: Lê o preço de um produto e imprimi o novo preço.");
		
		System.out.print("Informe qual o custo do produto: R$ ");
			preco = ler.nextDouble();
			
		calc_preco();
		
		String precoFormatado = formatar.format(calc_preco());
		System.out.print("\nO novo preço do produto será de: R$ " + precoFormatado);
				
		
		ler.close();
	}
	
	private static double calc_preco() {
		if (preco <= 20) {
			preco = preco * 1.45;
		} else {
			preco = preco * 1.3;
		}
		
		return preco;
	}

}
