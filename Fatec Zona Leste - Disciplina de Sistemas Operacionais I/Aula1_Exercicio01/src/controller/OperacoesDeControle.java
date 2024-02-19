package controller;

public class OperacoesDeControle {
	int[] vet1000 = new int[1000];
	int[] vet10000 = new int [10000];
	int[] vet100000 = new int [100000];
	long timeIn, timeFn;
	double timeTt;

	public double vetMilLength() {
		timeIn = System.nanoTime();
		
		for (int i = 0; i < vet1000.length ; i++) 
		{
			vet1000[i] = 0;
		}
		
		timeFn = System.nanoTime();
		timeTt = (double) (( timeFn - timeIn) / Math.pow(10, 9));
		return timeTt;
	}
	
	public double vetMilForeach(){
		timeIn = System.nanoTime();
		
		for (int i: vet1000)
		{
			vet1000[i] = 0;
		}
		
		timeFn = System.nanoTime();
		timeTt = (double) (( timeFn - timeIn) / Math.pow(10, 9));
		return timeTt;
		
	}
	
	public double vetDezkLength() {
		timeIn = System.nanoTime();
		
		for (int i = 0; i < vet10000.length ; i++) 
		{
			vet10000[i] = 0;
		}
		
		timeFn = System.nanoTime();
		timeTt = (double) (( timeFn - timeIn) / Math.pow(10, 9));
		return timeTt;
	}
	
	public double vetDezkForeach(){
		timeIn = System.nanoTime();
		
		for (int i: vet10000)
		{
			vet10000[i] = 0;
		}
		
		timeFn = System.nanoTime();
		timeTt = (double) (( timeFn - timeIn) / Math.pow(10, 9));
		return timeTt;
		
	}
	
	public double vetCemkLength() {
		timeIn = System.nanoTime();
		
		for (int i = 0; i < vet100000.length ; i++) 
		{
			vet100000[i] = 0;
		}
		
		timeFn = System.nanoTime();
		timeTt = (double) (( timeFn - timeIn) / Math.pow(10, 9));
		return timeTt;
	}
	
	public double vetCemkForeach(){
		timeIn = System.nanoTime();
		
		for (int i: vet100000)
		{
			vet100000[i] = 0;
		}
		
		timeFn = System.nanoTime();
		timeTt = (double) (( timeFn - timeIn) / Math.pow(10, 9));
		return timeTt;
		
	}
			
}
