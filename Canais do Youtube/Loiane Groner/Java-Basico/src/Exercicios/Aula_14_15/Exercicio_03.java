package Exercicios.Aula_14_15;

import java.util.Scanner;

/* 3. Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
 * Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
 */

public class Exercicio_03 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o sexo F-Feminino / M-Masculino\nDigite a opção desejada: ");
		char letra = ler.next().charAt(0);
		
		if (letra == 'F' || letra == 'f') {
			System.out.println("Opção escolhida: F - Feminino.");
		} else if(letra == 'M' || letra == 'm') {
			System.out.println("Opção escolhida: M - Masculino.");
		} else {
			System.out.println("Sexo Inválido.");
		}
		
		
		ler.close();
	}

}
