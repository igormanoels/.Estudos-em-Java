package Aula_11;

import java.util.Scanner;

public class TrabalhandoComEstruturasDeDecisao_02 {

	public static void main(String[] args) {
		String genero;
		double sal, rsal;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o genero");
			genero = ler.nextLine();
		System.out.println("Informe o salário");
		 	sal = ler.nextDouble();
		 	
		switch(genero.toUpperCase()) {
		case "F":
			if (sal <= 1000) {
			rsal = (sal + ((sal * 15)/100));
			System.out.println("Salário: R$ " + rsal);
			}
			break;
		case "M":
			if (sal <= 1000) {
			rsal = (sal + ((sal * 10)/100));
			System.out.println("Salário: R$ " + rsal);
			}			
			break;			
		default:
			System.out.println("Não há reajuste");
		}
		ler.close();
	}

}
