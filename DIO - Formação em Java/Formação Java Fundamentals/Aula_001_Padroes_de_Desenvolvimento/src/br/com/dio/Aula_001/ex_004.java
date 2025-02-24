package br.com.dio.Aula_001;

import java.util.Scanner;

/*
 * Escreva um código que recebe o nome e a idade de duas pessoas e imprima a diferença de idade entre elas 
 * 
 */

public class ex_004 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		String nome1 = ler.next();
		
		System.out.printf("Informe sua idade %s: ", nome1);
		String idade1 = ler.next();
		
		System.out.print("Informe seu nome: ");
		String nome2 = ler.next();
		
		System.out.printf("Informe sua idade %s: ", nome2);
		String idade2 = ler.next();
		
		int difIdade = Integer.parseInt(idade1) - Integer.parseInt(idade2);
		System.out.printf("A diferença de idade é %s", difIdade);
		
		ler.close();
		
	}

}
