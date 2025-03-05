package controller;

public class ThreadVetor extends Thread {
	
	private int ThreadVet[] = new int[100];
	private int ThreadNum;
	
	public ThreadVetor (int[] vet, int n)
	{
		this.ThreadVet = vet;
		this.ThreadNum = n;
	}
	
	@SuppressWarnings({ "deprecation", "unused" })
	public void run() 
	{
		long tempInit, tempFn;
		double tempRes;
		
		if (ThreadNum % 2 == 0) 
		{
			tempInit = System.nanoTime();
			for (int j = 0; j < ThreadVet.length; j++) 
			{
			
			}
			
			tempFn = System.nanoTime();
				
		} 
		else 
		{
			tempInit = System.nanoTime();
			
			for (int k : ThreadVet) 
			{
					
			}
			
			tempFn = System.nanoTime();
		}
			
		tempRes = ((tempFn - tempInit) / Math.pow(10, 9));
		System.out.println("Tid: " + getId()+ "  ==> " + "Tempo de Execução: " + tempRes + " seg");
		
	}
	
}
