package Algoritmo_167;

public class ImprimeMatrizApenasIguais {

	public static void main(String[] args) {
		System.out.println("Algoritmo: Imprime apenas os valores iguais da Matriz.\n");
		
		for (int i = 1; i <= 10 ; i++) {
			
			for (int j = 1; j <= 10; j++) {
				if (i != j) {
					System.out.print("    ");
				} else {
					System.out.print(i + "-"+ j);
				}
			}
			System.out.println("");
		}
	}

}
