package controller;

import java.util.concurrent.Semaphore;

public class ControladorDeTransito extends Thread {
    
    private int num;
    private Semaphore semaforo;
    private Semaphore vez;
    private String lado;
    
    /*********************************
	 * Método construtor da classe
	 */
    public ControladorDeTransito(int n, Semaphore semaforo, Semaphore vez, String lado) 
    {
        this.num = n;
        this.semaforo = semaforo;
        this.vez = vez;
        this.lado = lado;
    }
    
    /*****************************************
	 * Método que executa as ações da Thread
	 */	
    public void run() 
    {
        try 
        {
            vez.acquire();
            
            semaforo.acquire();
            ControleDoFarol();
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        finally 
        {
            semaforo.release();
            vez.release(); 
        }
    }
    
    
    /******************************************
	 * Método que controla o tempo do semaforo
	 */
    private void ControleDoFarol()
    {   
        try 
        {
        	System.out.print("\n#" + num + " ----> O farol " + lado + " abriu.");
        	System.out.print("\nTempo do Semáforo: ");
        	for (int i = 0; i < 30; i++) 
        	{
        		Thread.sleep(1000); 
        		System.out.print( (i+1) + " " );
        		if (i == 24) 
        		{
                    System.out.println("\n#" + num + " ----> Atenção o farol " + lado + " está amarelo.");
				}                
			}
            System.out.println("\n#" + num + " ----> O farol " + lado + " fechou." );
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
