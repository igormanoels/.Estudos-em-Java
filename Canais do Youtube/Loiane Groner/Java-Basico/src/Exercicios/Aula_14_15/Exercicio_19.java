package Exercicios.Aula_14_15;

import java.util.Scanner;

/* 19. Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, 
 * dezenas e unidades do mesmo. 
 * 
 * - Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo: 
 * - 326 = 3 centenas, 2 dezenas e 6 unidades 
 * - 12 = 1 dezena e 2 unidades 
 * 
 * Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
 */

public class Exercicio_19 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, centena, dezena, unidade;
		
		System.out.print("Informe um número inteiro menor que 1000: ");
		numero = ler.nextInt();
		
		if (numero < 1000) {
			centena = numero / 100;
			dezena = numero / 10 % 10;
			unidade = numero % 10;
			
			System.out.printf("Unidade: %d \nDezena: %d \nCentena: %d", unidade, dezena, centena);
			
		} else {
			System.out.println("O número informado não é menor que 1000.");
		}
		
		
		
		
		ler.close();
	}
	
}
