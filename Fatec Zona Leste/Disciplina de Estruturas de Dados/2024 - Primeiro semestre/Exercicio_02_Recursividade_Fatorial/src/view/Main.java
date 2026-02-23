package view;

import java.util.Scanner;
import controller.Fatorial;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int num = ler.nextInt();
		
		System.out.printf("fatorial de %d é %d", num, Fatorial.Fatorial(num));
		ler.close();
	}

}
