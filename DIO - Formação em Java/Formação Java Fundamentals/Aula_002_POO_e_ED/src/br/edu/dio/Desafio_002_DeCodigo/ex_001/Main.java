package br.edu.dio.Desafio_002_DeCodigo.ex_001;

import java.util.Scanner;

/* 
 * Descrição
 * Escreva um programa que receba o número correspondente a um dia da semana (1 para domingo, 2 para segunda-feira, etc.) 
 * e exiba o nome do dia. Caso o número não corresponda a um dia válido, exiba "Dia invalido".
 * 
 * Entrada
 * A entrada deve receber um número inteiro de 1 a 7.
 * 
 * Saída
 * Deverá retornar o nome do dia da semana correspondente ou "Dia invalido" se o número não for válido.
 * 
 */
public class Main {
	
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        int dia = scanner.nextInt();
        
        switch(dia) {
        	case 1 -> System.out.println("Domingo");
        	case 2 -> System.out.println("Segunda-feira");
        	case 3 -> System.out.println("Terca-feira");
        	case 4 -> System.out.println("Quarta-feira");
        	case 5 -> System.out.println("Quinta-feira");
        	case 6 -> System.out.println("Sexta-feira");
        	case 7 -> System.out.println("Sabado");
        	default -> System.out.println("Dia invalido");
        }

        scanner.close();
	}
}
