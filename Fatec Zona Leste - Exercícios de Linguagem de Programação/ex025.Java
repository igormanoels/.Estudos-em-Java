package ex25.tempodejogo;
 /**
 * @author GitHub @igormanoels
 */

import javax.swing.JOptionPane;

public class Ex25Tempodejogo {
    public static void main(String[] args) {
        Integer horaIn, minutoIn, horaFn, minutoFn, horaRes, minutoRes; 
        String minformatado;
        
           System.out.println("Insira a HH:MM de início e final de uma partida, para que o tempo seja cálculado");
        
        horaIn = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora de início da partida"));
        minutoIn = Integer.parseInt(JOptionPane.showInputDialog("Informe os minutos do início da partida"));
        horaFn = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora do final da partida"));
        minutoFn = Integer.parseInt(JOptionPane.showInputDialog("Informe os minutos do final da partida"));
        
        if (horaIn <= horaFn && minutoIn <= minutoFn)
            {
                horaRes = (horaFn - horaIn);
                minutoRes = (minutoFn - minutoIn);
                minformatado = String.format("%02d", minutoRes);
                    System.out.println("O tempo do jogo é " + horaRes + ":" + minformatado + "hs");
            }
    }   
}
