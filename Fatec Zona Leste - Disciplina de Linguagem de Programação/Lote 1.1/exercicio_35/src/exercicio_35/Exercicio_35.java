package exercicio_35;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 35. Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
 */

public class Exercicio_35 {

    public static void main(String[] args) {
        int num1, num2, res = 0;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("informe o segundo valor: "));
        
        if (num1 == num2) 
        {
            JOptionPane.showMessageDialog(null, "Não há intervalo para os números informados.");
        } 
        else 
        {
            if (num1 > num2) 
            {
                for (int i = num2; i <= num1; i++) 
                {
                    if (i % 2 != 0) 
                    {
                        res = res + i;
                    }
                }
            } 
            else 
            {
                for (int i = num1; i <= num2; i++) 
                {
                    if (i % 2 != 0) 
                    {
                        res = res + i;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "A somatória dos números impares do intervalo é " + res);
        }
        
        
    }
    
}
