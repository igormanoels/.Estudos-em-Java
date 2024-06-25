package edu.dio.aula15.Set;

import java.util.Objects;

public class Convidado 
{
	private String nome;
	private int codigoConvite;
	
	public Convidado(String nm, int cvt) 
	{
		this.nome = nm;
		this.codigoConvite = cvt;
	}
	
	
	// Getters e Setters
	public String getNome() {
		return nome;
	}
	
	public int getCodigoConvite() {
		return codigoConvite;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCodigoConvite(int codigoConvite) {
		this.codigoConvite = codigoConvite;
	}
	
	// To String
	@Override
	public String toString() 
	{
		return "Nome: " + nome + "Num. convite: " + codigoConvite + "";
	}
	
	/* Ao incrementar um objeto,é realizado uma verificação para que valores não sejam inseridos em duplicidade 
	 * 
	 */
	public boolean equals(Object obj) 
	{
		if (this == obj) return true;
		if (!(obj instanceof Convidado convidado)) return false;
		return getCodigoConvite() == getCodigoConvite();
	}
	
	
	public int hashCode() 
	{
		return Objects.hash(getCodigoConvite());
	}
	
}
