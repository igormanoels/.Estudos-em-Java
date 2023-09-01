package jurossimples;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class Jurossimples {
    public static void main(String[] args) {
        Double numMes, valor, reajuste, percentual, montante;
        
        numMes = Double.parseDouble(JOptionPane.showInputDialog("Qual o duração da aplicação em meses?"));
        percentual = Double.parseDouble(JOptionPane.showInputDialog("Qual valor do reajuste?"));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o montante para investimento?"));
        
        reajuste = ((numMes * (percentual / 100) ) * valor);
        montante = reajuste + valor;
            System.out.println("O valor do montante reaajustado é de: R$" + montante);
    }
}