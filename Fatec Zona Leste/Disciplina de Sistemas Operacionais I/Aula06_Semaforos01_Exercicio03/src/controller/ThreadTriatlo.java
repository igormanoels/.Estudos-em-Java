package controller;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class ThreadTriatlo extends Thread {

    private int numeroAtleta;
    private Semaphore semaforoArmas;
    private static Random random = new Random();
    private static int pontuacao = 250;

    public ThreadTriatlo(int na, Semaphore semaforo) 
    {
        this.numeroAtleta = na;
        this.semaforoArmas = semaforo;
    }

    public void run() 
    {
        try 
        {
        	semaforoArmas.acquire(); 
            correr();
            disparar();
            pedalar();
        } 
        catch 
        (InterruptedException e) 
        {
            e.printStackTrace();
        }
        finally
        {
        	semaforoArmas.release();
        }
    }

    private void correr() throws InterruptedException 
    {
        int distanciaCorrida = 0;
        while (distanciaCorrida < 3000) 
        {
            int distanciaPercorrida = random.nextInt(6) + 20; 
            distanciaCorrida += distanciaPercorrida;
            Thread.sleep(30); 
        }
        System.out.println("Atleta " + numeroAtleta + " completou a corrida.");
    }

    private void disparar() throws InterruptedException 
    {
        
        System.out.println("Atleta " + numeroAtleta + " está atirando.");
        int pontuacaoTiro = 0;
        for (int i = 0; i < 3; i++) 
        {
            int tempoDisparo = (Math.round(random.nextInt(2501)) + 500); 
            Thread.sleep(tempoDisparo);
            pontuacaoTiro += random.nextInt(11); 
        }
        System.out.println("Atleta " + numeroAtleta + " pontuou " + pontuacaoTiro + " nos tiros.");
        pontuacao += pontuacaoTiro; 
        
    }

    private void pedalar() throws InterruptedException 
    {
        int distanciaPedalada = 0;
        while (distanciaPedalada < 5000) 
        {
            int distanciaPercorrida = (Math.round(random.nextInt(11)) + 30); 
            distanciaPedalada += distanciaPercorrida;
            Thread.sleep(40); 
        }
        System.out.println("Atleta " + numeroAtleta + " completou o ciclismo.");
        System.out.println("Pontuação final do Atleta " + numeroAtleta + ": " + pontuacao);
    }
}
