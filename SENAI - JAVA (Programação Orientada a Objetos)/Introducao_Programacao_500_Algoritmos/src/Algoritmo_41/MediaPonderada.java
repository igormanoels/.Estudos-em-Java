package Algoritmo_41;

import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		double num1, num2, num3, num4, mediapond;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número");
		num1 = ler.nextDouble();
		
		System.out.println("Informe o segundo número");
		num2 = ler.nextDouble();
		
		System.out.println("Informe o terceiro número");
		num3 = ler.nextDouble();
		
		System.out.println("Informe o quarto número");
		num4 = ler.nextDouble();
		
		mediapond = ((num1 * 1) + (num2 * 2) + (num3 * 3) + (num4 * 4) / 10);
		System.out.println("A média ponderada é " + mediapond);
	}

}
