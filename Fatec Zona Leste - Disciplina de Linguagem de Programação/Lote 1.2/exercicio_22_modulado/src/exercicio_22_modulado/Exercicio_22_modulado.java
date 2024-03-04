package exercicio_22_modulado;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 22. Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 */

public class Exercicio_22_modulado {


    public static void main(String[] args) 
    {
        int num1, num2;
        String resp;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o segundo número: "));
        
        resp = verfSeq(num1, num2);
        JOptionPane.showMessageDialog(null, resp);
    }
    
    /*********************************************
     * Função para verifiacar a ordem dos valores.    
     */ 
    public static String verfSeq(int n1, int n2)
    {
        String res;
        
        if (n1 == n2) 
        {
            res = "Os números informados são iguais.";
        } 
        else 
        {
            if (n1 < n2) 
            {
                res = "Sequência: " + n1 + ", " + n2;   
            } 
            else 
            {
                res = "Sequência: " + n2 + ", " + n1;
            }
        }
        return res;
    }
    
}
