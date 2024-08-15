package controller;

import java.util.concurrent.Semaphore;

public class ThreadPessoas extends Thread {

	private int pessoa;
	private Semaphore permissao;
	
	/*********************************
	 * Método construtor da classe
	 */
	public ThreadPessoas(int p, Semaphore permissoes) 
	{
		this.pessoa = p;
		this.permissao = permissoes;
	}
	
	/*****************************************
	 * Método que executa as ações da Thread
	 */	
	public void run() 
	{
		pessoaAndando();
		try 
		{
			permissao.acquire();
			pessoaEsperando();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		} 
		finally 
		{
			permissao.release();
			pessoaPassou();
		}
	
	}
	
	/***************************************************************************
	 * Método que realiza o deslocamento das pelo corredor segundo a distância.
	 */
	private void pessoaAndando()
	{
		//int caminhando = 0;
		int passos = (int) (Math.round(Math.random() * 3 ) + 3);
		
		try 
		{
			sleep(1000);
			for (int caminhando = 0; caminhando <= 200; caminhando += passos) 
			{
				if (caminhando == 0) 
				{
					System.out.println("#" + pessoa + ", começou a se mover em direção a porta.");

				} 
				else 
				{
//					caminhando += passos;
					System.out.println("#" + pessoa + " pessoa, caminhou " + caminhando + " metros");
				}

			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/*********************************************************************
	 * Método que conta o tempo que leva para a pessoa atravessar a porta.
	 */
	private void pessoaEsperando()
	{
		int atravessar = (int) (Math.round(Math.random() * 1001) + 1000);
		try 
		{
			sleep(atravessar);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("#" + pessoa + " pessoa, atravessou.");
 	}
	
	/*************************************************************
	 * Método que realiza a saída da pessoa do caminho da porta.
	 */
	private void pessoaPassou()
	{
		System.out.println("#" + pessoa + " pessoa, foi embora!");
	}
}
