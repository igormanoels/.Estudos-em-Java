package edu.dio.aula05;

public class EstruturaCondicional 
{
	public static void main(String[] args) 
	{
		double nota = 4;
		
		// Esturura de Decião Encadeada - Se...Senão
		if (nota >= 6) 
		{
			System.out.println("Aprovado");
		} 
		else if (nota >= 4) 
		{
			System.out.println("Exame");
		}
		else
		{
			System.out.println("Reprovado");
		}
		
		
		// Condição Ternária - Se...Senão
		var resposta = (nota >= 6)? "Aprovado":"Reprovado";
		System.out.println(resposta);
		
		// Condição Ternária Encadeada
		var resposta2 = (nota >= 6)? "Aprovado": (nota >= 4)? "Exame": "Reprovado";
		System.out.println(resposta2);
	
		
		// Estrutura Escolha...Caso - Switch Case
		int op = 8;
		
		switch (op) 
		{
			case 1:
				System.out.println(op + " - Opção pequeno");
				break;
			case 2:
				System.out.println(op + " - Opção médio");				
				break;
			case 3:
				System.out.println(op + " - Opção grande");
				break;
			default:
				System.err.println("Opção Inválida");
				break;
		}
	}
	
	
	

}

