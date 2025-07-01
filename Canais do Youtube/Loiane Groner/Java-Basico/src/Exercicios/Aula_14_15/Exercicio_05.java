package Exercicios.Aula_14_15;

import java.util.Scanner;

/* 5. Faça um programa para a leitura de duas notas parciais de um aluno. 
 * 	O programa deve calcular a média alcançada por aluno e apresentar: 
 * 		A mensagem "Aprovado", se a média alcançada for maior ou igual a sete; 
 * 		A mensagem "Reprovado", se a média for menor do que sete; 
 * 		A mensagem "Aprovado com Distinção", se a média for igual a dez. 
 */

public class Exercicio_05 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, media;
		
		System.out.print("Informe o valor da primeira nota: ");
		nota1 = ler.nextDouble();

		System.out.print("Informe o valor da segunda nota: ");
		nota2 = ler.nextDouble();

		media = ((nota1 + nota2) / 2);
		
		if (media >= 10) {
			System.out.println("Aprovado com Distinção");
		} else if (media >= 7) {
			System.out.println("Aprovado.");
		} else {
			System.out.println("Reprovado.");
		}
		
		ler.close();
	}
	
}
