package edu.dio.desafio06.Banco;

public class PessoaJuridica implements Cliente
{
	private String nome;
    private String cnpj;
    private String rua;
    private int numero;
    private String bairro;
    private String estado;
    private String uf;
    private Conta conta;
    
    
	// Constructor
	public PessoaJuridica(String nome, String cnpj, String rua, int numero, String bairro, String estado, String uf) 
	{
		this.nome = nome;
		this.cnpj = cnpj;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.estado = estado;
		this.uf = uf;
	}
	
	
	// ToString
	public String toString() 
	{	
		return "Cliente: " + nome + " - CPF: " + cnpj + "\nEndereço: " + rua + ", nº" + numero 
					+ "\nBairro: " + bairro + " - " + estado + " - " + uf ;
	}
	

	// Getters and Setters
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


	public Conta getConta() {
		return conta;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	@Override
	public String getDocumento() {
		return cnpj;
	}


	@Override
	public void setConta(Conta conta) {
		this.conta = conta;
		
	}
}
