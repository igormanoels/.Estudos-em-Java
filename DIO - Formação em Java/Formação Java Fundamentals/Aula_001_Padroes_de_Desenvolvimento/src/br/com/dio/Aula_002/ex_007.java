package br.com.dio.Aula_002;

import java.util.Scanner;

/*
 * Implemente um programa que receba a nota de um estudante (de 0 a 10) e informe se ele foi 
 * "Reprovado" (nota < 5), 
 * "Recuperação" (nota entre 5 e 6.9), 
 * "Aprovado" (nota ≥ 7).
 * 
 */

public class ex_007 {
	
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        double nota = scanner.nextDouble();
        
        if (nota < 5) {
			System.out.println("Reprovado");
		} else if (nota < 7) {
			System.out.println("Recuperacao");
		} else {
			System.out.println("Aprovado");
		}
        

        scanner.close();
	}

}
