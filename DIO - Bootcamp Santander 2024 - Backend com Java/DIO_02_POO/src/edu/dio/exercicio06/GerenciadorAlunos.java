package edu.dio.exercicio06;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos 
{
	Set<Aluno> gerenciarAlunos;
	
	public GerenciadorAlunos() 
	{
		this.gerenciarAlunos = new HashSet<>();
	}
	
	public void adicionarAluno(String nome, int matricula, double nota)
	{
		gerenciarAlunos.add(new Aluno(nome, matricula, nota));
	}
	
	public void removerAluno(String nome)
	{
		Aluno removerAluno = null;
		
		if (!(gerenciarAlunos.isEmpty())) 
		{
			for (Aluno aluno : gerenciarAlunos) 
			{
				if (aluno.getNome().equalsIgnoreCase(nome)) 
				{
					removerAluno = aluno;
					break;
				}
			}
			gerenciarAlunos.remove(removerAluno);
		} 
		else 
		{

		}
	}
	
	public void exibirAlunosPorNome()
	{
		Set<Aluno> alunosPorNome = new TreeSet<>(gerenciarAlunos);
		System.out.println(alunosPorNome);
	}
	
	public void exibirAlunosPorNota()
	{
		Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
		alunosPorNota.addAll(gerenciarAlunos);
		System.out.println(alunosPorNota);
	}
	
	public void exibirAlunos()
	{
		System.out.println(gerenciarAlunos);
	}
}
