package Aula_13.Exercicios;

import java.util.Scanner;

/* 12. Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule 
 * seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58 
 */

public class Exercicio_12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o a altura: ");
		double altura = ler.nextDouble();
		
		double pesoIdeal = ((72.7 * altura) - 58);
		
		System.out.printf("O peso ideal é %.2f", pesoIdeal);
		
		
		ler.close();
	}
	
}
