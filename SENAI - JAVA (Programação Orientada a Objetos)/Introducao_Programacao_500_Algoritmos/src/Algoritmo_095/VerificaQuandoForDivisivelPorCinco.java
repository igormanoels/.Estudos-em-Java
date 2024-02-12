package Algoritmo_95;

import java.util.Scanner;

public class VerificaQuandoForDivisivelPorCinco {
	static double num;
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um valor");
			num = ler.nextDouble();
		
		if (num % 5 == 0 ) {
			System.out.println("O número é divisivel por 5");
		} else {
			System.out.println("O número não é divisivel por 5");
		}
	
	ler.close();
	}

}
