package exercicio_40;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 40. Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
 */

public class Exercicio_40 {

    public static void main(String[] args) {
        int num1,num2,aux;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o primeiro n"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o segundo n"));
        
        if (num1 > num2) 
        {
            aux = num2;
            num2 = num1;
            num1 = aux;
        } 
        
        System.out.print("Primos: ");
        
        for (int i = num1 + 1; i < num2; i++) 
        {
            if (i == 2 || i == 3 || i == 5 || i == 7) 
            {
                System.out.print(String.valueOf(i) + " ");
            } 
            else if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) 
            {
                System.out.print(String.valueOf(i) + " ");
            } 
        } 

    }
    
}
