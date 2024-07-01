package edu.dio.aula13.SetPesquisa;

import java.util.Objects;

public class Contatos {
	
	private String nome;
	private int numero;
	
	public Contatos(String nm, int num) 
	{
		this.nome = nm;
		this.numero = num;
	}
	
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "Contato: " + nome + " - Telefone: " + numero;
	}

	
	// Método de Verificação por nome
	public boolean equals(Object obj) 
	{
		if (this == obj) return true;
		if (!(obj instanceof Contatos nome)) return false;
		return Objects.equals(getNome(), nome.getNome());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getNome());
	}
}
