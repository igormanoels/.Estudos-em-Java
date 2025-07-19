package Exercicios.Aula_14_15;

import java.util.Scanner;

/* 16. Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. 
 * O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas 
 * seguintes situações: 
 * 
 * - a. Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa 
 * não deve fazer pedir os demais valores, sendo encerrado; 
 * - b. Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e 
 * encerre o programa; 
 * - c. Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário; 
 * - d. Se o delta for positivo, a equação possui duas raiz reais; 
 */

public class Exercicio_16 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, b, c, x1, x2, delta;
		
		System.out.print("Informe os valores de A: ");
		a = ler.nextDouble();

		System.out.print("Informe os valores de B: ");
		b = ler.nextDouble();
		
		System.out.print("Informe os valores de C: ");
		c = ler.nextDouble();
		
		
		if (a == 0) {
			System.out.println("Essa equação não é de 2º grau.");
		} else {
			delta = (Math.pow(b, 2)) - (4 * a * c);

			if(delta < 0) {
				System.out.println("A equação não possui raízes reais.");
			} else if (delta == 0){
				System.out.println("Há apenas um raíz real para a equação.");
			} else {
				x1 = (-b) + (Math.sqrt(delta)) / (2 * a);		
				x2 = (-b) - (Math.sqrt(delta)) / (2 * a);
				
				System.out.printf("\nX1 = %.2f \nX2 = %.2f", x1,x2);				
			}
		}
				
		
		ler.close();
	}

}
