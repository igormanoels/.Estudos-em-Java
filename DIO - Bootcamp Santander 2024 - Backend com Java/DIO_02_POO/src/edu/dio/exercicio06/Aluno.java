package edu.dio.exercicio06;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>
{
	private String nome;
	private int matricula;
	private double nota;
	
	
	// Construtor 
	public Aluno(String nome, int matricula, double nota) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
	}

	
	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
	// ToString
	public String toString() 
	{
		return "\nMatricula: " + matricula + " - Aluno: " + nome 
				+ " = Nota final: " + nota;
	}

	
	// Método de verificação por matricula
	public int hashCode() 
	{
		return Objects.hash(getMatricula());
	}

	public boolean equals(Object obj) 
	{
		if (this == obj) return true;
		if (!(obj instanceof Aluno matricula)) return false;
		return Objects.equals(getMatricula(), matricula.getMatricula());
	}


	// Método de comparação
	public int compareTo(Aluno o) 
	{
		return nome.compareToIgnoreCase(o.getNome());
	}
	
}

class ComparatorPorNota implements Comparator<Aluno>
{
	public int compare(Aluno o1, Aluno o2) 
	{
		return Double.compare(o1.getNota(), o2.getNota());
	}
	
}
