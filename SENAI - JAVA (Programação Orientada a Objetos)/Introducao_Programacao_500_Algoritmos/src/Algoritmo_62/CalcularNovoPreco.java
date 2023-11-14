package Algoritmo_62;

import java.util.Scanner;

public class CalcularNovoPreco {

	public static void main(String[] args) {
		double preco, npreco;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor do preço do produto");
			preco = ler.nextDouble();
		npreco = novoPreco(preco);
			System.out.println("O novo preço será R$ " + npreco);
	}
	
	public static double novoPreco(double preco) {
		double desc, calculonpreco;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor do desconto");
			desc = ler.nextDouble();
		calculonpreco = (preco - ((preco * desc)/100));
		return calculonpreco;
	}

}
