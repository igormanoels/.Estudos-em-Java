package view;

import controller.ColetaSO;
import controller.ThreadPing;

public class Principal {
	
	static String systemOp;
	
	public static void main(String[] args) 
	{
		String uol = "www.uol.com.br", 
			   terra = "www.terra.com.br",
			   google = "www.google.com.br";
				
		
		ColetaSO so = new ColetaSO();
		systemOp = so.getSo().toLowerCase();
		
		
		if (systemOp.contains("linux")) 
		{
			System.out.println("Hello linux");
			
			for (int i = 0; i < 3; i++) 
			{ 
				ThreadPing TestPing = new ThreadPing(uol, terra, google);
				TestPing.start();
			}
		} 
		else 
		{
			System.out.println("Sistema Operacional: " + systemOp + ". "
			+ "\nInfelizmente esta aplicação não está disponível para este sistema.");
		}
	}
}

