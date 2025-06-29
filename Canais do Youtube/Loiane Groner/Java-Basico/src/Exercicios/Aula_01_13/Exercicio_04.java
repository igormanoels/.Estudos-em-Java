package Exercicios.Aula_01_13;

import java.util.Scanner;

// 4. Faça um Programa que peça as 4 notas bimestrais e mostre a média. 

public class Exercicio_04 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe as notas separandas por espaço: ");
		double nota1 = ler.nextDouble();
		double nota2= ler.nextDouble();
		double nota3 = ler.nextDouble();
		double nota4 = ler.nextDouble();
		
		double resultado = ((nota1 + nota2 + nota3 + nota4) / 4);
		System.out.print("A média é " + resultado);
		
		
		ler.close();
	}
	
}
