package Algoritmo_70;

import java.util.Scanner;

public class CalcadorDeGorjeta {
	static double conta, gorjeta;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o valor final do consumo do cliente");
		 	conta = ler.nextDouble();
		
		double res = calcgorj(conta);
			System.out.println("O valor com 10% é de R$ " + res);
	}
	
	static double calcgorj(double valor) {
		double resp = (valor * 1.1);
		return resp;
	}

}
