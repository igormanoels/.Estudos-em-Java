package com.empresa;

public class Endereco 
{
	private String rua;
	private String bairro;
	private String complemento;
	
	
	// CONSTRUTOR
	public Endereco(String rua, String bairro, String complemento) 
	{
		this.rua = rua;
		this.bairro = bairro;
		this.complemento = complemento;
	}
	
	
	// GETTERS AND SETTERS
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	// TO STRING
	@Override
	public String toString() 
	{
		return "\nEndereço - Rua: " + rua + ", Bairro: " + bairro + ", Complemento: " + complemento;
	}
	
	
}
