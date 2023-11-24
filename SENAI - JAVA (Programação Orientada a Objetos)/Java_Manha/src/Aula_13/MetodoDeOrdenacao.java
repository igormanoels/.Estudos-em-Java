package Aula_13;

import java.util.Iterator;

public class MetodoDeOrdenacao {

	public static void main(String[] args) {
		int[] vetor01 = {21,34,53,67,89,12};		
		
		bubbleSort(vetor01);
		
		for (int i = 0; i < vetor01.length; i++) {
			System.out.println(vetor01[i]);
		}
	}
	
	public static void bubbleSort(int[] vetor) {
		for (int i=0; i <vetor.length -1; i++) {
			for (int j = 0; j < vetor.length -1; j++) {
				if (vetor[j] > vetor[j+1]) {
					int aux = vetor[j];
					vetor[j]=vetor[j+1];
					vetor[j+1]=aux;
				}
			}
		}
	}

}
