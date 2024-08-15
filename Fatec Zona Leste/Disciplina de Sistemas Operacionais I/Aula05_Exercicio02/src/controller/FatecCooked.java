package controller;

import java.util.concurrent.Semaphore;

public class FatecCooked extends Thread {

    private int idComida;
    private Semaphore semaforo;
    private String NomeComida;

    public FatecCooked(int id, Semaphore semaforo) 
    {
        this.idComida = id;
        this.semaforo = semaforo;
    }

    public void run() 
    {
        inicio();
        cozinhando();

        try 
        {
            semaforo.acquire();
            entrega();
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            semaforo.release();
            fim();
        }
    }

    private void inicio() 
    {
        System.out.println("Novo Pedido #" + idComida);
    }

    private void cozinhando() 
    {
        int tempo = 0;
        int pausa = 100;

        if (idComida % 2 == 0) 
        {
            NomeComida = "Lasanha a Bolonhesa";
            tempo = (int) ((Math.random() * 601) + 600);
        } 
        else 
        {
            NomeComida = "Sopa de Cebola";
            tempo = (int) ((Math.random() * 301) + 500);
        }

        while (pausa <= tempo) 
        {
            if ((int) pausa / 100 == (int) tempo / 100) 
            {
                int aux = tempo - pausa;
                pausa += aux;
            }
            try 
            {
                sleep(pausa);
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }

            System.out.println("Pedido #" + idComida + " - O prato: " + NomeComida 
            				 + " está sendo preparada: " + (100 * pausa) / tempo + "%");
            pausa += 100;
        }

        System.out.println("Pedido #" + idComida + ", ficou pronto!!!");
    }

    private void entrega() 
    {
        System.out.println("Pedido #" + idComida + " - O prato: " + NomeComida 
        				 + " será servida...");
        try 
        {
            sleep(500);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }

    private void fim() 
    {
        System.out.println("Pedido #" + idComida + " - O prato: " + NomeComida 
        				 + ", foi servida com sucesso!");
    }
}
