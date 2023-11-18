package Algoritmo_101;

import java.util.Scanner;

public class VerificaIntervalo {
	static double num;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um número");
		num = ler.nextDouble();
		
		if (num >= 20 && num <= 90) {
			System.out.println("O número está dentro do intervalo");
		} else {
			System.out.println("O número está fora do intervalo");
		}
		
		ler.close();
	}

}
