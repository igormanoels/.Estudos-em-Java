package Algoritmo_162;

public class NumerosPares {

	public static void main(String[] args) {
		
		System.out.println("Algoritmo: Imprimi os números pares entre 0 e 10.");
		
		System.out.print("Pares: ");
		
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			} 
		}
	}

}
