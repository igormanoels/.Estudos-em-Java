package Aula_12;

import java.util.Scanner;

public class TrabalhandoComEstruturasDeRepeticao_03 {
	static int num, res, cont;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Infome um número: ");
		 	num = ler.nextInt();
		
		while (cont<=10) {
			if (cont % 2 != 0) {
				System.out.print(cont +" | ");
			}
			res = cont + res;
			cont++;
		}
		 	System.out.println("\nSoma dos impares: " + res);
		 	ler.close();
	}

}
