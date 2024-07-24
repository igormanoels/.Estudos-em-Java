package edu.dio.aula07;

import java.util.Scanner;

public class TratandoExececao2
{
	public static void main(String[] args) throws CepInvalidoException 
	{
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe seu CEP: ");
		String cep = ler.nextLine();
		verificarCep(cep);
		
		ler.close();
	}

	// O tratamento do erro é lançado via uma outra classe que fica responsável pelo tratamento do erro
	public static String verificarCep(String cep) throws CepInvalidoException 
	{
		if (cep.length() != 8)
		{
			throw new CepInvalidoException();
		}
		return cep;
	}	
}
