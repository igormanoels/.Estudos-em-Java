package controller;

import java.util.concurrent.Semaphore;

public class ThreadCarros extends Thread {
	
	private int IdCarro;
	private Semaphore semaforo;
	
	/*********************************
	 * Método construtor da classe
	 */
	public ThreadCarros(int carro, Semaphore permissao) 
	{
		this.IdCarro = carro;
		this.semaforo = permissao;
	}
	
	/*****************************************
	 * Método que executa as ações da Thread
	 */	
	public void run() 
	{
		deslocamento();
		try 
		{
			semaforo.acquire();
			estacionamento();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			semaforo.release();
			saida();
		}
	
	}
	
	
	/********************************************************************
	 * Método que realiza o deslocamento dos carros segundo a distância
	 */
	private void deslocamento()
	{
		int deslocamento = 0;
		int distancia = (int) (Math.round(Math.random()*2)*10);
		try 
		{
			sleep(100);
			for (int i = 0; i <= distancia; i++) 
			{
				if (i == 0) 
				{
					System.out.println("#" + IdCarro + " começou a se mover");
				} 
				else 
				{
					deslocamento+=100;
					System.out.println("#" + IdCarro + ", andou " + deslocamento + " metros.");
				}
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		
	}
	
	
	/************************************************************
	 * Método que conta o tempo de estacionamento dos veículos
	 */
	private void estacionamento()
	{
		int tempo = (int) (Math.round(Math.random()* 2001) + 1000);
		System.out.println("O carro #" + IdCarro + ", estacionou!");
		try 
		{
			sleep(tempo);
		} 
		catch (Exception e) 
		{
			
		}
	}
	
	
	/******************************************************************
	 * Método que realiza a saída/liberação dos veículos estacionados
	 */
	private void saida()
	{
		System.out.println("O carro #" + IdCarro + ", saiu do estacionamento.");
	}
	
}


