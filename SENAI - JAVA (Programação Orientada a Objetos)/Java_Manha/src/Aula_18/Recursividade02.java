package Aula_18;

import java.util.Scanner;

public class Recursividade02 {
	static int num, res;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Cálculo para uma função fatorial");
		System.out.print("Infome um número: ");
			num = ler.nextInt();
		
		calcFatorial(num);
		System.out.println("Fatorial: " + calcFatorial(num));
		ler.close();
	}

	static int calcFatorial(int a) {


		for (int i = 0; i <= a; i++) {
			
		}
		
		return res;
	}

	
	
}
