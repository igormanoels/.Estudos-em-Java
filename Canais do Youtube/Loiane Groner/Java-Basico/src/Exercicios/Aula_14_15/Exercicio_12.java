package Exercicios.Aula_14_15;

import java.util.Scanner;

/* 12. Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto 
 * de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS 
 * corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido 
 * corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora 
 * e a quantidade de horas trabalhadas no mês. 
 * 
 * - Desconto do IR: 
 * - Salário Bruto até 900 (inclusive) - isento 
 * - Salário Bruto até 1500 (inclusive) - desconto de 5% 
 * - Salário Bruto até 2500 (inclusive) - desconto de 10% 
 * - Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o 
 * exemplo abaixo.
 */

public class Exercicio_12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double horaTrabalho, valorHora, salarioBruto, sindicatoPagar, fgtsPagar, inssPagar, irPagar, totalDescontos,
				salarioLiquido;
		int sindicato = 3, fgts = 11, inss = 10, impostoRenda;

		System.out.print("Informe o valor da hora de trabalho: ");
		valorHora = ler.nextDouble();

		System.out.print("Informe a quantidade de horas trabalhadas: ");
		horaTrabalho = ler.nextDouble();

		salarioBruto = valorHora * horaTrabalho;
		sindicatoPagar = ((salarioBruto * sindicato) / 100);
		fgtsPagar = ((salarioBruto * fgts) / 100);
		inssPagar = ((salarioBruto * inss) / 100);

		if (salarioBruto <= 900) {
			impostoRenda = 0;
		} else if (salarioBruto <= 1500) {
			impostoRenda = 5;
		} else if (salarioBruto <= 2500) {
			impostoRenda = 10;
		} else {
			impostoRenda = 20;
		}

		irPagar = ((salarioBruto * impostoRenda) / 100);
		totalDescontos = impostoRenda + sindicato + inss;
		salarioLiquido = salarioBruto - impostoRenda - sindicato - inss;
		
		System.out.printf("\nSalário Bruto: \t\t R$ %.2f" 
						+ "\n(-) Sindicato (3%%) \t R$ %.2f" 
						+ "\n(-) IR (%%) \t\t R$ %.2f" 
						+ "\n(-) INSS ( 10%%) \t R$ %.2f" 
						+ "\nFGTS (11%%) \t\t R$ %.2f" 
						+ "\nTotal de descontos \t R$ %.2f" 
						+ "\nSalário Líquido \t R$ %.2f",
						salarioBruto, sindicatoPagar, irPagar, inssPagar, fgtsPagar, totalDescontos, salarioLiquido);
		
		
		ler.close();
	}

}
