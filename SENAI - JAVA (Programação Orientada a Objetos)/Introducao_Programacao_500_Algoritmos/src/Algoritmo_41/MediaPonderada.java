package Algoritmo_41;

import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		double num1, num2, num3, num4, mediapond;
		
		System.out.println("Algoritmo: Lê 4 valores e imprime sua média ponderada.");
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número ");
			num1 = ler.nextDouble();
		System.out.print("Informe o segundo número ");
			num2 = ler.nextDouble();
		System.out.print("Informe o terceiro número ");
			num3 = ler.nextDouble();
		System.out.print("Informe o quarto número ");
			num4 = ler.nextDouble();
		
		mediapond = (((num1 * 1) + (num2 * 2) + (num3 * 3) + (num4 * 4)) / 10);
			System.out.println("\nA média ponderada é " + mediapond);
		
		ler.close();
	}

}
