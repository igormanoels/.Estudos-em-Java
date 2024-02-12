package Algoritmo_038;

import java.util.Scanner;

public class TercaParte {

	public static void main(String[] args) {
		double num;
		
		System.out.println("Algoritmo: Lê e imprime a terça parte de um número.");
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe um valor ");
		 	num = ler.nextDouble();
		
		num = (num / 3);
			System.out.println("A terça parte para o valor informado é de " + num);
		
		ler.close();
	}

}
