package Exercicios.Aula_14_15;

import java.util.Scanner;

/* 20. Faça um Programa para leitura de três notas parciais de um aluno. O programa deve calcular a média 
 * alcançada por aluno e presentar: 
 * 
 * - A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
 * - a.  A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada; 
 * - b. A mensagem "Aprovado com Distinção", se a média for igual a 10. 
 */

public class Exercicio_20 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n1, n2, n3, media;
		
		System.out.print("Informe as 3 notas do aluno separadas por espaço: ");
		n1 = ler.nextDouble();
		n2 = ler.nextDouble();
		n3 = ler.nextDouble();
		
		media = ((n1 + n2 + n3) / 3);
		
		if (media < 7) {
			System.out.println("Reprovado");
		} else {
			if (media == 10) {
				System.out.println("Aprovado com Distinção!");
			} else {
				System.out.println("Aprovado");
			}
		}
		
		
		ler.close();
	}
	
}
