package Aula_13;

import java.util.Scanner;

public class TrabalhandoComVetor_02 {

	public static void main(String[] args) {
		int a;
		System.out.println("Informe um valor para contagem");
		Scanner ler = new Scanner(System.in);
			a = ler.nextInt();
		int[] vetor = new int [a];
// intancia, o vetor se torna um objeto
			System.out.print("Contador: ");
		for (int i = 0; i <= vetor.length; i++) {
			System.out.print(i+ " ");
		}
		
		ler.close();
	}

}
