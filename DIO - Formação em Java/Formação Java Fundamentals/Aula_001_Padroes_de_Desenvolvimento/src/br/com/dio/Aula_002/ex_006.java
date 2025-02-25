package br.com.dio.Aula_002;

import java.util.Scanner;

/*
 * Escreva um programa que receba dois números inteiros e exiba 
 * a soma, subtração, multiplicação, divisão inteira e o resto da divisão entre eles.
 */


public class ex_006 {
	
	public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);


        scanner.close();		
	}
	
}
