package Algoritmo_62;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcularNovoPreco {
	static double preco, npreco, desc, calculonpreco;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("###,###,###.00");
		
		System.out.println("Algoritmo: Lê e imprime .");
		
		System.out.print("Informe o valor do preço do produto: R$ ");
			preco = ler.nextDouble();
		
		npreco = novoPreco(preco);
		String nprecoFormatado = formatar.format(npreco);
			System.out.println("\nO novo preço será R$ " + nprecoFormatado);
		
		ler.close();
	}
	
	public static double novoPreco(double preco) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o valor do desconto: ");
			desc = ler.nextDouble();
		
		calculonpreco = (preco - ((preco * desc)/100));
		return calculonpreco;
	}

}
