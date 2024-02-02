package Algoritmo_183;

public class QuadradoDeDezNumeros {

	public static void main(String[] args) {
		System.out.println("Algoritmo: Imprime o quadrado de 10 números.");
		
		for (int i = 0; i <= 10 ; i++) {
			System.out.println("O quadrado de " + i + " é " + (Math.round((Math.pow(i, 2)))));
		
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
		}
		
	}

}
