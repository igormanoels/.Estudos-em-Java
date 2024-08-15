package controller;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class ThreadAeroporto extends Thread {

    private String pista;
    private Semaphore semaforoOperacao;
    private Semaphore semaforoDecolagemNorte;
    private Semaphore semaforoDecolagemSul;
    private Semaphore semaforoAreaDecolagem;
    private static Random random = new Random();

    public ThreadAeroporto(String p, Semaphore so, Semaphore sdn, Semaphore sds, Semaphore sd) 
    {
        this.pista = p;
        this.semaforoOperacao = so;
        this.semaforoDecolagemNorte = sdn;
        this.semaforoDecolagemSul = sds;
        this.semaforoAreaDecolagem = sd;
    }

    public void run() 
    {
        try 
        {
            semaforoOperacao.acquire(); 
            taxiar();
            decolar();
            afastar();
        } 
        catch 
        (InterruptedException e) {
            e.printStackTrace();
        }
        finally
        {
        	semaforoOperacao.release(); 
        }
    }

    private void taxiar() throws InterruptedException 
    {
        System.out.println("Avião na pista " + pista + " taxeando.");
        Thread.sleep(random.nextInt(501) + 500); 
    }

    private void decolar() throws InterruptedException 
    {
        if (pista.equals("Norte")) 
        {
            semaforoDecolagemNorte.acquire(); 
        } 
        else 
        {
            semaforoDecolagemSul.acquire(); 
        }

        semaforoAreaDecolagem.acquire(); 
        System.out.println("Avião na pista " + pista + " decolando.");
        Thread.sleep(random.nextInt(201) + 600); 
        semaforoAreaDecolagem.release(); 

        if (pista.equals("Norte")) 
        {
            semaforoDecolagemNorte.release(); 
        } 
        else 
        {
            semaforoDecolagemSul.release(); 
        }
    }

    private void afastar() throws InterruptedException 
    {
        System.out.println("Avião na pista " + pista + " afastando-se da área.");
        Thread.sleep(random.nextInt(501) + 300); 
    }
}
