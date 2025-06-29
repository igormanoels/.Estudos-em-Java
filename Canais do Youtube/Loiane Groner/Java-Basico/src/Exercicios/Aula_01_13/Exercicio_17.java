package Exercicios.Aula_01_13;

import java.util.Scanner;

/* 17. Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados 
 * da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados 
 * e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que 
 * custam R$ 25,00. 
 * 
 * a. Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações: 
 * b. Comprar apenas latas de 18 litros; 
 * c. Comprar apenas galões de 3,6 litros;
 */

public class Exercicio_17 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double area, litros, lataP, lataG, precoLataP, precoLataG;
		
		System.out.print("Informe a quantidade de metros quadrados para pintar: ");
		area = ler.nextDouble();
		
		litros = area / 6;
		
		lataG = litros / 18;
		precoLataG = lataG * 80;
		
		lataP = litros / 3.6;
		precoLataP = lataP * 25;
		
		System.out.printf("\nQuantidade de Latas 18l %.2f"
						+ "\nPreço total R$ %.2f"
						+ "\nQuantidade de Latas 3,6l %.2f"
						+ "\nPreço total R$ %.2f", lataG, precoLataG, lataP, precoLataP);
	
		
		ler.close();
	}
	
}
