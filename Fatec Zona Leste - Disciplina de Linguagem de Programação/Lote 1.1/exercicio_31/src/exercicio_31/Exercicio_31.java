package exercicio_31;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 * 31. Calcule e mostre o quadrado dos números entre 10 e 150.
 */

public class Exercicio_31 {

    public static void main(String args []) {
        int quadrado;
	
        for (int i = 10; i <= 150 ; i++) {
            quadrado = (int) Math.pow(i, 2);
            JOptionPane.showMessageDialog(null, "O quadrado de " + i + " é = " + quadrado );
            try 
            {
                Thread.sleep(500);
            } 
            catch (Exception e) 
            {
                // TODO: handle exception
            }   
	}
    }
    
}
