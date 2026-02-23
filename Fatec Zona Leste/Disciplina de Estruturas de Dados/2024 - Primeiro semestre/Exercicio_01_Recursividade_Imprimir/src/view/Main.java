package view;

import java.util.Scanner;

import controller.Imprimir;

public class Main {
	
	public static void main(String[]args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o número desejado: ");
		int num = ler.nextInt();
		
		Imprimir.Calcular(num);
		ler.close();
	}
	
	

}
