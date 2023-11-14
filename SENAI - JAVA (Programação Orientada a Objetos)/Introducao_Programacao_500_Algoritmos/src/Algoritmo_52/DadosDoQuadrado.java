package Algoritmo_52;

import java.util.Scanner;

public class DadosDoQuadrado {

	public static void main(String[] args) {
		int lado;
		double perimetro, area, diagonal;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o valor do lado");
		lado = ler.nextInt();
		
		perimetro = (lado * 4);
		area = (Math.pow(lado, 2));
		diagonal = (Math.sqrt(lado));
		
		System.out.print("Perimetro: " + perimetro);
		System.out.print(", Área: " + area);
		System.out.print(", Diagonal: " + diagonal);
		
		
	}

}
