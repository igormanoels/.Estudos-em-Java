package collections.exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*	Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
 * Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, e em que
 * mês elas ocorreram (mostrar o mês por extenso: 1 — Janeiro, 2— Fevereiro e etc).
 */
public class Exercicio_001 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		List<Double> temperaturas = new ArrayList<>();
		String[] primeiroSemestre = {"janeiro", "fevereiro", "março", "abril", "maio", "junho"};
		
		for (int i = 0; i < primeiroSemestre.length; i++ ) 
		{
			System.out.println("Informe a temperatura de " + primeiroSemestre[i]);
			temperaturas.add(ler.nextDouble());
		}
		
		var somatoria = 0;
		Iterator<Double> iterator = temperaturas.iterator();
		while (iterator.hasNext()) 
		{
			somatoria += iterator.next();	
		}
		
		var media = somatoria / temperaturas.size();
		System.out.print("\nMédia semestral = " + media + "\nTemperaturas acima da média: ");
		
		for (Double temp : temperaturas) 
		{
			if (temp > media) System.out.print(temp + ", ");
		}
	
		ler.close();
	}

}
