package Algoritmo_72;

import java.util.Scanner;

public class CalcularRendimento {
	static double deposit, tax, valor, res;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o valor depositado");
			deposit = ler.nextDouble();
		System.out.println("Informe a taxa de rendimento");
		 	tax = ler.nextDouble();
		
		res = calcvalor(deposit, tax);
			System.out.println("O valor corrigido é de R$ " + res);
	}
	
	static double calcvalor(double dep, double tx) {
		double resp = (dep + ( dep * (tx/100)));
		return resp;
	}

}
