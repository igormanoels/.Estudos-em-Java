package exercicio_19_modulado;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 19. Receba 2 valores reais. Calcule e mostre o maior deles.
 */

public class Exercicio_19_modulado {

    public static void main(String[] args) 
    {
        int num1, num2;
        String resp;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o valor do primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o valor do segundo número: "));
        
        resp = verifMaior(num1,num2);
        
        JOptionPane.showMessageDialog(null, "Números informados: " + num1 + ", " + num2 + "\n" + resp);
    }
    
    /********************************************
     * Função para verificar qual o maior valor.    
     */ 
    static String verifMaior(int n1, int n2)
    {
        String resp;
        
        if (n1 == n2)
        {
            resp = "Os valores são iguais";
        }
        else if (n1 > n2)
        {
            resp = "O primeiro valor é o maior";
        }
        else 
        {
            resp = "O segundo valor é o maior";
        }
        
        return resp;
    }
}
