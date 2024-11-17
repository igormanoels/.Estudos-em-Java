package Aula_07;

import java.util.Scanner;

public class TrabalhandoComMetodos01 {
	static double valor1, valor2, res;
	
	public static void main(String[] args) {
		somar();
		subtrair();
		multiplicar();
		dividir();
		
// protect apenas as classes do pacote conseguem localizar
		
// private apenas ela vê 
	}
	public static void somar() {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor");
		valor1 = ler.nextDouble();
		
		System.out.println("Informe o primeiro valor");
		valor2 = ler.nextDouble();
		
		res = valor1 + valor2;
			System.out.println("Soma: " + res);
		ler.close();
	}

	public static void subtrair() {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor");
		valor1 = ler.nextDouble();
		
		System.out.println("Informe o primeiro valor");
		valor2 = ler.nextDouble();
		
		res = valor1 - valor2;
			System.out.println("Subtração: " + res);

		ler.close();
	}
	
	public static void multiplicar() {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor");
		valor1 = ler.nextDouble();
		
		System.out.println("Informe o primeiro valor");
		valor2 = ler.nextDouble();
		
		res = valor1 * valor2;
			System.out.println("Multiplicação: " + res);
		ler.close();
	}
	
	public static void dividir() {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor");
		valor1 = ler.nextDouble();
		
		System.out.println("Informe o primeiro valor");
		valor2 = ler.nextDouble();
		
		res = valor1 / valor2;
			System.out.println("Divisão: " + res);
		ler.close();
	}
	
}