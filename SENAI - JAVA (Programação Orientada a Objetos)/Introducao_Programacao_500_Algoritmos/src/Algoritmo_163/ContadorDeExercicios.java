package Algoritmo_163;

public class ContadorDeExercicios {

	public static void main(String[] args) {
		System.out.println("Algoritmo: Imprimi a sequência de exercícios.");
		
		for (int i = 1 ; i <= 3 ; i++) {
			System.out.println(i + "º volta");
			
			for (int j = 1; j <= 5 ; j++) {
				System.out.print(j + "º abdominal  |");
			}
			System.out.println("\n");
		}
	}

}
