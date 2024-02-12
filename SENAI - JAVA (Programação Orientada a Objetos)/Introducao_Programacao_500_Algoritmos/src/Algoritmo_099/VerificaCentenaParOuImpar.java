package Algoritmo_99;

import java.util.Scanner;

public class VerificaCentenaParOuImpar {
	static double num;
	static double res;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Informe um número");
			num = ler.nextDouble();
		} while (num < 100);
		
		res = (Math.ceil(num));
// arredonda o valor para ser comparado
// FALTA VALIDAR O PROGRAMA
		
		if (res % 2 == 0) {
			System.out.println("O número informado é par");
		} else {
			System.out.println("O número informado é impar");
		}
		
		ler.close();
	}

}
