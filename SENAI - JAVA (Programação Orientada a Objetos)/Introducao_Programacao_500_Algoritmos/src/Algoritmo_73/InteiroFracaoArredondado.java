package Algoritmo_73;

import java.util.Scanner;

public class InteiroFracaoArredondado {
	static double num, inteiro, arredondado, fracao;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um valor fracionado");
			num = ler.nextDouble();
			
		System.out.println("O numero informado: " + num);
		
		arredondado = (Math.round(num));
			System.out.println("Arredondamento = " + arredondado);
		
		fracao = (num % 1);
			System.out.println("Fracionado = " + fracao);
		
		inteiro = (num - fracao);
			System.out.println("Inteiro = " + inteiro);
	
	}

}
