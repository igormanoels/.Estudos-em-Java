package edu.nobreza;

public class Padre implements Fiel {

	protected String nome;

	public Padre(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return nome;
	}
}
