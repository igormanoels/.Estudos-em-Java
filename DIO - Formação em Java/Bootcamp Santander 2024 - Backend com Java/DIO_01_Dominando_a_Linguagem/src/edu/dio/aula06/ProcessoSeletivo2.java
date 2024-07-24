package edu.dio.aula06;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo2 
{
	public static void main(String[] args) 
	{
		selecaoCandidatos();
	}
	
	static void selecaoCandidatos()
	{
		String[] candidatos = {"Heitor", "Ana", "Silvia", "Clara", "Pedro", "Vitoria", "Samela", "Sandra", "Jairo", "Inácio", "Felipe", "Marcia", "Augusto"};
		
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salBase = 2000.00;
		
		while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length)
		{
			String candidato = candidatos[candidatoAtual];
			double salPretendido = valorPretendido();
			
			System.out.printf("O candidato " + candidato + ", solicitou o salário de R$ %.2f", salPretendido);
			
			if (salBase > salPretendido) 
			{
				System.out.println("\nO candidato nº" + (candidatoAtual+1) + ", "  + candidato + " foi selecionado.");
				entrandoEmContado(candidato);
				candidatosSelecionados++;
			} 
			else
			{
				System.out.println("\nO candidato nº" + (candidatoAtual+1) + ", "+ candidato + " não foi selecionado. \n");
			}
			candidatoAtual++;
		}
	}
	
	static void entrandoEmContado(String candidato)
	{
		int tentativas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		
		do 
		{
			atendeu = ligar();
			continuarTentando = !atendeu;
			if (continuarTentando) 
			{
				tentativas++;
			} 
			else 
			{
				System.out.println("Contato realizado com sucesso!");
			}
		} while (continuarTentando && tentativas < 3);
		
		if (atendeu) 
		{
			System.out.println("Conseguimos contato com " + candidato + ", na tentativa nº " + tentativas + "\n");
		} 
		else 
		{
			System.out.println("Não conseguimos contato com " + candidato + ".\n");
		}
	}
	
	
	static double valorPretendido()
	{
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static boolean ligar()
	{
		return new Random().nextInt(3)==1;
	}
	
}
