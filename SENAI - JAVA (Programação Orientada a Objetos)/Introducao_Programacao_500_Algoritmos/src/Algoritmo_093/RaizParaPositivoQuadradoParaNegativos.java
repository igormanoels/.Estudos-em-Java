package Algoritmo_93;

import java.util.Scanner;

public class RaizParaPositivoQuadradoParaNegativos {
	static double num;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um número");
			num = ler.nextDouble();
		
		if (num >= 0) {
			num = (Math.sqrt(num));
				System.out.println("Raiz Quadrada: " + num);
		} else {
			num = (Math.pow(num, 2));
			System.out.println("Potencia: " + num);
		}
		
		ler.close();
	}

}
