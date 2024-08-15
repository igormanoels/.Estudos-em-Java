package exercicio_23_modulado;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  23. Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. 
 *  Mostre os 4 números em ordem crescente.
 */

public class Exercicio_23_modulado {
    
    static int num1, num2, num3, num4;
    static String seq;
    
    public static void main(String[] args)
    {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Favor informar o primeiro número: ");
        num1 = ler.nextInt();
        
        //Recebe o segundo número e verifica se ele é menor que o anterior
        System.out.print("Favor informar o segundo número: ");
        do 
        {            
            num2 = ler.nextInt();
            if (num2 < num1) 
            {
                System.out.print("O número informado precisa ser maior que o anterior: ");
            }
        } while (num2 < num1);
        
        //Recebe o terceiro número e verifica se ele é menor que o anterior
        System.out.print("Favor informar o terceiro número: ");
        do 
        {            
            num3 = ler.nextInt();
            if (num3 < num2) 
            {
                System.out.print("O número informado precisa ser maior que o anterior: ");
            }
        } while (num3 < num2);
        
        System.out.print("Favor informar o quarto número: ");
        num4 = ler.nextInt();
        
        ler.close();
        
        verfSeq();
        JOptionPane.showMessageDialog(null, seq);
                
    }
   
    /**********************************************
     * Função para verifiacar a ordem dos valores.    
     */ 
    public static void verfSeq()
    {
        if (num4 <= num1) 
        {
            seq = "Sequência: " + num4 + ", " + num1 + ", " + num2 + ", " + num3;
        } 
        else 
        {
            if (num4 <= num2) 
            {
                seq = "Sequência: " + num1 + ", " + num4 + ", " + num2 + ", " + num3; 
            } 
            else 
            {
                if (num4 <= 3) 
                {
                    seq = "Sequência: " + num1 + ", " + num2 + ", " + num4 + ", " + num3;
                } 
                else 
                {
                    seq = "Sequência: " + num1 + ", " + num2 + ", " + num3 + ", " + num4;
                }
            }
        }
    }
}
