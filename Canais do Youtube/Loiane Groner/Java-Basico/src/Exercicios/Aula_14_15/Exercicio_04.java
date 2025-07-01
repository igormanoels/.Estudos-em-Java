package Exercicios.Aula_14_15;

import java.util.Scanner;

// 4. Faça um Programa que verifique se uma letra digitada é vogal ou consoante. 

public class Exercicio_04 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe a letra desejada: ");
		char letra = ler.next().charAt(0);
		
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("É vogal.");

		} else if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
			System.out.println("É vogal.");
		} else {
			System.out.println("É consoante.");
		}
		
		
		ler.close();
	}
	
}
