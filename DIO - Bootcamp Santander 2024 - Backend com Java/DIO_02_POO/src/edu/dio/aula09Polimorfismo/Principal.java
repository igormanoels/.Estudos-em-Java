package edu.dio.aula09Polimorfismo;

import java.util.Scanner;

public class Principal 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		System.out.print("1 - Cálcular área do Quadrado\n"
				+ "2 - Cálcular área do Retângulo\n"
				+ "3 - Cálcular área do Trapézio\n"
				+ "4 - Losango\n"
				+ "Informe a opção desejada: ");
		int op = ler.nextInt();
		
		switch (op) 
		{
		case 1:
			Quadrado quad = new Quadrado();
			quad.calcularPerimetro(ler);
			break;
		case 2:
			Retangulo retan = new Retangulo();
			retan.calcularPerimetro(ler);
			break;
		case 3:
			Trapezio trap = new Trapezio();
			trap.calcularPerimetro(ler);
			break;
		case 4:
			Losango los = new Losango();
			los.calcularPerimetro(ler);
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		
		ler.close();
	}
}
