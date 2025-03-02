package br.edu.dio.Desafio_002_DeCodigo.ex_003;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
 * Descrição
 * Desenvolva um programa que solicite números inteiros do usuário até que ele digite um número negativo. 
 * Ao final, exiba a soma de todos os números positivos digitados.
 * 
 * Entrada
 * A entrada consiste em números inteiros fornecidos pelo usuário repetidamente.
 * 
 * Saída
 * Deverá retornar a soma de todos os números positivos digitados antes de o usuário inserir um número negativo.
 * 
 */
public class Main {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int n = 0;
        int soma = 0;

        do{
        	n = Integer.parseInt(scanner.nextLine());
        	numeros.add(n);
        	
        } while(n >= 0);
        
        for (Integer i: numeros) if(i >= 0) soma += i;
        System.out.println(soma);
        
        scanner.close();
	}

}
