package exercicio_35_modulado;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  35. Receba 2 números inteiros, verifique qual o maior entre eles. 
 *  Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
 */

public class Exercicio_35_modulado {

    static int n1, n2, sum;
	
    public static void main(String[] args) 
    {
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o primeiro número: "));
	n2 = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o primeiro número: "));
		
	verifMaior();
		
	JOptionPane.showMessageDialog(null, "A somatória dos valores impares desse intervo é: " + sum);
    }
	
    /**************************************************
     * Função para Verificar qual dos números é maior.    
     */ 
    static void verifMaior()
    {
        int aux;
		
	if (n2 < n1) 
	{
            aux = n1;
            n1 = n2;
            n2 = aux;
	}
		
	calcSumImpar();
    }
	
    /****************************************************************************
     * Função para verificar e somar os números impares no intervalo de N1 e N2.   
     */ 
    static void calcSumImpar() 
    {
        sum = 0;
		
        for (int i = n1; i <= n2; i++) 
	{
            if (i % 2 != 0) 
            {
                sum = sum + i;
            }
	}
    }
    
}
