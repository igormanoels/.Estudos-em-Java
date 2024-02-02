package Algoritmo_168;

public class ImprimeMatrizEmDiagonalBaixa {

	public static void main(String[] args) {
		System.out.println("Algoritmo: Imprime os valores de uma matriz em Diagonal.\n");
		
		for (int i = 1; i <= 10; i++) {
			
			for (int j = 1; j <= 10 ; j++) {
				if (i > j) {
					System.out.print(i + "-" + j + " ");
				} 
				else {
					System.out.print("   ");
				}
			}
			
			System.out.println("");
		}
	}

}
