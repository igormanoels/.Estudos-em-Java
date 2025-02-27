package br.edu.dio.Aula_001_ClasseEencapsulamento.ex_001;

import java.util.Scanner;

/* Todos os exercicios precisam de um menu para chamar a função e ter uma opção para sair
 * Desenvolva uma aplicação bancária com as operações de: 
 * consulta de saldo
 * consulta de cheque especial - 10% do valor do depósito inicial, taxa de 20% pelo uso
 * sacar dinheiro
 * pagar boleto
 * verificar se a conta está usando o cheque especial
 * 
 */

public class ex_001 {
		
	private static int opcao;
	private static boolean ativo = true;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Banco banco = new Banco();
		
		while (ativo) {
			System.out.print("Escolha uma opção desejada: \n"
					+ "0 - Encerrar seção.\n"
					+ "1 - Depositar.\n"
					+ "2 - Sacar.\n"
					+ "3 - Consultar saldo.\n"
					+ "4 - Consultar cheque especial.\n"
					+ "Digite a opção desejada: ");
			opcao = ler.nextInt();
			
			switch (opcao) {
			case 0:
				System.out.println("\n\nEncerrando seção.");
				ativo = false;
				break;
			case 1:
				System.out.print("Informe o valor para depósito: ");
				banco.depositar(Double.parseDouble(ler.nextLine()));
				break;
			case 2:
				System.out.print("Informe o valor para saque: ");
				banco.sacar(Double.parseDouble(ler.nextLine()));				
				break;
			case 3:
				banco.consultarSaldo();
				break;
			case 4:
				banco.consultarChequeEspecial();
				break;
			default:
				System.out.println("\nOpção inválida!\n\n");
				break;
			}
		}
		
		
	}
	
}
