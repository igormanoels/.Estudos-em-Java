package Exercicios.Aula_14_15;

import java.util.Scanner;

/* 15. Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem 
 * ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno. 
 * 
 * Dicas: 
 * - Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro; 
 * - Triângulo Equilátero: três lados iguais; 
 * - Triângulo Isósceles: quaisquer dois lados iguais; 
 * - Triângulo Escaleno: três lados diferentes; 
 */

public class Exercicio_15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double lado1, lado2, lado3;
		
		System.out.print("Informe os 3 lados do triangulo separados por espaços: ");
		lado1 = ler.nextDouble();
		lado2 = ler.nextDouble();
		lado3 = ler.nextDouble();
		
		if (lado1 == lado2 && lado1 == lado3) {
			System.out.println("O triângulo é Equilátero.");
		} else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
			System.out.println("O triângulo é Isósceles.");
		} else {
			System.out.println("O triângulo é Escaleno.");
		}
		
	
		ler.close();
	}
	
}
