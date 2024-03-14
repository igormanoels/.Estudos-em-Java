package view;

import controller.ThreadSapinho;


public class Principal {
	
	static int sapo1, sapo2, sapo3, sapo4, sapo5;
	
	public static void main(String[] args) 
	{
		for (int i = 0; i < 10; i++) 
		{
			try 
			{
				Thread.sleep(500 * i);
				sapo1 = (int) Math.round(Math.random() * 5);
				sapo2 = (int) Math.round(Math.random() * 5);
				sapo3 = (int) Math.round(Math.random() * 5);
				sapo4 = (int) Math.round(Math.random() * 5);
				sapo5 = (int) Math.round(Math.random() * 5);
				
				ThreadSapinho sapos = new ThreadSapinho(sapo1, sapo2, sapo3, sapo4, sapo5);
				sapos.start();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
					
		}
		
				
	}

}
