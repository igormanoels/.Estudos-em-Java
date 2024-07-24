package edu.dio.aula08Abstacao;

/*
 * O conceito de Abstração garante que os métodos filhos implemente alguns 
 * métodos obrigatóriamente. Como no caso do ligar, os filhos precisam desse
 * criar esse método para existir.
 */
public abstract class Veiculo 
{

	public abstract void ligar();
	
	// Quando os métodos estiverem em Proteção, apenas as 
	// classes filhas irão conseguir enxergar essas classes
	protected void acelerar() 
	{
		System.out.println("Acelerando");
	}
	
	protected void freiar() 
	{
	}
}
