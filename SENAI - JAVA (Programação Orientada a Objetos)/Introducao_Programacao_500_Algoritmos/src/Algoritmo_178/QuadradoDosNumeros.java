package Algoritmo_178;

public class QuadradoDosNumeros {

	public static void main(String[] args) {
		System.out.println("Algoritmo: Imprime o quadrado dos número até 20.");
		
		for (int i = 0; i <= 20; i++) {
			System.out.println("Para " + i + " = "+ Math.round((Math.pow(i, 2))));
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
	}

}
