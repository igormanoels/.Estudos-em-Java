package Algoritmo_127;

import java.util.Scanner;

public class AvaliarNota {
	static double n1, n2, med;
	static String nome;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê o nome do aluno e as duas notas e imprimi a avaliação.");
		
		System.out.print("Informe o nome do aluno: ");
			nome = ler.nextLine();
		System.out.print("Informe a primeira nota: ");
			n1 = ler.nextInt();
		System.out.print("Informe a segunda nota: ");
			n2 = ler.nextInt();
		
		med = ((n1 + n2) / 2);
		
		if (med >= 7) {
			System.out.print("\nParabéns " + nome + ", você está aprovado! Média: " + med);	
		} 
			else if (med >= 3){
				System.out.print("\n" + nome + ", você ficou de exame e precisa se esforçar mais. Média: " + med);
			}
			else {
				System.out.print("\n" + nome + ", infelizmente você está de recuperação. Média: " + med);
			}
	
		
		ler.close();
	}

}
