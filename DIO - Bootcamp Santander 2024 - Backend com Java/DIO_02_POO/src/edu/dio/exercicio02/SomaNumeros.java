package edu.dio.exercicio02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros 
{
	private List<Numeros> numerosList;
	private List<Numeros> numerosOrdenados;

	public SomaNumeros() 
	{
		this.numerosList = new ArrayList<>();
	}
	
	public void adicionarNumero(int numeros)
	{
		numerosList.add(new Numeros(numeros));
	}
	
	public void calcularSoma()
	{
		if (!numerosList.isEmpty())
		{
			int soma = 0;
			for (Numeros numeros : numerosList) 
			{
				soma += numeros.getNumero();
			}
			System.out.println("Soma dos números: " + soma);	
		}		
	}
	
	public void encontrarMaiorNumero()
	{
		ordenarLista();
		System.out.println(numerosOrdenados.get(numerosOrdenados.size()-1));
		
	}
	
	public void encontrarMenorNumero()
	{
		ordenarLista();
		System.out.println(numerosOrdenados.get(0));
		
	}
	
	public void exibirNumeros()
	{
		ordenarLista();
		System.out.println(numerosOrdenados);
	}
	
	public void ordenarLista()
	{
		this.numerosOrdenados = new ArrayList<>(numerosList);
		Collections.sort(numerosOrdenados);
	}
	
}
