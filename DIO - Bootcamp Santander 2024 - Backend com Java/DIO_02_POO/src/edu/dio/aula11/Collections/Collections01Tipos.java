package edu.dio.aula11.Collections;

/*
 * As Collection são conjuntos de objetos não primitivos, 
 * 
 * 	O "<T>" conhecido como diamond é usado no contexto de tipo genérico
 *	Como o tratamento é para tipos genéricos, o algoritmo poderá receber 
 *	e tratar os tipo que for enviado com mais amplitude 
 *	Representação comuns
 *
 *	E - Elementos
 *	K - Chaves
 *	N - Número
 *	T - Tipo
 *	V - Valor
 *	S, U, V - Para outras opções de tipo
 */

public class Collections01Tipos <T>
{
	//Obejeto da classe
	private T t;
	
	// Método acesso que recebe, e atribui um valor para o objeto da classe Caixa
	public void set(T t)
	{
		this.t = t;
	}

	//Retorna o valor do objeto da classe Caixa
	public Object get()
	{
		return t;
	}
}
