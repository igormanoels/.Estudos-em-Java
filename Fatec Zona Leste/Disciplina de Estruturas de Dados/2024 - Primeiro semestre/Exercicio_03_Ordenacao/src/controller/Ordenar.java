package controller;

public class Ordenar {
	
	public static void Ordenar(int[] vet) {
		int aux;
		for (int i = 0; i < vet.length-1; i++) {
			for (int j = 0; j < vet.length-1; j++) {
				if (vet[j] > vet[j+1]) {
					aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}
			}
		}
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i] + " ");
			
		}
	}
	

}
