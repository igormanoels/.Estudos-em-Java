package exercicio_34;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 34. Receba um número. Calcule e mostre os resultados da tabuada desse número.
 */

public class Exercicio_34 {

    public static void main(String[] args) {
        int tab, res;
        
        tab = Integer.parseInt(JOptionPane.showInputDialog("De qual número você deseja saber a tabuada?"));
        
        for (int i = 0; i <= 10; i++) 
        {
            res = tab * i;
            System.out.println(tab + " x " + i + " = " + res);
            //JOptionPane.showMessageDialog(null,"Tabuada: " + tab + " x " + i + " = " + res);
        }
        
    }
    
}
