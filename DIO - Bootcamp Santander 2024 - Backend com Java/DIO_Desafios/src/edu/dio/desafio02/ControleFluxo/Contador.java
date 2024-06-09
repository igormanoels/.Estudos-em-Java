package edu.dio.desafio02.ControleFluxo;

import java.util.Scanner;
	/*
	 * 	Vamos exercitar todo o conteúdo apresentado no módulo de Controle de Fluxo codificando o seguinte cenário.
	 * 	O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, 
	 * 	com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no console 
	 * 	(System.out.print) dos números incrementados, exemplo:
	 * 
	 * 		- Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir 
	 * os números, exemplo: "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.
	 * 		- Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada 
	 * chamada de ParametrosInvalidosException com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro"
	 * 
	 * 		1 - Crie o projeto DesafioControleFluxo
	 * 		2 - Dentro do projeto, crie a classe Contador.java para realizar toda a codificação do nosso programa.
	 * 		3 - Dentro do projeto, crie a classe ParametrosInvalidosException que representará a exceção de negócio no sistema.
	 * 
	 */
public class Contador 
{
	static int num1, num2;
	
	public static void main(String[] args) 
	{
		leituraDados();
	}
	
	static void leituraDados()
	{
		Scanner ler = new Scanner(System.in);
		try 
		{
			System.out.print("\nInforme o primeiro valor: ");
			num1 = ler.nextInt();
			
			System.out.print("Informe o segundo valor: ");
			num2 = ler.nextInt();
			
			contar();
		} 
		catch (Exception e) 
		{
			System.err.println(e + "\n O valor informado precisa ser  um  número inteiro!!!");
			ler.nextLine();
			leituraDados();
		}	
		ler.close();
	}
	
	static void contar() throws ParametrosInvalidosException
	{
		if (num1 < num2) 
		{
			int interacoes = num2 - num1;
			
			for (int i = 1; i <= interacoes; i++) 
			{
				try 
				{
					System.out.print("\n" + i + "º interação.");
					Thread.sleep(1000);
				} 
				catch (Exception e) 
				{
					System.err.println("Erro:" + e);
				}
			}
		}
		else 
		{
			System.err.println(ParametrosInvalidosException.mensagem);
			leituraDados();
		}
	}
}
