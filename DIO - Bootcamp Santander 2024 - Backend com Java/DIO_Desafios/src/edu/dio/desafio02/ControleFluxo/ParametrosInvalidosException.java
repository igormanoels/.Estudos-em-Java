package edu.dio.desafio02.ControleFluxo;

public class ParametrosInvalidosException extends Exception 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	static String mensagem = "O primeiro valor precisa ser menor que o segundo!!!";
	
	public ParametrosInvalidosException() 
	{
		super(mensagem);
	}
}
