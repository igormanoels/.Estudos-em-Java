package exercicio_17_modulado;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  17. Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. 
 *  Receber o tempo de percurso e a velocidade média.
 */

public class Exercicio_17_modulado {

    public static void main(String[] args) 
    {
        double percurso, veloMd, litros;
        
        percurso = Double.parseDouble(JOptionPane.showInputDialog("Favor infomar o distrodada: "));
        veloMd = Double.parseDouble(JOptionPane.showInputDialog("Favor informar a velocidade m"));
        litros = calcLt(percurso, veloMd);
    
        JOptionPane.showMessageDialog(null, "A quantidade de litros " + litros + " lts");
    }
  
    /*****************************************************
     * Função para Cálcular o gasto de Gasolina em litros.    
     */ 
    static double calcLt(double perc, double velo) 
    {
        double res = ((perc / velo) * 12);
        return res;
    }
    
}
