package Exercicios.Aula_14_15;

import java.util.Scanner;

/* 14. Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo 
 * de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo: 
 * 
 * O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” 
 * se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E. 
 */

public class Exercicio_14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double nota1, nota2, media;
		String conceito;
		
		System.out.print("Informe o valor da primeira nota: ");
		nota1 = ler.nextDouble();
		
		System.out.print("Informe o valor da segunda nota: ");
		nota2 = ler.nextDouble();
		
		media = ((nota1 + nota2) / 2);
		
		if (media < 2) {
			conceito = "E";
		} else if (media < 4) {
			conceito = "D";
		} else if (media < 6) {
			conceito = "C";
		} else if (media < 8) {
			conceito = "B";
		} else {
			conceito = "A";
		}
		
		System.out.printf("\nN1 \t\t %.2f"
						+ "\nN2 \t\t %.2f"
						+ "\nMédia \t\t %.2f"
						+ "\nConceito \t %S", nota1, nota2, media, conceito);

				
		ler.close();
	}
	
}
