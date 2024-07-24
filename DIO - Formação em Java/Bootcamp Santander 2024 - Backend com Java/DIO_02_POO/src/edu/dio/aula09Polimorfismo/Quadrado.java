package edu.dio.aula09Polimorfismo;

import java.util.Scanner;

public class Quadrado extends Quadrilatero 
{

	@Override
	public void calcularPerimetro(Scanner ler) 
	{
		System.out.print("\nInforme o valor do lado: ");
		int lado = ler.nextInt();
		
		int res = (int) Math.pow(lado, 2);
		System.out.println("Área do Quadrado " + res);
	}

}
