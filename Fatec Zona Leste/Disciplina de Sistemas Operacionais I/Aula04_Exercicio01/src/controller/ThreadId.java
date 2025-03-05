package controller;

public class ThreadId extends Thread {
	
	private int idThread;
	
	// Método construtor
	public ThreadId(int idThread)
	{
		this.idThread = idThread;
	}
	
	// só executa o que está aqui dentro
	@SuppressWarnings("deprecation")
	public void run()
	{
		System.out.println("TID: " + getId() + " --> Thread: " + idThread);
	}
	
}
