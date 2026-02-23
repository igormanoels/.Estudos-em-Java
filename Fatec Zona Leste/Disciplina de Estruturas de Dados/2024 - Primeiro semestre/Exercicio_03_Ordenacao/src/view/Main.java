package view;

import java.util.Scanner;

import controller.Ordenar;

public class Main {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		int[] vet = new int[5]; 
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("Informe o %dº valor: ", (i+1));
			vet[i] = ler.nextInt();
		}
		
		Ordenar.Ordenar(vet);
		ler.close();
	}
}
