package Algoritmo_216;

public class ContNumParEImpar {

	public static void main(String[] args) {
		var impar = 0;
		var par = 0;
		System.out.println("Algoritmo: Imprime a quantidade de números pares e impares que existe até 200.");
		
		for (int i = 0; i <= 200; i++) 
		{
			if (i % 2 == 0 ) 
			{
				par++;
			} 
			else 
			{
				impar++;
			}
		}
		
		System.out.print("\nImpar: " + impar + "\t|\tPar: " + par);
	}

}
