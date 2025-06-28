package Aula_13.Exercicios;

import java.util.Scanner;

/* 9. Faça um Programa que peça a temperatura em graus Farenheit, transforme e 
 * mostre a temperatura em graus Celsius.  
 * C = (5 * (F-32) / 9). 
 */

public class Exercicio_09 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe a temperatura atual: ");
		double temp = ler.nextDouble();
		
		double celcius = (5 * (temp - 32) / 9);
		System.out.printf("A temperatura convertida em celcius é de %.1f°", celcius);
		
		ler.close();
	}

}
