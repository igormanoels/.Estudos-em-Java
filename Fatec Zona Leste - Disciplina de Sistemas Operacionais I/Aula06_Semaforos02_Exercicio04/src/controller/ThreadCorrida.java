package controller;

import java.util.concurrent.Semaphore;

public class ThreadCorrida extends Thread {
 
    private int carro;
    private Semaphore pista;
    private Semaphore espera;
    private String escuderia;
    private double voltaMaisRapida = Double.MAX_VALUE;
    
    /*********************************
	 * Método construtor da classe
	 */
    public ThreadCorrida(int carro, Semaphore pista, Semaphore espera, String escuderia) 
    {
        this.carro = carro;
        this.pista = pista;
        this.espera = espera;
        this.escuderia = escuderia;
    }
    
    /*****************************************
	 * Método que executa as ações da Thread
	 */	
    public void run() 
    {
        try 
        {
            espera.acquire(); 
            pista.acquire(); 
            voltas();
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        finally 
        {
            pista.release(); 
            espera.release();
            exibirResultado();
        }
    }
    
    /***************************************************************************
	 * Método que realiza o controle do tempo de deslocamento e numero de voltas
	 */
    private void voltas() 
    {
        try 
        {
            for (int i = 1; i <= 3; i++) 
            {
                Thread.sleep((long) (Math.random() * 1000) + 1000); 
                double tempoVolta = Math.random() * 10 + 80; 
                if (tempoVolta < voltaMaisRapida) 
                {
                    voltaMaisRapida = tempoVolta; 
                }
                System.out.println("Carro #" + carro + ", Escuderia " + escuderia + ", Volta " 
                				+ i + ": " + tempoVolta + " segundos");
            }
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }   
    
    /**********************************************
   	 * Método que exibe o resultado de cada carro
   	 */
    private void exibirResultado() 
    {
        System.out.println("Carro #" + carro + " da Escuderia " + escuderia 
        				 + ", volta mais rápida: " + voltaMaisRapida + " segundos");
    }
}
