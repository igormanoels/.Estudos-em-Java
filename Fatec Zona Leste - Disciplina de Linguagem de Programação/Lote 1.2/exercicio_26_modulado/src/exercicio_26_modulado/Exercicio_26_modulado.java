package exercicio_26_modulado;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 26. Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
 */

public class Exercicio_26_modulado {

    public static void main(String[] args) 
    {
        int num1, num2;
        String resp;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o segundo número: "));
        
        resp = verfSeMultip(num1, num2);
        JOptionPane.showMessageDialog(null, resp);
    }
    
    /****************************************************************
     * Função para verifiacar se o Maior é múltiplo ou não do menor.    
     */ 
    static String verfSeMultip(int n1, int n2)
    {
        String res;
        if (n1 == n2) 
        {
            res = "Os números são iguais.";
        } 
        else 
        {
            if (n1 > n2) 
            {
                if (n1 % n2 == 0) 
                {
                    res = "O maior é múltiplo do menor.";
                } 
                else 
                {
                    res = "O maior não é múltiplo do menor.";
                }
            } 
            else 
            {
                if (n2 % n1 == 0) 
                {
                    res = "O maior é múltiplo do menor.";
                } 
                else 
                {
                    res = "O maior não é múltiplo do menor";
                }
            }
        }
        return res;
    }
    
}
