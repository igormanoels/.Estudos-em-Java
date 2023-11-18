package Algoritmo_96;

import java.util.Scanner;

public class VerificaSeDivisivelPor3e7 {
	static double num;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um número");
		 	num = ler.nextDouble();
		
		if (num % 3 == 0 && num % 7 == 0) {
			System.out.println("O número é divisivel por 3 e 7");
		} else {
			System.out.println("O número não é divisil por 3 e 7");
		}
		
		ler.close();
	}

}
