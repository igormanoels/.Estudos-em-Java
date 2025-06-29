package Exercicios.Aula_01_13;

import java.util.Scanner;

/* 16. Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros 
 * quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 
 * 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
 *  
 * Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
 */

public class Exercicio_16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double area, preco, litros, latas;
		
		System.out.print("Informe a quantidade de metros quadrados para pintar: ");
		area = ler.nextDouble();
		
		litros = area / 3;
		latas = litros / 18;
		preco = latas * 80;
		
		System.out.printf("\nQuantidade de Latas %.2f\n"
						+ "Preço total R$ %.2f", latas, preco);
	
		
		ler.close();
	}
	
}
