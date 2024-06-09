package edu.dio.aula08;

public class RealizandoDebug 
{

	public static void main(String[] args) 
	{
		System.out.println("Iniciando método principal");
		metodoA();
		System.out.println("Finalizando método principal");
		
	}
	
	static void metodoA()
	{
		System.out.println("\nIniciando método A");
		metodoB();
		System.out.println("Finalizando método A");
	}
	
	static void metodoB()
	{
		System.out.println("\nIniciando método B");
		
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println("Contando: " + i);
		}
		
		metodoC();
		System.out.println("Finalizando método B");
	}
	
	static void metodoC()
	{
		System.out.println("\nIniciando método C");
		
		for (int i = 0; i <=10 ; i+=2) 
		{
			System.out.println("Contando: " + i);
		}
		
		System.out.println("\nFinalizando método C");
	}
	
	

}
