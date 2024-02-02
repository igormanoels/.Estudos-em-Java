package Algoritmo_174;

public class ContandoAteCem {

	public static void main(String[] args) {
		System.out.println("Algoritmo: Imprime uma contagem de 0 a 100.\n");
		
		for (int i = 0; i <= 100; i++) {
			System.out.print(i + " | ");
			try {
				Thread.sleep(100); // Deixei 100 milissegundo para ir um pouco mais rápido
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
	}

}
