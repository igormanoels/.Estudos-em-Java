package Algoritmo_38;

import java.util.Scanner;

public class TercaParte {

	public static void main(String[] args) {
		double num;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um valor");
		 	num = ler.nextDouble();
		
		num = (num / 3);
			System.out.println("A terça parte para o valor informado é de " + num);
			
	}

}
