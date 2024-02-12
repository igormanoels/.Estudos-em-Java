package Algoritmo_77;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DiferencaEntreDoisQuadrados {
		static double num1, num2, res;
		static String resFormatado;
		
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat ("0.00");
		System.out.println("Algoritmo: Lê dois números e imprimi o quadrado da diferença.");
		
		System.out.print("Informe o primeiro número: ");
			num1 = ler.nextDouble();
		System.out.print("Informe o segundo número: ");
			num2 = ler.nextDouble();
		
			if (num1 == num2) {
				System.out.println("\nNão a diferença entre os números informados");
			}
				else if (num1 > num2) {
					res = num1 - num2;
					res = (Math.pow(res, 2));
					resFormatado = formatar.format(res);
					System.out.print("\nO quadrado da diferença é: " + resFormatado);
				}
				else {
					res = num2 - num1;
					res = (Math.pow(res, 2));
					resFormatado = formatar.format(res);
					System.out.print("\nO quadrado da diferença é: " + resFormatado);
				}
			
		ler.close();
	}

}
