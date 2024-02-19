package view;

import controller.OperacoesDeControle;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Algoritmo: Percorre um vetor de 1.000, 10.000 e 100.000 posições e marcando o tempo.");
		
		OperacoesDeControle op = new OperacoesDeControle();
		
		System.out.println("\nMarcando tempo para \"1.000\" posições.");
		System.out.println("Tempo usando Length: " + op.vetMilLength() + "s");
		System.out.println("Tempo usando Foreach: " + op.vetMilForeach() + "s");
		
		System.out.println("\nMarcando tempo para \"10.000\" posições.");
		System.out.println("Tempo usando Length: " + op.vetDezkLength() + "s");
		System.out.println("Tempo usando Foreach: " + op.vetDezkForeach() + "s");
		
		System.out.println("\nMarcando tempo para \"100.000\" posições.");
		System.out.println("Tempo usando Length: " + op.vetCemkLength() + "s");
		System.out.println("Tempo usando Foreach: " + op.vetCemkForeach() + "s");
	}

}
