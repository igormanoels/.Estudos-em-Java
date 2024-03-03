package exercicio_20_modulado;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 20. Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. 
 *     Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
*/

public class Exercicio_20_modulado {
    static int valorA, valorB, valorC;
    static double x1, x2;
 
    public static void main(String[] args) 
    {   
        
        valorA = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o valor de A: "));
        valorB = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o valor de B: "));
        valorC = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o valor de C: "));
        
        x1 = calcX1 ();
        x2 = calcX2 ();
        
        JOptionPane.showMessageDialog(null, "Equação: " + valorA + "x²" + valorB + "x="+ valorC + "\n" + "X¹ = " + x1 + " - x² = " + x2);
    }
    
    /********************************************
     * Função para Cálcular o valor de x1 linha.    
     */ 
    static double calcX1()
    {
        double delta, valX1;
        
        delta = calcDelta();
        valX1 = (-valorB + (Math.sqrt(delta))) / (2 * valorA);
        
        return valX1;
    }
    
    /********************************************
     * Função para Cálcular o valor de x2 linha.
     */ 
    static double calcX2()
    {
        double delta, valX2;
        
        delta = calcDelta();
        valX2 = (-valorB - (Math.sqrt(delta))) / (2 * valorA);
        
        return valX2;
    }
    
    /****************************************************************************
     * Função usada pelas funções calcX1 e calcX2 para retornar o valor de delta.    
     */ 
    static double calcDelta()
    {
        double delta = ((Math.pow(valorB, 2)) - (4 * valorA * valorC));
        return delta;
    }
    
}
