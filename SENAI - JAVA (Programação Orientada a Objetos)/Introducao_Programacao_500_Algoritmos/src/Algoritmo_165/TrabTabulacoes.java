package Algoritmo_165;

public class TrabTabulacoes {
	
	public static void main(String[]args){ 
		System.out.println("Algoritmo: Imprime duas mensagens com tabulações entre elas.\n");
		
		for (int i = 1; i <= 9; i++) 
		{
			if(i == 1 || i == 9 ) 
			{
				System.out.print("Zona " + i);
			}
			else 
			{
				System.out.print("\t");
			}
		}
		
	}
	
}
