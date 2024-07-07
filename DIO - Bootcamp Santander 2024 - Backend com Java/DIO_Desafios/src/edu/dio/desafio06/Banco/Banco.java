package edu.dio.desafio06.Banco;

import java.util.ArrayList;
import java.util.List;

public class Banco 
{
	protected final short agencia = 001;
	protected final String endereco = "Rua das flores";
	protected final short numero = 91;
	protected final String bairro = "Sé";
	protected final String estado = "São Paulo";
	
	private List<Cliente> clientes;
	
	public Banco() 
	{
		this.clientes = new ArrayList<>();
	}
	protected void abrirConta() 
	{
		
	}
	
	protected void encerrarConta() 
	{
		
	}
	
	
	
	
}
