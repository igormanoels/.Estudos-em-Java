package exercicio_25_modulado;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 *  25. Receba a hora de início e de final de um jogo (HH,MM) sabendo que o     
 *  tempo máximo é de 24 horas e pode começar num dia e terminar noutro.
 */

public class Exercicio_25_modulado {
    static int horaI, minI, horaF, minF, tempH, tempM;
    
    public static void main(String[] args) 
    {
        horaI = Integer.parseInt(JOptionPane.showInputDialog("Favor informar a hora de início da partida: "));
        minI = Integer.parseInt(JOptionPane.showInputDialog("Favor informar os minutos do início : "));
        horaF = Integer.parseInt(JOptionPane.showInputDialog("Favor informar a hora de término da partida: "));
        minF = Integer.parseInt(JOptionPane.showInputDialog("Favor informar os minutos do término: "));
        
        calcTempo();
        JOptionPane.showMessageDialog(null, "Horário de início: " + horaI + ":" + minI + "hs.\n"
                                        +   "Horário de término: " + horaF + ":" + minF + "hs.\n"
                                        +   "Tempo de partida: " + tempH + ":" + tempM + "hs.");
    }
    
    /****************************************************
     * Função para verifiacar qual a duração da partida.    
     */ 
    static void calcTempo()
    {   
        if (horaI <= horaF && minI <= minF) 
        {
            tempH = horaF - horaI;
            tempM = minF - minI;
        } 
        else if (horaI <= horaF && minI >= minF)
        {
            tempH = (horaF - 1 ) - horaI;
            tempM = (minF + 60) - minI;
        }
        else if (horaI > horaF && minI <= minF)
        {
            tempH = (24 - horaI) + horaF;
            tempM = minF - minI;
        }
        else if(horaI > horaF && minI >= minF)
        {
            tempH = (24 - horaI) + horaF;
            tempM = (minF + 60) - minI;
        }
                
        // Ajuste no tempo, caso min chegue a 60, é acrescido uma hora.
        if (tempM >= 60) 
        {
         tempM = tempM - 60;
         tempH = tempH + 1;
        }
    }
    
}
