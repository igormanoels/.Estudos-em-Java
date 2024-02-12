package Algoritmo_70;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcadorDeGorjeta {
	static double conta, gorjeta;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("###,###,###,###.00");
		
		System.out.println("Algoritmo: Lê o valor da comanda e imprime o valor com a gorjeta de 10%.");
		
		System.out.print("Informe o valor final do consumo do cliente: R$ ");
		 	conta = ler.nextDouble();
		
		double res = calcgorj(conta);
		String resFormatado = formatar.format(res);
			System.out.println("\nO valor com 10% é de R$ " + resFormatado);
			
		ler.close();
	}
	
	static double calcgorj(double valor) {
		double resp = (valor * 1.1);
		return resp;
	}

}
