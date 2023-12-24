package Aula_18;

import java.util.Scanner;

public class Recursividade01 {
	static double valor1, valor2, res;
	public static void main(String[] args) {
		
		escolhaOperacao();
		
	}

	static void escolhaOperacao() {
		String op;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite qual é a operação desejada: ");
		op = ler.nextLine();
		
		switch (op) {
		case "+":
			somar();
			break;
		case "-":
			subtrair();
			break;
		case "*":
			multiplicar();
			break;
		case "/":
			dividir();
			break;
		default:
			System.out.println("Opção Inválida");
			break;
		}
		
		ler.close();
	}

	private static void multiplicar() {
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe o primeiro valor: ");
		valor1 = ler.nextDouble();
		System.out.print("Informe o segundo valor: ");
		valor2 = ler.nextDouble();
		res = valor1 * valor2;
		System.out.println("Resultado: " + res);
	}

	private static void dividir() {
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe o primeiro valor: ");
		valor1 = ler.nextDouble();
		System.out.print("Informe o segundo valor: ");
		valor2 = ler.nextDouble();
		res = valor1 / valor2;
		System.out.println("Resultado: " + res);		
	}

	private static void subtrair() {
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe o primeiro valor: ");
		valor1 = ler.nextDouble();
		System.out.print("Informe o segundo valor: ");
		valor2 = ler.nextDouble();
		res = valor1 - valor2;
		System.out.println("Resultado: " + res);		
	}

	private static void somar() {
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe o primeiro valor: ");
		valor1 = ler.nextDouble();
		System.out.print("Informe o segundo valor: ");
		valor2 = ler.nextDouble();
		res = valor1 + valor2;
		System.out.println("Resultado: " + res);
	}

}
