package Algoritmo_172;

public class ImprimeMatrizEmDiagonalInvertidaBaixa {

	public static void main(String[] args) {
		var cont = 10;
		System.out.println("Algoritmo: Imprime a digonal baixa de uma matriz.");
		
		for (int i = 1; i <= 10 ; i++) {
			
			for (int j = 1; j <= 10 ; j++) {
				if (j <= cont) {
					System.out.print("    ");
				} 
				else 
				{
					System.out.print(i + "-"  + j + " ");
				}
			}
			cont--;
			System.out.println();
		}
	}

}
