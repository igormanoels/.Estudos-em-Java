package Algoritmo_166;

public class ImprimeMatrizEmDiagonalAlta {
	
	public static void main (String[]ags) {
		
		System.out.println("Algoritmo: Imprimi os valores de uma matriz só que em diagonal.\n");
		
		for (int i = 1; i <= 10; i++) {
			
			for (int j = 1; j <= 10; j++) {
				if (i == j || i > j) {
					System.out.print("   ");
					}
				else
				{
					System.out.print(i + "-" + j + " ");
				}
			}
			
			System.out.print("\n");
		}
	}
}
