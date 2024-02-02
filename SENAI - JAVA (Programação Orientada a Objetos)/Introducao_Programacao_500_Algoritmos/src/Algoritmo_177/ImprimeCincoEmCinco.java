package Algoritmo_177;

public class ImprimeCincoEmCinco {

	public static void main(String[] args) {
		System.out.println("Algoritmo: Imprime os números de 5 em 5 até 500.\n");
		
		for (int i = 0; i <= 500; i+=5) {
			System.out.print(i + " | ");
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
	}

}
