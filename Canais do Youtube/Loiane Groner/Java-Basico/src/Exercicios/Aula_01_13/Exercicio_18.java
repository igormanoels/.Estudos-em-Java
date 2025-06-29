package Exercicios.Aula_01_13;

import java.util.Scanner;

/* 18. Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um 
 * link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando 
 * este link (em minutos). 
 */

public class Exercicio_18 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Entre com a velocidade da internet: ");
		double velocidade = ler.nextDouble();
		
		System.out.print("Entre com o tamanho do arquivo: ");
		double tamanho = ler.nextDouble();
		
		double tempo = tamanho / velocidade;
		
		System.out.printf("O tempo de download é de %.1f minutos", tempo);
		
		ler.close();
	}
}
