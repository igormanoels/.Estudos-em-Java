package view;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  1) Cruzamento Lado Norte e sul: Para tal, usar uma variável sentido, que será alterado 
 *  pela Thread que controla cada carro com a movimentação do carro. Quando a Thread 
 *  tiver a possibilidade de ser executada, ela deve imprimir em console o sentido 
 *  que o carro está passando. Só pode passar um carro por vez no cruzamento.
 */

import java.util.concurrent.Semaphore;
import controller.ControladorDeTransito;

public class Principal {
    
    public static void main(String[] args) 
    {
        Semaphore semaforo = new Semaphore(1); 
        Semaphore vez = new Semaphore(1); 
        
        for (int i = 1; i < 20; i++) 
        {
            String lado = (i % 2 == 0) ? "A" : "B";
            ControladorDeTransito cet = new ControladorDeTransito(i, semaforo, vez, lado);
            cet.start();
        }
    }
}
