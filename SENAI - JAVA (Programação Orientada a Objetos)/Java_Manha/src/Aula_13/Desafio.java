package Aula_13;

public class Desafio {

	public static void main(String[] args) {
		int[] vetor01 = {21,34,53,67,89,12};
		int[] vetor02 = {45,46,33,63,83,89};
		int[] trocar = new int[6];
		
// EXIBE O ESTADO ATUAL DO VETOR
		System.out.println("Posição Atual do vetor");
		System.out.print("Vetor1: ");
		for (int i = 0; i < trocar.length; i++) {
			System.out.print(vetor01[i] + " ");
		}
		System.out.print("|   Vetor2: ");
		for (int i = 0; i < trocar.length; i++) {
			System.out.print(vetor02[i] + " ");
		}

// OPERAÇÃO DE TROCA
		for (int i = 0; i < trocar.length; i++) {
			trocar[i]=vetor01[i];
		}
		
		for (int i = 0; i < trocar.length; i++) {
			vetor01[i]=vetor02[i];
		}
		
		for (int i = 0; i < trocar.length; i++) {
			vetor02[i]=trocar[i];
		}
/* OUTRA POSSIBILIDADE DE RESOLVER O PROBLEMA
 * 	
 * 		for (int i = 0; i < trocar.length; j++) {
 *			int troca = vetor01[i];
 *			vetor01[i]=vetor02[i];
 *			vetor02[i]=troca;
 *		}
 */
// EXIBE A TROCA DE POSIÇÃO DOS VETORES	
		System.out.println("\nPosições Trocadas do Vetor");
		System.out.print("Vetor1: ");
		for (int i = 0; i < trocar.length; i++) {
			System.out.print(vetor01[i] + " ");
		}
		System.out.print("|   Vetor2: ");
		for (int i = 0; i < trocar.length; i++) {
			System.out.print(vetor02[i] + " ");
		}

		
	}

}
