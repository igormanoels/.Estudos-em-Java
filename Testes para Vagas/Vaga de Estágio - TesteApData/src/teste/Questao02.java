package teste;

import java.util.Scanner;

// Digite um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.

public class Questao02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int var;
		
		System.out.print("Digite um número inteiro: ");
		var = ler.nextInt();
		
		System.out.printf("\nO número informado é %d \nE seu antecessor é %d", var, (var-1));
		ler.close();
	}

}
