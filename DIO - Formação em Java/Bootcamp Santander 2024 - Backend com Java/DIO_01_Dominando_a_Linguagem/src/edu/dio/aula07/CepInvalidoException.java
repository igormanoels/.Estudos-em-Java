package edu.dio.aula07;

public class CepInvalidoException extends Exception 
{
	public CepInvalidoException() 
	{
		System.err.println("CEP inválido, o CEP deve conter 8 dígitos");
	}
}
