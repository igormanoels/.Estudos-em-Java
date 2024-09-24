package edu.nobreza;

public class Conselheiro {
	
	private String nome;
	private Bispo bispo;

	public Conselheiro(String nome, Bispo bispo) {
		this.nome = nome;
		this.bispo = bispo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome;
	}

}
