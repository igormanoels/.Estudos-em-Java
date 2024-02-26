package exercicio_37;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  37. Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
 */

public class Exercicio_37 {

    public static void main(String[] args) {
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos valores da serie de Fibonacci você gostaria de saber."));
        
     
        
        if (num <= 0 )
        {
            JOptionPane.showMessageDialog(null, "O Número informado é inválido.");
        }
        else
        {
            int[] fibo = new int[num];
            fibo[0] = 1;
            
            
            if (num == 1)
            {
                System.out.println("Fibonacci:\t" + fibo[0]);
            }
            else
            {
                fibo[1] = 1;
                
                for (int i = 2; i < num; i++) 
                {
                    fibo[i] = fibo[i-1] + fibo[i-2];        
                }

                System.out.print("Fibonacci\t");

                for (int i = 0; i < num; i++) 
                {
                    System.out.print(fibo[i] + "\t");
                }

            }
        }
    }
    
}
