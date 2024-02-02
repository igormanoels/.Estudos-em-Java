package Algoritmo_180;

public class NumerosEmIntervalo {

	public static void main(String[] args) {
		System.out.println("Algoritmo: Imprime os números de 120 à 600.");
		
		for (int i = 120; i <= 300 ; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
		}
	}

}
