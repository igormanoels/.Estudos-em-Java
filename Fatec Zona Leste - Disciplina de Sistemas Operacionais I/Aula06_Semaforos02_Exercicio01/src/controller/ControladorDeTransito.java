package controller;

import java.util.concurrent.Semaphore;

public class ControladorDeTransito extends Thread {
	
	private int vez;
	private Semaphore tempo;
	private String lado;
	
	
	/*********************************
	 * Método construtor da classe
	 */
	public ControladorDeTransito(int n, Semaphore t, String l) 
	{
		this.vez = n;
		this.tempo = t;
		this.lado = l;
	}
	
	
	/*****************************************
	 * Método que executa as ações da Thread
	 */	
	public void run() 
	{
		FarolVerde();
		
		try 
		{
			FarolAmarelo();
			tempo.acquire();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			tempo.release();
			FarolVermelho();
		}
	}
	
	/*******************************************
	 * Método que realiza a liberação do farol
	 */
	private void FarolVerde()
	{	
		try 
		{
			System.out.println("#" + vez + " ----> O farol " + lado + " abriu.");
			sleep(25000);

		} 
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	private void FarolAmarelo()
	{
		System.out.println("#" + vez + " ----> Atenção o farol " + lado + " está amarelo.");
	}
	private void FarolVermelho() 
	{
		System.out.println("#" + vez + " ----> O farol " + lado + " fechou." );
	}
}
