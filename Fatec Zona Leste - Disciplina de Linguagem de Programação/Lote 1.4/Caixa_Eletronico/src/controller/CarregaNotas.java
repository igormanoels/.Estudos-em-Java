package controller;

public class CarregaNotas {

	static int vetNotas[] = new int[6];
	
	
	public static void CarregaNotas() 
	{	
		System.out.print("Aguarde enquanto as notas são carregadas");
		
		for (int i = 0; i < 5; i++) 
		{
			try 
			{
				Thread.sleep(1000);
			} 
			catch (Exception e) {
				// Função para criar um Contador de 5 segundos
			}
			System.out.print(".");
		}
		
		System.out.println("\n\n");
		
		/************************************************************
		 * Cada caixa eletrônico possui 4 caixa com até 2700 notas.
		 * Portanto, como são 6 tipos de notas cada uma pode conter 
		 * até 1800 notas de cada.  
		 */
		for (int i = 0; i < vetNotas.length; i++) 
		{			
			vetNotas[i] = (int) (Math.round(Math.random() * 1801));
			System.out.println("Quant. notas carregadas: " + vetNotas[i] + "\t");		
		}
		
		Caixa envNotas = new Caixa(vetNotas);
	}
}
