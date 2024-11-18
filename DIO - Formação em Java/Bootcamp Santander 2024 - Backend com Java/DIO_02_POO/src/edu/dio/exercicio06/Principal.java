package edu.dio.exercicio06;

import javax.swing.JOptionPane;
/*
 * 	Crie uma classe chamada "GerenciadorAlunos" que irá lidar com uma lista de alunos. 
 * 	Cada aluno terá atributos como nome, matrícula e nota. 
 * 
 * 	Implementaremos os seguintes métodos:
 * 	- adicionarAluno(String nome, Long matricula, double media): Adiciona um aluno ao conjunto.
 * 	- removerAluno(long matricula): Remove um aluno ao conjunto a partir da matricula, se estiver presente.
 *  - exibirAlunosPorNome(): Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
 *  - exibirAlunosPorNota(): Exibe todos os alunos do conjunto em ordem crescente de nota.
 *  - exibirAlunos(): Exibe todos os alunos do conjunto.
 */
public class Principal 
{
	public static void main(String[] args) 
	{
		
		boolean continuar = true;
		int op, matricula;
		String nome;
		double nota;
		GerenciadorAlunos alunos = new GerenciadorAlunos();
		
		while (continuar) 
		{
			op = Integer.parseInt(JOptionPane.showInputDialog(null, 
					  "1 - Adcionar aluno.\n"
					+ "2 - Remover aluno.\n"
					+ "3 - Mostrar alunos por nome.\n"
					+ "4 - Mostrar alunos por nota.\n"
					+ "5 - Mostrar alunos.\n"
					+ "0 - Finalizar.",
					"Informe a opção desejada:", JOptionPane.INFORMATION_MESSAGE ));
			
			switch (op) 
			{
				case 0:
					JOptionPane.showMessageDialog(null, "Obrigado por testar meu algoritmo!", 
							"Programa encerrado!", JOptionPane.INFORMATION_MESSAGE);
					continuar = false;
					break;
				case 1:
					nome = JOptionPane.showInputDialog(null, "Informe o nome do aluno: ", 
							"CADASTRAR NOTA", JOptionPane.INFORMATION_MESSAGE);
					matricula = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a matrícula do aluno: ", 
							"CADASTRAR NOTA", JOptionPane.INFORMATION_MESSAGE));
					nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Agora informe a nota final: ", 
							"CADASTRAR NOTA", JOptionPane.INFORMATION_MESSAGE));
					alunos.adicionarAluno(nome, matricula, nota);
					break;
				case 2:
					nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno: ", 
							"REMOVER ALUNO CADASTRADO", JOptionPane.INFORMATION_MESSAGE);
					alunos.removerAluno(nome);
					break;
				case 3:
					alunos.exibirAlunosPorNome();
					break;
				case 4:
					alunos.exibirAlunosPorNota();
					break;
				case 5:
					alunos.exibirAlunos();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Favor informar uma opção do menu!", 
							"Entrada inválida.", JOptionPane.CANCEL_OPTION);
					break;
			}
		}
		
	}
}
