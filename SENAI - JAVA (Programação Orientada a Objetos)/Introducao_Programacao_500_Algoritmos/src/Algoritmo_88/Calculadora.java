package Algoritmo_88;

import java.util.Scanner;

public class Calculadora {
		static String op;
		static double num1, num2, res;
	public static void main (String[]args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Cálculadora com operações básicas.");
		
		System.out.print(
						 "\n           ************************"
					   + "\n           *      Cálculadora     *"
					   + "\n           ************************"
					   + "\n           *                      *"
					   + "\n           *     + para somar     *"
					   + "\n           *    - para subtrair   *"
					   + "\n           *  * para multiplicar  *"
					   + "\n           *    / para dividir    *"
					   + "\n           *                      *"
					   + "\n           ************************"
				);
		System.out.print("\n               Digite sua opção:");
		op = ler.nextLine();
		
		switch (op) {
			case "+":
				System.out.print("           Informe o primeiro valor: ");
					num1 = ler.nextDouble();
				System.out.print("           Informe o segundo valor: ");
					num2 = ler.nextDouble();
				
				res = (num1 + num2);
					System.out.print("\n                 A soma é: " + res);
				break;
			case "-":
				System.out.print("           Informe o primeiro valor: ");
					num1 = ler.nextDouble();
				System.out.print("           Informe o segundo valor: ");
					num2 = ler.nextDouble();
				
				res = (num1 - num2);
					System.out.print("\n              A subtração é: " + res);
				break;
			case "*":
				System.out.print("           Informe o primeiro valor: ");
					num1 = ler.nextDouble();
				System.out.print("           Informe o segundo valor: ");
					num2 = ler.nextDouble();
				
				res = (num1 * num2);
					System.out.print("\n             A multiplicação é: " + res);
				break;
			case "/":
				System.out.print("           Informe o primeiro valor: ");
					num1 = ler.nextDouble();
				System.out.print("           Informe o segundo valor: ");
					num2 = ler.nextDouble();
				
				res = (num1 / num2);
					System.out.print("\n                A divisão é: " + res);
				break;
		default:
			System.out.println("                Opção Inválida");
			break;
		}
		
		ler.close();
	}
}
