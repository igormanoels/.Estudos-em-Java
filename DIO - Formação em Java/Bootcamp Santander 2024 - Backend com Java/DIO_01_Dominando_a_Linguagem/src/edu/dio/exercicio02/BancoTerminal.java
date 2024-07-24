package edu.dio.exercicio02;

/*
 * 	Exercício operadores
 * 		Crie o programa chamado BancoTerminal.java para implementar o algorítmo conforme abaixo:
 * 		O programa deverá simular uma operação de saque onde:
 * 			1 - Terá uma variável denominada saldo do tipo double contendo o valor inicial igual a 25;
 * 			2 - Terá uma variável denominada de valor solicitado do tipo double contendo o valor inicial igual a 18;
 * 			3 - Criar uma expressão relacional para que caso o saldo seja maior que o valor solicitado, o saldo recebe 
 * 			o novo valor como saldo é igual saldo menos o valor solicitado. Caso o saldo seja menor que o valor solicitado, 
 * 			devemos exibir a mensagem "Saldo insuficiente";
 * 			4 - Imprima o valor do saldo;
 * 			5 - Em seguida, realize a mesma execução do programana agora com os valores saldo igual a 15 e valor solicitado 
 * igual a 22 e exiba o resultado;
 */

public class BancoTerminal 
{
	public static void main(String[] args) 
	{
		double saldo = 15;
		double valorSolicitado = 22;
		
		if (saldo >= valorSolicitado) 
		{
			saldo = saldo - valorSolicitado;
			System.out.println("Saldo atual: R$ " + saldo);
		} 
		else 
		{
			System.out.println("Sando insuficiente");
		}
	}
}
