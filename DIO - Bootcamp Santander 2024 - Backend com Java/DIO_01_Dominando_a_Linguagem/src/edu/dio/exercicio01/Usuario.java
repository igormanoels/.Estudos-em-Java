package edu.dio.exercicio01;

public class Usuario 
{
	public static void main(String[] args) 
	{
		SmartTV smartTv = new SmartTV();
		
		System.out.println("TV Lidaga: " + smartTv.ligada);
		System.out.println("Canal Atual: " + smartTv.canal);
		System.out.println("Volume Atual: " + smartTv.volume);
		
		smartTv.ligar();
		System.out.println("TV Lidaga: " + smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("TV Lidaga: " + smartTv.ligada);
		
	}
}
