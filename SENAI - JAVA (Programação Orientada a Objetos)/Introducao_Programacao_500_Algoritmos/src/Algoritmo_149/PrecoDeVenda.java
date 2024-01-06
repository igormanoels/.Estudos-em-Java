package Algoritmo_149;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PrecoDeVenda {
	static double preco;
	static String precoFormatado, produto;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("###,###,###,###.00");
		System.out.println("Algoritmo: Lê o nome e o preço do produto e imprimi seu valor de venda.");
		
		System.out.print("Informe o nome do produto: ");
			produto = ler.nextLine();
		System.out.print("Informe o valor de compra : R$ ");
			preco = ler.nextDouble();
			
			if (preco < 0) {
				System.out.print("Valor inválido, inicie o programa novamente.");
			} 
			else {
				if (preco < 10) {
					preco = preco * 1.7;
					precoFormatado = formatar.format(preco);
					System.out.print("\nO preço de venda para: " + produto + ", é de R$ " + precoFormatado);
				}
				else {
					if (preco < 30) {
						preco = preco * 1.5;
						precoFormatado = formatar.format(preco);
						System.out.print("\nO preço de venda para: " + produto + ", é de R$ " + precoFormatado);
					} 
					else {
						if (preco < 50) {
							preco = preco * 1.4;
							precoFormatado = formatar.format(preco);
							System.out.print("\nO preço de venda para: " + produto + ", é de R$ " + precoFormatado);
						} 
						else {
							preco = preco * 1.4;
							precoFormatado = formatar.format(preco);
							System.out.print("\nO preço de venda para: " + produto + ", é de R$ " + precoFormatado);
						}
					}
				}
			}
		
		
		ler.close();
	}

}
