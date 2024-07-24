package edu.dio.exercicio01;

import javax.swing.JOptionPane;

public class SmartTV 
{
	// estado inicial da tv
	boolean ligada = false;
	int canal = 1;
	int volume = 15;
	
	
	public void ligar()
	{
		ligada = true;
		JOptionPane.showMessageDialog(null, "A TV está Ligada"
					+ "\n Canal: " + canal 
					+ "\n Volume: " + volume);
	}
	
	
	public void desligar()
	{
		ligada = false;
		JOptionPane.showMessageDialog(null, "Tv Desligada, até logo!");
	}
	
	
	public void aumentarVolume()
	{
		volume++;
		JOptionPane.showMessageDialog(null, "Volume: " + volume);
	}
	
	
	public void diminuirVolume()
	{
		volume--;
		JOptionPane.showMessageDialog(null, "Volume: " + volume);
	}
	
	
	public void trocarCanal()
	{
		canal = Integer.parseInt(JOptionPane.showInputDialog("Digite o canal desejado: "));
		JOptionPane.showMessageDialog(null, "Canal escolhido: " + canal);
	}
	
}
