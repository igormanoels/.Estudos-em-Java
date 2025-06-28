package Aula_13.Exercicios;

import java.util.Scanner;

/* 8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas 
 * trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês. 
 */

public class Exercicio_08 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o valor da hora trabalhada: ");
		double salarioHora = ler.nextDouble();

		System.out.print("Informe a quantidade de horas trabalhadas: ");
		int horasTrabalho = ler.nextInt();

		double salario = (salarioHora * horasTrabalho);
		
		System.out.printf("O valor do salário mensal é de R$ %.2f", salario);
		
		
		ler.close();
	}
	
}
