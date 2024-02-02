package Algoritmo_170;

public class MatrizEmDiagonalAltaInvertida {

	public static void main(String[] args) {
		int cont = 0;
		System.out.println("Algoritmo: Imprime uma Matriz em Diagonal Invertida.\n");
		
		for (int i = 1; i <= 10 ; i++) {
			
			cont++;
			
			for (int j = 1; j <= (10 - cont) ; j++) {
				 
				System.out.print(i + "-" + j + "  ");

			}
			
			System.out.println("");
		}
	}

}
