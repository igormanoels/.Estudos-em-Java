package controller;

import java.util.concurrent.Semaphore;

public class ThreadTransacao extends Thread{
    
    private int ThreadTrans;
    private Semaphore perms;
    private String acao;
    
    /*********************************
	 * Método construtor da classe
	 */
    public ThreadTransacao(int n, Semaphore p, String a) 
    {
        this.ThreadTrans = n;
        this.perms = p;
        this.acao = a.toLowerCase();
    }
    
    /*****************************************
	 * Método que executa as ações da Thread
	 */	
    public void run() 
    {
        try 
        {
            perms.acquire();
            transacao();
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        finally 
        {
            perms.release();
        }
    }
    
    /***********************************************************************************
	 * Método que realiza o controle das operacoes delimitando um tempo por transacao.
	 */
    private void transacao() 
    {
        try 
        {
            System.out.println("#" + ThreadTrans + ", " + acao + " iniciada.");
            if (acao.contains("de")) 
            {
                Thread.sleep(1000);
            } 
            else 
            {
                Thread.sleep(2000);
            }
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        finally 
        {
            System.out.println("#" + ThreadTrans + ", " + acao + " finalizada.");
        }
    }   
    
}
