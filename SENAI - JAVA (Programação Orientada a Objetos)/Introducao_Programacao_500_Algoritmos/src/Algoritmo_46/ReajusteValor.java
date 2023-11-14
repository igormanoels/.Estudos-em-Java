package Algoritmo_46;

import java.util.Scanner;

public class ReajusteValor {

	public static void main(String[] args) {
		double valor;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um valor para ter seu reajuste cálculado");
		
		valor = ler.nextDouble();
		valor = (valor * 1.01);
			System.out.println("O valor reajustado é de R$" + valor);
	}

}
