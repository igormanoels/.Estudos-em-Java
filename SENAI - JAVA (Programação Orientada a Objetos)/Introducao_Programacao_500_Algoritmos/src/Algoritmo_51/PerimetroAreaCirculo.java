package Algoritmo_51;

import java.util.Scanner;

public class PerimetroAreaCirculo {

	public static void main(String[] args) {
		double raio, perimetro, area;
				
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Algoritmo: Lê o raio e imprime o perimetro e a área.");
		
		System.out.print("Informe o valor do raio ");
			raio = ler.nextDouble();
			
		perimetro = (2 * (Math.PI * raio));
		area = (Math.PI *((Math.pow(raio, 2))));
		
		System.out.print("\nO valor do perimetro: " + perimetro);
		System.out.print(", o valor da Área: " + area);
		
		ler.close();
	}

}
