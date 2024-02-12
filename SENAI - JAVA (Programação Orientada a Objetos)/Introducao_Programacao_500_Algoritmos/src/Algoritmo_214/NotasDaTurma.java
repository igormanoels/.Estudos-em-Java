package Algoritmo_214;

import java.util.Scanner;

public class NotasDaTurma {

	public static void main(String[] args) {
		String[] n1 = new String[3];
		String[] n2 = new String[3];
		String[] lista = new String[3];
		double[] media = new double[3];
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê as notas da turma e imprime uma lista com a média final.\n");
		
		System.out.print("Favor informar o nome da professor(a): ");
		var prof = ler.nextLine();
		System.out.print("Favor informar a turma: ");
		var turma = ler.nextLine();
		System.out.print("Favor informar a série: ");
		var serie = ler.nextLine();
		
		for (int i = 0; i < 3; i++) {
			System.out.print("\nFavor informar o nome do aluno: ");
			lista[i] = ler.nextLine();
			System.out.print("Favor informar a nota do primeio semestre: ");
			n1[i] = ler.nextLine();
			System.out.print("Favor informar a nota do segundo semestre: ");
			n2[i] = ler.nextLine();
		}
		
		for (int i = 0; i < media.length; i++) {
			media[i] = ((Double.parseDouble(n1[i]) + Double.parseDouble(n2[i])) / 2);
		}
		
		System.out.println("\n\nProfessora: " + prof + "\t| Turma: " + turma + "\t| Série: " + serie 
				+ "\n================================================================"
				+ "\nAluno:\t\t| N1:\t\t| N2:\t\t| Média:");
		
		for (int i = 0; i < 3; i++) {
			System.out.println(lista[i] + "\t\t| " + n1[i] + "\t\t| " + n2[i] + "\t\t| " + media[i]);
		}
		
		
		ler.close();
	}

}
