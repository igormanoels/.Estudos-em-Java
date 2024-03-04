package exercicio_24_modulado;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 24. Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
 */

public class Exercicio_24_modulado {

    public static void main(String[] args) 
    {
        int num;   
        num = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o número desejado: "));
    
        String res = verfNum(num);
        JOptionPane.showMessageDialog(null, res);
    }
    
    /***********************************************************
     * Função para verifiacar se o número é divisível por 2 e 3.    
     */ 
    static String verfNum(int n)
    {
        String resp;
        
        if (n % 2 == 0 && n % 3 == 0) 
        {
            resp = "O número informado é divisível por 2 e 3";
        } 
        else 
        {
            resp = "O número informado não é divisível por 2 e 3";
        }
        
        return resp;
    }
    
}
