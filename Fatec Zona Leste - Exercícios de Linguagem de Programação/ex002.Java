package reajustesalarial;
/**
 * @author s.igormanoel
 */

import javax.swing.JOptionPane;
        
public class Reajustesalarial {
    public static void main(String[] args) {
       String funcionario;
        int percentual, salario, reajuste, valorreajustado;
        
        funcionario = (JOptionPane.showInputDialog("Qual o nome do funcionário?"));
        percentual = Integer.parseInt(JOptionPane.showInputDialog("Qual o percentual de reajuste?"));
        salario = Integer.parseInt(JOptionPane.showInputDialog("Qual o salário atual?"));
        
        
        reajuste = ((salario * percentual) / 100);
        valorreajustado = (salario + reajuste);
        
            System.out.println("Salário de " + funcionario + " já reajustado é de: R$" + valorreajustado + ",00");
    } 
}