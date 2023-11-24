package Aula_12;

import java.util.Scanner;

public class TrabalhandoComEstruturasDeRepeticao_02 {
	static int tab, res, cont;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Algoritmo: Le um numero e imprime a sua tabuada");
		System.out.print("Informe um número para cálcular a tabuada: ");
		tab = ler.nextInt();
			System.out.println("Tabuada do " + tab);
		while(cont<=10) {
			res = tab * cont;
			System.out.println(tab + " x " + cont + " = " + res);
			cont++;
		}
		
		ler.close();

	}
}
