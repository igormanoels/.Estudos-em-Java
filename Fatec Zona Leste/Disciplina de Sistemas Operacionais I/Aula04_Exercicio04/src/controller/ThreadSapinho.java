package controller;

public class ThreadSapinho extends Thread {
	private int ThreadSapo1;
	private int ThreadSapo2;
	private int ThreadSapo3;
	private int ThreadSapo4;
	private int ThreadSapo5;
	
	static int DistSapo1, DistSapo2, DistSapo3, DistSapo4, DistSapo5, volta;;
	
	
	public ThreadSapinho (int sapo1, int sapo2, int sapo3, int sapo4, int sapo5)
	{
		this.ThreadSapo1 = sapo1;
		this.ThreadSapo2 = sapo2;
		this.ThreadSapo3 = sapo3;
		this.ThreadSapo4 = sapo4;
		this.ThreadSapo5 = sapo5;
	}
	

	public void run() 
	{
		volta += 1;
		DistSapo1 += ThreadSapo1;
		DistSapo2 += ThreadSapo2;
		DistSapo3 += ThreadSapo3;
		DistSapo4 += ThreadSapo4;
		DistSapo5 += ThreadSapo5;
		
		if (volta == 1)
		{
			System.out.println("\nE foi dada a largada!!!"
					+ "\nNessa primeira volta temos os seguintes dados:"
					+ "\nO sapo 1 percorreu seus " + DistSapo1 + " primeiros metros."
					+ "\nO sapo 2 percorreu seus " + DistSapo2 + " primeiros metros."
					+ "\nO sapo 3 percorreu seus " + DistSapo3 + " primeiros metros."
					+ "\nO sapo 4 percorreu seus " + DistSapo4 + " primeiros metros."
					+ "\nO sapo 5 percorreu seus " + DistSapo5 + " primeiros metros.");
		}
		else if (volta <= 9) 
		{
			System.out.println("\n" + volta + "º volta, temos os seguintes dados:"
					+ "\nO sapo 1 percorreu " + ThreadSapo1 + " metros. Ao todo já foram " + DistSapo1 + " metros."
					+ "\nO sapo 2 percorreu " + ThreadSapo2 + " metros. Ao todo já foram " + DistSapo2 + " metros."
					+ "\nO sapo 3 percorreu " + ThreadSapo3 + " metros. Ao todo já foram " + DistSapo3 + " metros."
					+ "\nO sapo 4 percorreu " + ThreadSapo4 + " metros. Ao todo já foram " + DistSapo4 + " metros."
					+ "\nO sapo 5 percorreu " + ThreadSapo5 + " metros. Ao todo já foram " + DistSapo5 + " metros.");
		} 
		else 
		{
			System.out.println("\n" + volta + "º Entramos na última volta é a hora da emoção!!!"
					+ "\nE temos os seguintes dados finais:"
					+ "\nO sapo 1 percorreu " + ThreadSapo1 + " metros. Ao todo já foram " + DistSapo1 + " metros."
					+ "\nO sapo 2 percorreu " + ThreadSapo2 + " metros. Ao todo já foram " + DistSapo2 + " metros."
					+ "\nO sapo 3 percorreu " + ThreadSapo3 + " metros. Ao todo já foram " + DistSapo3 + " metros."
					+ "\nO sapo 4 percorreu " + ThreadSapo4 + " metros. Ao todo já foram " + DistSapo4 + " metros."
					+ "\nO sapo 5 percorreu " + ThreadSapo5 + " metros. Ao todo já foram " + DistSapo5 + " metros.");
			
			SapoCampeao();
		}
		
		
	}
	
	public void SapoCampeao()
	{
		int campeao = Math.max(DistSapo1, Math.max(DistSapo2, Math.max(DistSapo3, Math.max(DistSapo4, DistSapo5))));
		
		if (DistSapo1 == campeao) 
		{
			System.out.println("\nE a corrida dos sapos chega ao fim."
					+ "\nO Sapo 1 é o campeão!!!");
		} 
		else if (DistSapo2 == campeao) 
		{
			System.out.println("\nE a corrida dos sapos chega ao fim."
					+ "\nO Sapo 2 é o campeão!!!");
		}
		else if(DistSapo3 == campeao)
		{
			System.out.println("\nE a corrida dos sapos chega ao fim."
					+ "\nO Sapo 3 é o campeão!!!");
		}
		else if (DistSapo4 == campeao)
		{
			System.out.println("\nE a corrida dos sapos chega ao fim."
					+ "\nO Sapo 4 é o campeão!!!");
		}
		else 
		{
			System.out.println("\nE a corrida dos sapos chega ao fim."
					+ "\nO Sapo 5 é o campeão!!!");
		}
	}
	
	
	
}
