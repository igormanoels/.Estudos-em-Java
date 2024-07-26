package com;

import com.empresa.Empresa;

public class Principal 
{
	public static void main(String[] args) 
	{
		Empresa empresa = new Empresa();
				
		// "Igor", "4111", "Pessoa Física", 1822.00, "Rua de casa", "Guaianases", "SP"
		empresa.consultarColaborador("41224");
		empresa.cadastrarPessoaFisica("Igor", "4111", "Pessoa Física", 1822.00, "Rua de casa", "Guaianases", "SP", 8);
		empresa.consultarColaborador("4111");
	}
}
