package Algoritmo_171;

public class ImprimeDiagonalInvertida {

	public static void main(String[] args) {
		var cont = 10;
		System.out.println("Algoritmo: Imprime a diagonal invetida de uma Matriz.\n");
		
		for (int i = 1; i <= 10 ; i++) {
			
			for (int j = 1; j <= 10 ; j++) {
				
				if (j == cont) {
					System.out.print(i + "-" + j + "  ");
				} 
				else {
					System.out.print("   ");
				}
				
			}
			cont--;
			System.out.println("");
		}
	}

}
