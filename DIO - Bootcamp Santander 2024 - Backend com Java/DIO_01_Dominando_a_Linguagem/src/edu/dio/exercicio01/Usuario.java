package edu.dio.exercicio01;

import javax.swing.JOptionPane;

	/*	
	 * 	Ex. Vamos criar um exemplo de uma classe para representar uma SmartTV onde:
	 * 	1. Ela tenha as características: ligada (boolean), canal (int) e volume (int)
	 * 	2. Nossa TV poderá ligar e desligar e assim mudar o estado ligada
	 * 	3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
	 * 	4. Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente 
	 */

public class Usuario 
{
	static int op;
		
	public static void main(String[] args) 
	{
		SmartTV smartTv = new SmartTV();
		String estado = (smartTv.ligada == false)? "A Tv está Desligada." : "A Tv está Ligada.";
		
		JOptionPane.showMessageDialog(null, estado,"Estado da televisão",JOptionPane.INFORMATION_MESSAGE);
		
		
		do 
		{
			op = Integer.parseInt(JOptionPane.showInputDialog("Controle\n"
					+ "1 - Ligar TV\n" 
					+ "2 - Aumentar Volume\n"
					+ "3 - Diminuir Volume\n" 
					+ "4 - Trocar Canal\n"
					+ "0 - Desligar TV\n"));
			
			switch (op) 
			{
				case 0:
					smartTv.desligar();
					break;
				case 1:
					smartTv.ligar();
					break;
				case 2:
					smartTv.aumentarVolume();
					break;
				case 3:
					smartTv.diminuirVolume();
					break;
				case 4:
					smartTv.trocarCanal();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção Inválida");
					break;
			}
			
		} while (op != 0);
		
		
	}
}
