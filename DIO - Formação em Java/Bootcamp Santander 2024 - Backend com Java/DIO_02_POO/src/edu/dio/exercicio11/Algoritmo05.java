package edu.dio.exercicio11;

import java.util.Scanner;

public class Algoritmo05 
{
	/*
	 * Orientação a Objetos na Prática com Java
	 * 5 / 5 - Cofres Seguros: Dominando o Encapsulamento e Abstração
	 */
}

abstract class Cofre 
{
	protected String tipo;
	protected String metodoAbertura;

	public Cofre(String tipo, String metodoAbertura) 
	{
		this.tipo = tipo;
		this.metodoAbertura = metodoAbertura;
	}

	public void imprimirInformacoes() 
	{
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Metodo de abertura: " + this.metodoAbertura);
	}
}


class CofreDigital extends Cofre 
{
	private int senha;

	public CofreDigital(int senha) 
	{
		super("Cofre Digital", "Senha");
		this.senha = senha;
	}

	public boolean validarSenha(int confirmacaoSenha) 
	{
		return confirmacaoSenha == this.senha;
	}
}


class CofreFisico extends Cofre 
{
	public CofreFisico() 
	{
		super("Cofre Fisico", "Chave");
	}
}


class Desafio 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String tipoCofre = scanner.nextLine();
		    
		
		if (tipoCofre.equalsIgnoreCase("digital")) 
		{
			int senha = scanner.nextInt();
			CofreDigital cofre = new CofreDigital(senha);
			cofre.imprimirInformacoes();
			
			senha = scanner.nextInt();
			boolean validar = cofre.validarSenha(senha);
			if (validar == true) 
			{
				System.out.println("Cofre aberto!");
			} 
			else 
			{
				System.out.println("Senha incorreta!");
			}
			scanner.close();
		}
		else if(tipoCofre.equalsIgnoreCase("fisico"))
		{
			CofreFisico cofre = new CofreFisico();
			cofre.imprimirInformacoes();
		}
	}
}