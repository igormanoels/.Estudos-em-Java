package Algoritmo_50;

import java.util.Scanner;

public class DadosRetangulo {

	public static void main(String[] args) {
		double base, altura, perimetro, area, diagonal;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o valor da base");
		base = ler.nextDouble();
		
		System.out.println("Informe o valor da altura");
		altura = ler.nextDouble();
		
		perimetro = ((base * altura) * 2);
		area = (base * altura);
		diagonal = (Math.sqrt((base*base)+(altura*altura)));
		
		System.out.print("Perimetro: " + perimetro);
		System.out.print(", Área: " + area);
		System.out.print(", Diagonal: " + diagonal);
		
		
	}

}
