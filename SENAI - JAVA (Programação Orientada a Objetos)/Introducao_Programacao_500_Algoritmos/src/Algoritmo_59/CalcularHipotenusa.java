package Algoritmo_59;

import java.util.Scanner;

public class CalcularHipotenusa {

	public static void main(String[] args) {
		double cateto1, cateto2, hipot;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o valor do primeiro cateto");
		 	cateto1 = ler.nextDouble();
		 	
		System.out.println("Informe o valor do segundo cateto");
		 	cateto2 = ler.nextDouble();
		 	
		hipot = (Math.sqrt((Math.pow(cateto1, 2)+Math.pow(cateto2, 2))));
			System.out.println("O valor da hipotenusa é " + hipot);
	}

}
