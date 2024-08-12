package collections.exercicios;

import java.util.ArrayList;
import java.util.List;

/*	Faça um programa que simule um lançamento de dados.
 * 	Lance o dado 100 vezes e armazene.
 * 	Depois, mostre quantas vezes cada valor foi inserido.
 */
public class Exercicio_006 
{
	public static void main(String[] args) 
	{
		int[] valoresDado = new int[100];
		
		valoresDado = lancarDados(valoresDado);
		contarValoresIguais(valoresDado);
	}
	
	
	static int[] lancarDados(int [] ld)
	{
		for (int i = 0; i < ld.length; i++) 
		{
			ld[i] = (int) Math.round((Math.random() * 5) + 1);
//			System.out.println(ld[i]);
		}
		
		return ld;
	}
	
	
	static void contarValoresIguais(int[] ld)
	{
		List<Integer> quantidades1 = new ArrayList<>();
		List<Integer> quantidades2 = new ArrayList<>();
		List<Integer> quantidades3 = new ArrayList<>();
		List<Integer> quantidades4 = new ArrayList<>();
		List<Integer> quantidades5 = new ArrayList<>();
		List<Integer> quantidades6 = new ArrayList<>();

		for (int i = 0; i < ld.length; i++) 
		{
			if (ld[i] == 1) quantidades1.add(ld[i]); 
			else if (ld[i] == 2) quantidades2.add(ld[i]);
			else if (ld[i] == 3) quantidades3.add(ld[i]);
			else if (ld[i] == 4) quantidades4.add(ld[i]);
			else if (ld[i] == 5) quantidades5.add(ld[i]);
			else if (ld[i] == 6) quantidades6.add(ld[i]);
		}
		
		System.out.println("Quantidade de números 1: " + quantidades1.size() + 
				"\nQuantidade de números 2: " + quantidades2.size() + 
				"\nQuantidade de números 3: " + quantidades3.size() + 
				"\nQuantidade de números 4: " + quantidades4.size() + 
				"\nQuantidade de números 5: " + quantidades5.size() + 
				"\nQuantidade de números 6: " + quantidades6.size() +
				"\nTotal de números: " + (quantidades1.size() + quantidades2.size() + quantidades3.size() 
										+ quantidades4.size() + quantidades5.size() + quantidades6.size())
				);
	}

}
