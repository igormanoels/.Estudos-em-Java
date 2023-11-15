package Algoritmo_50;

import java.util.Scanner;

public class DadosRetangulo {

	public static void main(String[] args) {
		double base, altura, perimetro, area, diagonal;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Algoritmo: Lê a base e altura de um retângulo e imprime o perimetro, area e diagonal.");
		
		System.out.print("Informe o valor da base ");
			base = ler.nextDouble();
		System.out.print("Informe o valor da altura ");
			altura = ler.nextDouble();
		
		perimetro = ((base * altura) * 2);
		area = (base * altura);
		diagonal = (Math.sqrt((base*base)+(altura*altura)));
		
		System.out.print("Perimetro: " + perimetro);
		System.out.print(", Área: " + area);
		System.out.print(", Diagonal: " + diagonal);
		
		ler.close();
	}

}
