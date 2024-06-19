package edu.dio.aula04Construtor;

public class Cadastro 
{
	public static void main(String[] args) 
	{
		// na criação do objeto já é informado os dados do construtor
		Pessoa pessoa = new Pessoa("Igor", "XXXXXXXXXX", "Rua das Flores");
		
		System.out.println(pessoa.getNome() + " - " + pessoa.getCpf());
	}
}
