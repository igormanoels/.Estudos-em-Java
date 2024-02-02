package Algoritmo_181;

public class ImprimeSomaAteCem {

	public static void main(String[] args) {
		var soma = 0;
		System.out.println("Algoritmo: Imprime os número de 0 a 100 e sua somatória.\n");
		
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
			soma = soma + i;
			try {
				Thread.sleep(100);
			} catch (Exception e) {

			}
		}
		System.out.println("\nSomatória: " + soma);
	}

}
