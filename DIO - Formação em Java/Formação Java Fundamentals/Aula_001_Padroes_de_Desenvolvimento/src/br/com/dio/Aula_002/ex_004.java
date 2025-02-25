package br.com.dio.Aula_002;

import java.util.Scanner;

/*
 * Receber um numero, e o outros N números. O código só deve parar quando o resultado do resto da divisão for igual a 0
 * 
 */

public class ex_004 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int resto = 0;
		int div;
		System.out.print("Informe um número para iniciar o jogo: ");
		int numero = ler.nextInt();
		
		
		do {
			System.out.print("Informe um divisor: ");
			div = ler.nextInt();
			
			resto = numero % div;
			numero = resto;
			System.out.println(resto + " " + numero);
		} while (resto != 0);
		
		
		
		System.out.println("Fim do jogo!");
		
		ler.close();
	}
	
}
