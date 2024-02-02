package Algoritmo_175;

public class ContandoZeroACem {

	public static void main(String[] args) {
		System.out.println("Algoritmo: Imprime uma contagem de 100 a zero.\n");
		
		for (int i = 100; i >= 0; i--) {

			System.out.print(i + " | ");
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.getStackTrace();
			}
			
		}
	
	}
	
}
