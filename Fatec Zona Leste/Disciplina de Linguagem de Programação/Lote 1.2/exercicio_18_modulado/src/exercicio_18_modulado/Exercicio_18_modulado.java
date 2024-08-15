package exercicio_18_modulado;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 18. Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor. 
 */

public class Exercicio_18_modulado {
    
    public static void main(String[] args) 
    {
        int num1, num2, res;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o segundo número: "));
        
        res = calcDiv(num1, num2);
        
        JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + res);
    }
    
    /*******************************************************
     * Função para Cálcular a diferença entre dois números.    
     */ 
    static int calcDiv(int n1, int n2)
    {
        int r;
        
        if (n1 > n2) 
        {
            r = n1 = n2;
        } 
        else 
        {
            r = n2 - n1;
        }
        
        return r;
    }
    
    
    
}
