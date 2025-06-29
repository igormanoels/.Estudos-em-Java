package Exercicios.Aula_01_13;

import java.util.Scanner;

/* 15. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas 
 * no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 
 * 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê: 
 * 
 * a. Salário bruto. 
 * b. quanto pagou ao INSS. 
 * c. quanto pagou ao sindicato. 
 * d. o salário líquido. 
 * e. calcule os descontos e o salário líquido, conforme a tabela abaixo: 
 * 
 * + Salário Bruto : R$ 
 * - IR (11%) : R$ 
 * - INSS (8%) : R$ 
 * - Sindicato ( 5%) : R$ 
 * = Salário Liquido : R$ 
 * Obs.: Salário Bruto - Descontos = Salário Líquido.
 */

public class Exercicio_15 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salarioHora, horasTrabalho, salarioBruto, impostoRenda, inss, sindicato, salarioLiquido;
		
		System.out.print("Informe o valor da hora trabalhada: ");
		salarioHora = ler.nextDouble();

		System.out.print("Informe a quantidade de horas trabalhadas: ");
		horasTrabalho = ler.nextDouble();

		salarioBruto = (salarioHora * horasTrabalho);
		impostoRenda = salarioBruto * 0.11;
		inss = salarioBruto * 0.08;
		sindicato = salarioBruto * 0.05;
		salarioLiquido = salarioBruto - impostoRenda - inss - sindicato;
		
		System.out.printf("\nSalário Bruto R$ %.2f\n"
						+ "Imposto de Renda R$ %.2f\n"
						+ "INSS R$ %.2f\n"
						+ "Sindicato R$ %.2f\n"
						+ "Salário Líquido R$ %.2f",
						salarioBruto, impostoRenda, inss, sindicato, salarioLiquido);		
		
		
		ler.close();
	}

}
