package Algoritmo_142;

import java.util.Scanner;

public class ClassificaEquipe {
	static int pts1, pts2, pts3, max, med, min, total, media;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê a pontuação dos 3 integrantes da equipe e imprimi se foi classificado.");
		
		System.out.print("Informe a pontuação do primeiro membro da equipe: ");
			pts1 = ler.nextInt();
		System.out.print("Informe a pontuação do segundo membro da equipe: ");
			pts2 = ler.nextInt();
		System.out.print("Informe a pontuação do terceiro membro da equipe: ");
			pts3 = ler.nextInt();
		
		max = (Math.max(pts1, Math.max(pts2, pts3)));
		min = (Math.min(pts1, Math.max(pts2, pts3)));
		med = ((pts1 + pts2 + pts3) - (max + min));
		
		total = max + med + min;
		media = total / 3;
			
		System.out.print("\nPontuação: " + max + ", " + med + ", " + min + ".");
		
		if (total > 100) {
			System.out.print("\nEquipe Classificada. Pontuação média: " + media);
		} 
			else {
				System.out.print("\nEquipe Desclassificada. Pontuação média: " + media);
			}
		
		ler.close();
	}

}
