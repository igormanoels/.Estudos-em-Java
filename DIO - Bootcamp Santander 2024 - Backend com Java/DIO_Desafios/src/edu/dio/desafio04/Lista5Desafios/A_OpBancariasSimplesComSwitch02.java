package edu.dio.desafio04.Lista5Desafios;

import java.util.Scanner;

/*
 * 	Descrição
 * 	Você está desenvolvendo um programa simples em Java para simular operações bancárias básicas. A aplicação 
 * 	deve permitir ao usuário realizar depósitos, saques e consultar o saldo em uma conta bancária virtual.
 * 	
 * 	Entrada
 * 	O programa exibirá um menu com as seguintes opções.
 * 		1 - Depositar
 * 		2 - Sacar
 * 		3 - Consultar Saldo
 * 		4 - Encerrar
 * 	O usuário escolherá uma dessas opções digitando o número correspondente.
 * 	
 * 	Saída
 * 	- Utilizando um switch, o programa realizará a operação escolhida pelo usuário.
 *  - Se o usuário escolher:
 *  	1: O programa solicitará o valor a ser depositado e atualizará o saldo. Além disso, deve imprimir o saldo 
 *  	atual com a mensagem "Saldo atual: {saldo com 1 casa decimal}".
 *  	2: O programa solicitará o valor a ser sacado e verificará se há saldo suficiente. Sendo assim, deve imprimir 
 *  	"Saldo atual: {saldo com 1 casa decimal}" quando o saldo for suficiente e "Saldo insuficiente."
 *  	3: O programa apenas exibirá o saldo atual da conta: "Saldo atual: {saldo com 1 casa decimal}".
 *  	0: O programa encerrará, imprimindo "Programa encerrado.".
 * 
 */
public class A_OpBancariasSimplesComSwitch02 
{
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        double deposito, saque;
        boolean continuar = true;

        while (continuar) 
        {
        	
        	System.out.print("Menu de Opções\n"
        			+ "1 - Depositar\n"
        			+ "2 - Sacar\n"
        			+ "3 - Consultar Saldo\n"
        			+ "4 - Encerrar\n"
        			+ "Digite a opção desejada: ");
            int opcao = scanner.nextInt();

            switch (opcao) 
            {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.print("Digite o valor a ser depositado: R$ ");
                    deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("O valor do seu saldo é de R$ " + saldo + "\n");
                	break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                	System.out.print("Digite o valor a ser sacado: R$ ");
                    saque = scanner.nextDouble();
                    
                    if (saque <= saldo) 
                    {
                    	saldo -= saque;
                    	System.out.println("Transação autorizada. "
                    					 + "Valor do Saque, R$ " + saque 
                    					 + "Saldo Atualizado, R$ " + saldo + "\n");
                    } 
                    else 
                    {
                    	System.out.println("O saldo em sua conta é insuficiente.\n");
					}
                    
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("O valor do seu saldo é de R$ " + saldo + "\n");
                	break;
                case 4:
                    System.out.println("Programa encerrado.\n");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
            }
        }
        scanner.close();
	}
}
