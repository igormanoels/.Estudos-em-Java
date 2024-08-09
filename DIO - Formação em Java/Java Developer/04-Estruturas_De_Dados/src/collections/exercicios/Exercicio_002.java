package collections.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
 * 1."Telefonou para a vítima?"
 * 2."Esteve no local do crime?"
 * 3."Mora perto da vítima?"
 * 4."Devia para a vítima?"
 * 5."Já trabalhou com a vítima?"
 * Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 
 * como "Cúmplice" e 5 como "Assassina". Caso contrário, ela será classificado como "Inocente".
*/
public class Exercicio_002 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		List<String> respostas = new ArrayList<>();
		String[] perguntas = {
				"Telefonou para a vítima?",
				"Esteve no local do crime?",
				"Mora perto da vítima?",
				"Devia para a vítima?",
				"Já trabalhou com a vítima?"
		};
		
		System.out.println("Você está em um interrogatório, responda apenas sim ou não!");
		
		for (String string : perguntas) 
		{
			System.out.println(string);
			respostas.add(ler.nextLine());
		}
		
		var totalSim= 0;

		for (String resp: respostas) 
		{
			if (resp.contains("s")) 
			{
				totalSim++;
			}
		}
		
		if (totalSim == 2) System.out.println("Certo, você é suspeito!");
		else if (totalSim >= 3 && totalSim <= 4) System.out.println("Certo, você é cúmplice!");
		else if (totalSim == 5) System.out.println("Certo, você é assassina!");
		else System.out.println("Certo, você é inocente!");
		
		
		ler.close();
	}
}
