package Aula_11;

import java.util.Scanner;

public class TravalhandoComEstruturasDeDecisao {

	public static void main(String[] args) {
		double sal, rsal;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o salário");
		 	sal = ler.nextDouble();

//Encadeamento do if
		if (sal <= 1000) {
			rsal = (sal + ((sal * 15)/100));
			System.out.println("Salário: R$ " + rsal);
		} else if (sal <= 1500) {
			rsal = (sal + ((sal * 10)/100));
			System.out.println("Salário: R$ " + rsal);
		} else if (sal <= 2000) {
			rsal = (sal + ((sal * 5)/100));
			System.out.println("Salário: R$ " + rsal);
		} else {
			System.out.println("Não há reajuste");
		}
		
		
		ler.close();
	}

}
