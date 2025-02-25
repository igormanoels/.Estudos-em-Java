package br.com.dio.Aula_002;

import java.util.Scanner;

/*
 * Escreva um código para verificar o imc segundo.
 * 
 *  <= 18,5 = Abaixo do peso
 *  entre 18,6 e 24,9 = peso ideal
 *  entre 25,0 e 29,9 = levemente acima do peso
 *  entre 30,0 e 34,9 = Obesidade Grau I
 *  entre 35,0 e 39,9 = Obesidade Grau II (severa)
 *  entre > 40,0 = Obesidade III (mórbida)
 * 
 */

public class ex_002 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o peso do paciente: ");
		float peso = ler.nextFloat();
		
		System.out.print("Agora informe a altura do paciente: ");
		float altura = ler.nextFloat();
		
		float imc = peso / ((float) Math.pow(altura, 2));
		
		if (imc <= 18.5) {
			System.out.println("Abaixo do peso.");
		} else if (imc <= 24.9) {
			System.out.println("Peso ideal.");
		} else if (imc <= 29.9) {
			System.out.println("Obesidade Grau I");
		} else if (imc <= 39.9) {
			System.out.println("Obesidade Grau II (severa)");
		} else {
			System.out.println("Obesidade Grau III (mórbida)");
		}
		
		
	
		ler.close();
	}
	
}
