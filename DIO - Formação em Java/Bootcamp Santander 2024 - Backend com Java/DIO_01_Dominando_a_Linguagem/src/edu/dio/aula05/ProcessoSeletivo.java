package edu.dio.aula05;

public class ProcessoSeletivo 
{
	public static void main(String[] args) 
	{
		System.out.println("Processo seletivo \n");
		
		analisarCandidato(1200.45);
		analisarCandidato(2000.00);
		analisarCandidato(3500.00);
		
	}

	static void analisarCandidato(double salPretendido)
	{
		double salBase = 2000.00;
		
		if (salBase > salPretendido) 
		{
			System.out.println("Ligar para o candidato.");
		} 
		else if (salBase == salPretendido)
		{
			System.out.println("Ligar para candidato com contra proposta.");
		}
		else
		{
			System.out.println("Aguardando resultado de demais propostas.");
		}
	}
}
