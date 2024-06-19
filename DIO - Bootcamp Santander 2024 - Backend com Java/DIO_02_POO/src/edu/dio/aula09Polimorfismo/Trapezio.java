package edu.dio.aula09Polimorfismo;

import java.util.Scanner;

public class Trapezio extends Quadrilatero
{

	@Override
	public void calcularPerimetro(Scanner ler) 
	{
		System.out.print("\nInforme o valor da primeira base: ");
		int base1 = ler.nextInt();
		
		System.out.print("Informe o valor da segunda base: ");
		int base2 = ler.nextInt();
		
		System.out.print("Informe o valor da altura: ");
		int altura = ler.nextInt();
		
		int res = ((base1 + base2) * altura) / 2;
		System.out.println("Área do trapézio " + res);
	}

}
