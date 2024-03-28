package view;

import controller.ThreadCorrida;
import java.util.concurrent.Semaphore;

public class Principal {

    public static void main(String[] args) 
    {
        Semaphore pista = new Semaphore(5); 
        Semaphore[] espera = new Semaphore[7]; 
        
        for (int i = 0; i < espera.length; i++) 
        {
            espera[i] = new Semaphore(1); 
        }
        
        for (int i = 0; i < 14; i++) 
        {
            char escuderia = (char) ('A' + (i % 7));
            ThreadCorrida carro = new ThreadCorrida(i + 1, pista, 
            		espera[escuderia - 'A'], String.valueOf(escuderia));
            carro.start();
        }
    }
}
