package Exercicios.Aula_14_15;

import java.util.Scanner;

/* 11. As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram 
 * para desenvolver o programa que calculará os reajustes.
 * 
 * - Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado 
 * no salário atual: 
 * - Salários até R$ 280,00 (incluindo) : aumento de 20% 
 * - Salários entre R$ 280,00 e R$ 700,00 : aumento de 15% 
 * - Salários entre R$ 700,00 e R$ 1500,00 : aumento de 10% 
 * - Salários de R$ 1500,00 em diante : aumento de 5% 
 * 
 * Após o aumento ser realizado, informe na tela: 
 * - Salário antes do reajuste; 
 * - Percentual de aumento aplicado; 
 * - Valor do aumento; 
 * - Novo salário, após o aumento.
 */

public class Exercicio_11 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salario, percentual, aumento, novoSalario;
		
		System.out.print("Informe o valor do salário atual: ");
		salario = ler.nextDouble();
		
		if (salario <= 280) {
			percentual = 20;			
		} else if(salario <= 700) {
			percentual = 15;
		} else if(salario <= 1500) {
			percentual = 10;
		} else {
			percentual = 5;
		}
		
		aumento = ((salario * percentual) / 100);
		novoSalario = salario + aumento;
		
		System.out.printf("\nSalário antes do reajuste: %.2f"
				+ "\nPercentual de aumento aplicado: %.2f"
				+ "\nValor do aumento: %.2f"
				+ "\nNovo salário: %.2f", salario, percentual, aumento, novoSalario);
		
		ler.close();
	}

}
