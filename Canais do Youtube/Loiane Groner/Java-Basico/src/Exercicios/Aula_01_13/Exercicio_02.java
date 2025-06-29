package Exercicios.Aula_01_13;

import java.util.Scanner;

// 2. Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número]. 

public class Exercicio_02 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = ler.nextInt();
		
		System.out.println("O número informado foi " + numero);
		
		
		ler.close();
	}
	
}
