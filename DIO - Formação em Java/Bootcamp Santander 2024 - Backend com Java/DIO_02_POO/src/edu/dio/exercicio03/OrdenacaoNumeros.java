package edu.dio.exercicio03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros 
{
	
	private List<Numeros> numerosList;
	private List<Numeros> numerosCrescentes;
	private List<Numeros> numerosDecrescentes;
	
	public OrdenacaoNumeros() 
	{
		this.numerosList = new ArrayList<>();
	}
	
	public void adcionarNumero(int num)
	{
		numerosList.add(new Numeros(num));
	}
	
	public void ordenarAscendente()
	{
		this.numerosCrescentes = new ArrayList<>(numerosList);
		Collections.sort(numerosCrescentes);
		exibirLista(numerosCrescentes);
	}
	
	public void ordenarDescendente()
	{
		this.numerosDecrescentes = new ArrayList<>(numerosList);
		Collections.sort(numerosDecrescentes, Collections.reverseOrder());
		exibirLista(numerosDecrescentes);
	}
	
	public void exibirLista(List<Numeros> exibicao)
	{
		for (Object i : exibicao) 
		{
			System.out.println(i + " ");
		}
		System.out.println("");
	}
}
