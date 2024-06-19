package edu.dio.aula09Polimorfismo;

import java.util.Scanner;

public class Losango extends Quadrilatero
{

	@Override
	public void calcularPerimetro(Scanner ler) 
	{
		System.out.print("\nInforme o valor da primeira diagonal: ");
		int diagonal1 = ler.nextInt();
		
		System.out.print("Informe o valor da segunda diagonal: ");
		int diagonal2 = ler.nextInt();
		
		int res = (diagonal1 * diagonal2) / 2;
		System.out.println("Àrea do losango " + res);
		
	}

}
