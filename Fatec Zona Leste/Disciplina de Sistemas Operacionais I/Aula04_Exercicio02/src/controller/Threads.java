package controller;

public class Threads extends Thread {
    
    private int[] ThreadSoma;

    public Threads(int[] linhaMatriz) 
    {
        this.ThreadSoma = linhaMatriz;
    }

    @SuppressWarnings("deprecation")
    public void run() 
    {
        int somaLinha = 0;
        
        for (int i : ThreadSoma) 
        {
        	somaLinha += i;
        }
        
        System.out.println("Tid: " + getId() + " --> Total da linha = " + somaLinha);
    }
}
