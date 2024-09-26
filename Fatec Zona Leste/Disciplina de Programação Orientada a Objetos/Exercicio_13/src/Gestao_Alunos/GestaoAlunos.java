package Gestao_Alunos;

import java.util.Scanner;

public class GestaoAlunos {

	private int indice = 0;
	private Aluno[] alunos = new Aluno[50];
	
	public void criar(String...str) {
		if (indice == 0) {
			String id = String.valueOf(indice + 1);
			Aluno aluno = new Aluno(str);
			this.alunos[indice++] = aluno; // Verificar se o vetor est� sendo preenchido apartir da posi��o 1
		} else {
			// percorrer posi��es e descobrir qual a proxima vazia pelo id
		}
		
		
	}
	
	public void atualizar() {
		
	}
	
	public void excluir(String ra) {
		
	}
	
	public void exibir() {
		System.out.println("Lista de alunos cadastrados:");
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
	}
	
	public void menu() {
		String op = null, nome = null , ra = null, data = null;
		boolean continuar = true;
		Scanner ler = new Scanner(System.in);
		
		
		while (continuar) {
			System.out.print("Menu - Gestão de Alunos\n"
					+ "(C)riar   -   (E)xibir   -   (R)emover\t\r\n"
					+ "(A)tualizar   -   (S)air\n"
					+ "Digite a opção desejada: ");
			op = ler.nextLine().toUpperCase();
			
			switch (op) {
				case "C":
					System.out.print("\nVocê será direcionado para \"Criar\"");
					animacao();
					System.out.print("Informe a data de nascimento: ");
					data = ler.nextLine();
					System.out.print("Informe ra do aluno: ");
					ra = ler.nextLine();
					System.out.print("Informe nome do aluno: ");
					nome = ler.nextLine();
					criar(data, ra, nome);
					break;
				case "E":
					System.out.print("\nVocê será direcionado para \"Exibir\"");
					animacao();
					exibir();
					break;
				case "R":
					System.out.print("\nVocê será direcionado para \"Remover\"");
					animacao();
					excluir("");
					break;
				case "A":
					System.out.print("\nVocê será direcionado para \"Atualizar\"");
					animacao();
					atualizar();
					break;
				case "S":
					System.out.println("\nObrigado por testar meu algoritmo!");
					continuar = false;
					break;
				default:
					System.out.println("\nOpção inválida!\n\n");
					break;
				}
		}	
		
		ler.close();
	}
	
	public void animacao() {
		try {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(500);
				System.out.print(".");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

