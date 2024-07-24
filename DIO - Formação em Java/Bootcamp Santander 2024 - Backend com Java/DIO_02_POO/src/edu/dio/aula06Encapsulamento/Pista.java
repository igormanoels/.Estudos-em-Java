package edu.dio.aula06Encapsulamento;

import java.util.Scanner;

public class Pista 
{
	public static void main(String[] args) 
	{
		boolean estado = false;
		Scanner ler = new Scanner(System.in);
		Carro carro = new Carro();
		
		System.out.print("Digite:\n"
				+ "0 - Carro Desligado\n"
				+ "1 - Ligar Carro\n"
				+ "Você deseja ligar seu carro? ");
		int ligar = ler.nextInt();
		
		if (ligar != 0) 
		{
			estado = true;
		}
		carro.ligarCarro(estado);
		
		ler.close();
	}
	
	
}
