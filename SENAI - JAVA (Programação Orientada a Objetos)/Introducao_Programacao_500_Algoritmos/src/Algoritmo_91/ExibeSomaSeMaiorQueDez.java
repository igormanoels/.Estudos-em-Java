package Algoritmo_91;

import java.util.Scanner;

public class ExibeSomaSeMaiorQueDez {

	public static void main(String[] args) {
		int num1, num2, soma;
		
		Scanner ler = new Scanner(System.in);
		 	
		System.out.println("Informe o Primeiro valor para soma");
		 	num1 = ler.nextInt();
		System.out.println("Informe o Segundo valor para soma");
		 	num2 = ler.nextInt();
		
		soma = num1 + num2;
		
		if (soma > 10) {
			System.out.println("O Resultado é: " + soma);
			
		} else {
			System.out.println("A soma não passa de 10, tente novamente!");
		}	
		
		ler.close();
	}

}
