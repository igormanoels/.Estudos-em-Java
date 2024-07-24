package edu.dio.aula09Polimorfismo;

import java.util.Scanner;

public class Retangulo extends Quadrilatero
{

	@Override
	public void calcularPerimetro(Scanner ler) 
	{
		System.out.print("\nInforme o comprimento: ");
		int comprimento = ler.nextInt();
		
		System.out.print("Informe a largura: ");
		int largura = ler.nextInt();
		
		int res = comprimento * largura;
		System.out.println("Àrea do retângulo " + res);
		
	}

}
