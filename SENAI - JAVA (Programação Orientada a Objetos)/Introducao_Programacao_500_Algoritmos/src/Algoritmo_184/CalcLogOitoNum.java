package Algoritmo_184;

import java.util.Scanner;

public class CalcLogOitoNum {

	public static void main(String[] args) {
		double [] log = new double [8];
		int num = 1;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Algoritmo: Lê oito número e imprimi seu log na base 10.\n");
		
		for (int i = 0; i <= 7; i++) {
			System.out.print("Favor informar o " + num + "º número: ");
			log[i] = Math.log10(ler.nextDouble());
			System.out.println("O " + num + "º log é " + log[i] + "\n");
			num++;
		}
		
		ler.close();
		
	}

}
