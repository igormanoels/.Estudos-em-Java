package Algoritmo_55;

import java.util.Scanner;

public class AreaLosango {

	public static void main(String[] args) {
		double diagmaior, diagmenor, losango;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o valor da Maior Diagonal");
			diagmaior = ler.nextDouble();
		System.out.println("Informe o valor da Menor Diagonal");
			diagmenor = ler.nextDouble();
			
		losango = ((diagmenor * diagmaior)/2);
			System.out.println("O valor do losango é " + losango);
			
	}

}
