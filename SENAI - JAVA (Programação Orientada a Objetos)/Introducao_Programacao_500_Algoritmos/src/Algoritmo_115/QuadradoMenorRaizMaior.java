package Algoritmo_115;

import java.util.Scanner;

public class QuadradoMenorRaizMaior {
	static double num1, num2;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê dois números e imprimi o quadrado do menor e a raiz do maior.");
		
		System.out.print("Informe o primeiro número: ");
			num1 = ler.nextDouble();
		System.out.print("Informe o segundo número: ");
			num2 = ler.nextDouble();
		
		if (num1 == num2) {
			System.out.print("\nOs números são iguais, inicie o programa novamente.");
		} 
			else if (num1 > num2){
				num1 = (Math.sqrt(num1));				
				num2 = (Math.pow(num2, 2));
				System.out.print("\nA raiz do maior é: " + num1);
				System.out.print("\nO quadrado do menor é: " + num2);
			
			}
			else {
				num1 = (Math.pow(num1, 2));
				num2 = (Math.sqrt(num2));
				System.out.print("\nA raiz do maior é: " + num2);
				System.out.print("\nO quadrado do menor é: " + num1);
			}
		
		
		ler.close();
	}

}
