package exercicio_30;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 */

public class Exercicio_30 {

    public static void main(String[] args) {
        String dataNasc;
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataAtual = LocalDate.now();
        
        JOptionPane.showMessageDialog(null, "Favor informar a data no padrão XX/XX/20XX.");
        dataNasc = JOptionPane.showInputDialog("Favor informar sua data de nascimento: ");
        
        LocalDate dataN = LocalDate.parse(dataNasc, formatoData);

        Period periodo = Period.between(dataN, dataAtual);
        
        JOptionPane.showMessageDialog(null, "A Diferença é de: " + periodo.getYears() + " anos, " + periodo.getMonths() + " mêses e " + periodo.getDays() + " dias");
        
    }
    
}
