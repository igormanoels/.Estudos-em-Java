package Exercicios.Aula_01_13;

import java.util.Scanner;

/* 13. Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo 
 * que calcule seu peso ideal, utilizando as seguintes fórmulas: 
 *  Para homens: (72.7*h) - 58 
 *  Para mulheres: (62.1*h) - 44.7 (h = altura) 
 *  
 *  Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso. 
 */

public class Exercicio_13 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double pesoIdeal;
		
		System.out.print("Informe o sexo da pessoa\nDigite m-masculino e f-feminino: ");
		String sexo = ler.nextLine();

		System.out.print("Informe a altura da pessoa: ");
		double altura = ler.nextDouble();
		
		
		if (sexo.equals("f")) {
			pesoIdeal = ((62.1 * altura) - 44.7);
		} else {
			pesoIdeal = ((72.7 * altura) - 58);
		}
		
		System.out.printf("Peso ideal da pessoa: %.2fkg", pesoIdeal);
		
		
		ler.close();
		
	}

}
