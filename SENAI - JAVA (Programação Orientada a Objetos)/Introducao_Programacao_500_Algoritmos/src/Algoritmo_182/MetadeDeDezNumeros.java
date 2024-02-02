package Algoritmo_182;

public class MetadeDeDezNumeros {

	public static void main(String[] args) {
		double metade = 1;
		System.out.println("Algoritmo: Imprime a metade de 10 números.");
		
		for (int i = 0; i <= 10; i++) {
			metade =  (double) i / 2;
			System.out.println("Para " + i + ", a metade é " + metade);
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
		}
	}

}
