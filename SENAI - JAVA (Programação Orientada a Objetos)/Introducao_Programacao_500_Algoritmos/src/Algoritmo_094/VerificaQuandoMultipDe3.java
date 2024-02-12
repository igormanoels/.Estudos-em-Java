package Algoritmo_94;

import java.util.Scanner;

public class VerificaQuandoMultipDe3 {
	static double num;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um número");
		 	num = ler.nextDouble();
		
		if ( num % 3 == 0) {
			System.out.println("O número informado é múltiplo de 3");
		} else {
			System.out.println("O número informado não é múltiplo de 3");
		}
		
		ler.close();
	}

}
