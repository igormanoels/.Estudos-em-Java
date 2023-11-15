package Algoritmo_46;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ReajusteValor {

	public static void main(String[] args) {
		double valor ;

		System.out.println("Algoritmo: Lê um valor e imprime o reajuste de 1%.");
		
		Scanner ler = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("###,###,###.00");
//DecimalFormat é uma classe que visa ordenar o números de acordo com uma pré-formatação 
//O retorno deve valor sempre será apresentado ao usuário como uma string
		System.out.print("Informe um valor para ter seu reajuste cálculado ");
		valor = ler.nextDouble();
		valor = (valor * 1.01);
			
		String valorFormatado = formatar.format(valor);
//Chama a operação para uma outra variável, que será formatada e exibida como String
		System.out.println("\nO valor reajustado é de R$ " + valorFormatado);
			
		ler.close();
	}

}
