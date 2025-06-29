package Exercicios.Aula_01_13;

import java.util.Scanner;

// 7. Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário. 

public class Exercicio_07 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o valor do lado do quadrado: ");
		double lado = ler.nextDouble();
		
		double areaQuadrado = Math.pow(lado, lado);
		
		System.out.printf("\nO dobro da área do quadrado é %.2f", (areaQuadrado*2));
				
		ler.close();
	}
	
}
