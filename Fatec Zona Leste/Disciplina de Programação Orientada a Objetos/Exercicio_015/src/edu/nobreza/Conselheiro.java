package edu.nobreza;

public class Conselheiro {
	
	private String nome;
	@SuppressWarnings("unused")
	private Bispo bispo;

	public Conselheiro(String nome, Bispo bispo) {
		this.nome = nome;
		this.bispo = bispo;
	}
	
	@Override
	public String toString() {
		return nome;
	}

}
