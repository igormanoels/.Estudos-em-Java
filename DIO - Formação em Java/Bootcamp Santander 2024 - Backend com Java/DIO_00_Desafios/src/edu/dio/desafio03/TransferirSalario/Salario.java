package edu.dio.desafio03.TransferirSalario;

import java.util.Scanner;

/*
 * 	Desafio 03
 * 	Faça um programa que calcule e imprima o salário a ser transferido para um funcionário.
 * 	Para realizar o calculo receba o valor bruto do salário e o adicional dos benefícios.
 * 	O salário a ser transferido é calculado da seguinte maneira:
 * 		- (valor bruto do salário - percentual de imposto mediante ao salário) + adicional dos benefícios
 * 
 * 	Para calcular o percentual de imposto segue as aliquotas:
 * 		De R$ 0.00 a R$ 1100.00 = 5.00%
 * 		De R$ 1100.01 a R$ 2500.00 = 10.00%
 * 		Maior que R$ 2500.00 = 15.00%
 * 	
 * 	Entrada
 * 		- A entrada consiste em vários arquivos de teste, que conterá o valor bruto do salário e adicional 
 * 		dos benefícios. Conforme mostrado no exemplo de entrada a seguir.
 * 	Saída
 * 		- Para cada arquivo da entrada, terá um arquivo de saída. E como mencionado no Desafio, será gerado 
 * 		uma linha com um número que será a diferença entre o valor bruto do salário e o percentual de imposto 
 * 		mediante a faixa salárial somado com o adicional dos benefícios. Use o exemplo abaixo para clarear o 
 * 		que está sendo pedido.
 * 
 */
public class Salario 
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe o valor do salário: R$ ");
		float valSalario = ler.nextFloat();
		
		System.out.print("Informe o valor do beneficio: R$ ");
		float valBeneficio = ler.nextFloat();
		
		float valImposto = 0;
		
		if (valSalario <= 1100.00) 
		{
			valImposto = valSalario * 0.05f;
		} 
		else if (valSalario <= 2500.00)
		{
			valImposto = valSalario * 0.1f;
		}
		else
		{
			valImposto = valSalario * 0.15f;
		}
		
		
		float saida = valSalario - valImposto + valBeneficio;
		System.out.println("Salário final é: R$ " + String.format("%.2f", saida));
		
		ler.close();
	}

}
