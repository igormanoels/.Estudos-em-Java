package br.com.dio.Aula_002;

import java.util.Scanner;

/*
 * Crie um programa que receba a idade de uma pessoa e determine se ela é menor de idade, maior de idade ou idosa. 
 * 
 * Considere como referência:
 * Menor de idade: menos de 18 anos
 * Maior de idade: de 18 a 64 anos
 * Idoso: 65 anos ou mais
 */


public class ex_005 {
	
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();
        
        if (idade < 18) {
			System.out.print("Menor de idade");
		} else if (idade >= 18 && idade <= 64) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Idoso");
		}

        scanner.close();
	}

}
