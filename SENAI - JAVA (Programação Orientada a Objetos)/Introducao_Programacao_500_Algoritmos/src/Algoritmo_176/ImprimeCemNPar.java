package Algoritmo_176;

public class ImprimeCemNPar {

	public static void main(String[] args) {
		System.out.println("Algoritmo: Imprime os 100 primeiros números pares.");
		
		for (int i = 0; i <= 200 ; i += 2) {
			System.out.print(i + " | ");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
	}

}
