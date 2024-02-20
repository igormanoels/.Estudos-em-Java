package exercicio_25;

import javax.swing.JOptionPane;

/**
 * Fatec Zona Leste - Análise e Desenvolvimento de Sistemas
 * @author Igor Manoel
 * Github: igormanoels
 */

public class Exercicio_25 {

    public static void main(String[] args) {
        String tempo;
        int hIni, hFin, hJogada, mJogada;
        
        JOptionPane.showMessageDialog(null, "Favor inserir o horário no seguinte formato \"hh:mm\" ");
        
        tempo = JOptionPane.showInputDialog("Favor informar o hora inicial da partida: ");
        String [] iniTime = tempo.split(":");
        
        tempo = JOptionPane.showInputDialog("Favor informar o hora inicial da partida: ");
        String [] fnTime = tempo.split(":");
        
        hIni = (Integer.parseInt(iniTime[0]) * 60) + (Integer.parseInt(iniTime[1]));
        hFin = (Integer.parseInt(fnTime[0]) * 60) + (Integer.parseInt(fnTime[1]));

        if (hIni > hFin) 
        {
            hJogada = Integer.parseInt(fnTime[0]);
            mJogada = (60 - Integer.parseInt(iniTime[1])) + Integer.parseInt(fnTime[1]); 
            
            if ((Integer.parseInt(iniTime[0]) == 23)) 
            { 
                if (mJogada > 60) {
                    mJogada = mJogada - 60;
                    hJogada = hJogada + 1;
                }
            } 
            else 
            {
                hJogada = hJogada + (24 - Integer.parseInt(iniTime[0]));
            }
        } 
        else 
        {
            hJogada = ((hFin - hIni) / 60);
            mJogada = ((hFin - hIni) % 60);            
        }
        
        JOptionPane.showMessageDialog(null, "Tempo de Jogo: " + hJogada + ":" + mJogada + "min");

        
    }
    
}
