package exercicio_33_modulado;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 	33. Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
 */

public class Exercicio_33_modulado {

    public static void main(String[] args) 
    {
        double exp; 
	int num;
		
	num = Integer.parseInt(JOptionPane.showInputDialog("Informe o número desejado para cálculo da série: "));
	
	exp = calcSerie(num);
		
	JOptionPane.showMessageDialog(null, "Resultado: " + exp);
    }
	
	
    /*********************************************************
     * Função para realizar o cálculo de uma série matemática.    
     */ 
    static double calcSerie(int n)
    {
        double serie = 1.0;
		
	for (int i = 0; i <= n; i++) 
	{
            serie = serie + (1.0/n);
        }
		
	return serie;
    }
    
}
