package edu.dio.aula02.lanchonete;

public class Almoxarife 
{
	private void controlarEntrada() 
	{
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}
	private void controlarSaida() 
	{
		System.out.println("CONTROLANDO A SAIDA DOS ITENS");
	}
	void entregarIngredientes() 
	{
		controlarEntrada();
		
		System.out.println("ENTREGANDO INGREDIENTES");
		//...?
		controlarSaida();
	}
	void trocarGas() 
	{
		System.out.println("ALMOXARIFE TROCANDO O GÁS");
	}
}
