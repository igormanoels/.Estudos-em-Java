package Gestao_Alunos;

import java.util.Scanner;

public class GestaoAlunos {

	private int indice = 0;
	private Aluno[] alunos = new Aluno[50];
	
	public void criar(String...str) {
		Aluno novoAluno = new Aluno(String.valueOf(indice), str[0], str[1], str[2]);
		alunos[indice] = novoAluno;				
		indice++;
		System.out.println("\n");
	}
	
	public void atualizar(String...str) {
		for (int i = 0; i < alunos.length; i++) {
			Aluno aluno = alunos[i];
			if (aluno != null && aluno.getRA().equalsIgnoreCase(str[1]) ) {
				aluno.setData(str[0]);
				aluno.setNome(str[2]);
				System.out.println("Cadastro atualizado.\n\n");
				return;
			}
		}
		System.err.println("Aluno não encontrado.\n\n");		
	}
	
	
	public void excluir(String ra) {
	    for (int i = 0; i < alunos.length; i++) {
	        Aluno aluno = alunos[i];
	        if (aluno != null && aluno.getRA().equalsIgnoreCase(ra)) {
	            alunos[i] = null;
	            System.out.println("Aluno excluído.\n\n");
	            return;
	        }
	    }
	    System.err.println("Aluno não encontrado.\n\n");
	}

	
	public void exibir() {
		System.out.println("\n\nLISTA DE ALUNOS CADASTRADOS:"); 
		for (Aluno aluno : alunos) {
			if (aluno != null) {
				System.out.println(aluno);
			}
		}
		System.out.println("\n");
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
					System.out.print("\n\nVocê será direcionado para \"Criar\"");
					animacao();
					System.out.println("\n\nCRIAR CADASTRO DE ALUNO");
					System.out.print("Informe a data de nascimento: ");
					data = ler.nextLine();
					System.out.print("Informe ra do aluno: ");
					ra = ler.nextLine();
					System.out.print("Informe nome do aluno: ");
					nome = ler.nextLine();
					criar(data, ra, nome);
					break;
				case "E":
					System.out.print("\n\nVocê será direcionado para \"Exibir\"");
					animacao();
					exibir();
					break;
				case "R":
					System.out.print("\nVocê será direcionado para \"Remover\"");
					animacao();
				    System.out.println("\n\nREMOVER ALUNO CADASTRADO:"); 
					System.out.print("Informe ra do aluno: ");
					ra = ler.nextLine();
					excluir(ra);
					break;
				case "A":
					System.out.print("\nVocê será direcionado para \"Atualizar\"");
					animacao();
					System.out.println("\n\nATUALIZAR ALUNO CADASTRADO:");
					System.out.print("Informe a data de nascimento: ");
					data = ler.nextLine();
					System.out.print("Informe ra do aluno: ");
					ra = ler.nextLine();
					System.out.print("Informe nome do aluno: ");
					nome = ler.nextLine();
					atualizar(data, ra, nome);
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
			System.out.println("");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

