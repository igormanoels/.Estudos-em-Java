package exercicio_27_modulado;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  27. Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). 
 *  Calcule e mostre a velocidade média em km/h.
 */

public class Exercicio_27_modulado {

    public static void main(String[] args) {
        int nVoltas, distancia, tempoMin;
        double resp;
        Scanner ler = new Scanner (System.in);
        
        System.out.print("Favor informar o número de voltas da prova: ");
        nVoltas = ler.nextInt();
        
        System.out.print("Favor informar o número de metros: ");
        distancia = ler.nextInt();
        
        System.out.print("Favor informar a duração da prova em minutos: ");
        tempoMin = ler.nextInt();
        
        resp = calcVelo(nVoltas, distancia, tempoMin);
        JOptionPane.showMessageDialog(null, "A velocidade foi de " + resp + "km/h");
                
    }
    
    /******************************************************************
     * Função para cálcular a velocidade durante a prova de atletismo.    
     */ 
    static double calcVelo(int volt, int dist, int temp)
    {
        double res = ((volt * dist) / temp);
        return res;
    }
    
}
