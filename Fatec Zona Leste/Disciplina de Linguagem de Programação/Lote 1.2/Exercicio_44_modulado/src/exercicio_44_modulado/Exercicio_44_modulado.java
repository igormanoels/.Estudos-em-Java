package exercicio_44_modulado;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 44. Receba o número da base e do expoente. Calcule e mostre o valor da potência.
 */

public class Exercicio_44_modulado {

    public static void main(String[] args) 
    {
        int base, expo;
        double res;
        
        base = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da base: "));
        expo = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do expoente: "));
        
        res = calcPotencia(base, expo);
        
        JOptionPane.showMessageDialog(null, "O resultado da potencia é " + res);
    }
    
     /***************************************************
     * Cálcula a potência a partir da base e do expoente 
     */
    static double calcPotencia(int base, int expo)
    {
        double res = Math.pow(base, expo);
        return res;
    }
    
}
