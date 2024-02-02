package Algoritmo_179;

public class ImprimeNumerosPares {

	public static void main(String[] args) {
		System.out.println("Algoritmo: Imprime os números pares até 600");
		
		for (int i = 0; i <= 600 ; i+= 2) {
			System.out.println(i);
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
		}
		
	}

}
