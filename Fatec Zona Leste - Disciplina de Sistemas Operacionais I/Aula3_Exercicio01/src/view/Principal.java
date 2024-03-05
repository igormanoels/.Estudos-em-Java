package view;

import controller.RedesController;
import javax.swing.JOptionPane;

public class Principal {
	static String osUsado, ipUsado;
	static int op;
		
	public static void main(String[] args) 
	{
		JOptionPane.showMessageDialog(null, "Seja Bem Vindo ao Exercicio 1.");
		coletaSO();
		coletaIp();
		coletaPing();
		
		
	}
		
	/*********************************************************************************
	 * Função para verifiacar dentro do pacote controller qual o Sistema Operacional.    
	 */ 
	static void coletaSO()
	{
		RedesController so = new RedesController();
		osUsado = so.getCadeOS();
		System.out.println(osUsado);
		
		if (osUsado.contains("Windows")) 
		{
			op = 1;
		} 
		else if(osUsado.contains("Linux"))
		{
			op = 2;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Sistema Operacional não suportado. ");
		}
	}
	
	/******************************************************************************************
	 * Função para verifiacar a partir do pacote controller qual o Adaptador de Rede e o IPV4.    
	 */ 
	static void coletaIp()
	{
		RedesController ip = new RedesController();
		ip.Cadeip(op);
		System.out.println(ipUsado);
	}
	
	/******************************************************************************************
	 * Função para verifiacar a partir do pacote controller qual o ping até o site do google.    
	 */ 
	static void coletaPing()
	{
		RedesController redesController = new RedesController();
		redesController.qualPing();
	}

}
