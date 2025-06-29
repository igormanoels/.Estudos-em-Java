package Aula_13.Exercicios;

import java.util.Scanner;

/* 14. João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento 
 * diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo 
 * regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo 
 * excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e 
 * verifique se há excesso. Se houver, gravar na variável excesso e na variável multa o valor da 
 * multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO. 
 */

public class Exercicio_14 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double excedente = 0d;
		
		System.out.print("Informe o peso do peixe: ");
		double peso = ler.nextDouble();
		
		
		if (peso > 50) {
			excedente = peso - 50;
		}
		
		double multa = excedente * 4;
		
		System.out.printf("O peso excedente é de %.1fkg "
				+ "\nO valor da multa é R$ %.2f", excedente, multa);
		
		
		
		ler.close();
	}
	
}
