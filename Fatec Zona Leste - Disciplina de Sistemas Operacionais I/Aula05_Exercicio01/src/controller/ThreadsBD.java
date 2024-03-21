package controller;

import java.util.concurrent.Semaphore;

public class ThreadsBD extends Thread {
	
	private int idOperacao;
	private int opera;
	private Semaphore semaforo;
	private int cont;
	private static int finish;

	
	public ThreadsBD(int id, int op, Semaphore semaforo, int c) 
	{
		this.idOperacao = id;
		this.opera = op;
		this.semaforo = semaforo;
		this.cont = c;
	}

	
	public void run() 
	{
		inicio();
		
		while (cont != opera) 
		{
			if(cont == 1) 
			{
			calc();
			}
			try 
			{
				semaforo.acquire();
				transacao();
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			} 
			finally 
			{
				semaforo.release();
				calc();
				cont++;
			}
		}
		
		fim();
	}

	
	private void inicio() 
	{
		System.out.println("#" + idOperacao + " - Iniciou a operação no Banco de Dados");
	}

	
	private void calc() 
	{
		int tempo = 0;
		
		if (idOperacao % 3 == 1) 
		{
			tempo = (int) ((Math.random() * 801) + 200);
			try 
			{
				sleep(tempo);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
		if (idOperacao % 3 == 2) 
		{
			tempo = (int) ((Math.random() * 1001) + 500);
			try 
			{
				sleep(tempo);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
		if (idOperacao % 3 == 0) 
		{
			tempo = (int) ((Math.random() * 1001) + 1000);
			try 
			{
				sleep(tempo);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
		System.out.println("#" + idOperacao + " - O cálculo demorou: " + (double) tempo / 1000 + "s.");
	}

	
	private void transacao() 
	{
		int tempo = 0;
		
		if (idOperacao % 3 == 1) 
		{
			tempo = 1000;
			
			try 
			{
				sleep(tempo);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
		if (idOperacao % 3 == 2) 
		{
			tempo = 1500;
			
			try 
			{
				sleep(tempo);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
		if (idOperacao % 3 == 0) 
		{
			tempo = 1500;
			
			try 
			{
				sleep(tempo);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
		System.out.println("#" + idOperacao + " - A transação demorou: " + (double) tempo / 1000 + "s.");
	}

	
	private void fim() 
	{
		finish++;
		
		System.out.println("Transação ID #" + idOperacao + " finalizada. posição: " + finish);
	}

}
