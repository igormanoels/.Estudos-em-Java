package br.com.dio.Aula_002;

public class anotacoes_03 {
	
	public static void main(String[] args) {
		
		int contador = 0;
		
		
		
		// Enquanto...faça
		while (contador <= 10) {
			System.out.println("Contando: " + contador++);
		}
		
		System.out.println();
		
		//Faça...enquanto
		do {
			contador--;
			System.out.println("Contando: " + contador);			
		} while (contador >= 0);
		
		System.out.println();
		
		//Para
		for (int i = 0; i <= 10; i++) {
			System.out.println("Contando: " + i);
		}
	}
}
