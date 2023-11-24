package Aula_13;

public class TrabalhandoComVetor_03 {

	public static void main(String[] args) {
		int[] vetor01 = {21,34,53,67,89,12};
		int[] vetor02 = {45,46,33,63,83,89};
		int[] vetor03 = new int[6];
// os tamanhos dos vetores devem ser iguais.
		for (int i = 0; i < vetor03.length; i++) {
			vetor03[i]=vetor01[i]*vetor02[i];
		}
		
		for (int i = 0; i < vetor03.length; i++) {
			System.out.println("Total: " + vetor03[i]);
		}
		
// realizar o desafio, trocar as posições dos vetores
	}

}
