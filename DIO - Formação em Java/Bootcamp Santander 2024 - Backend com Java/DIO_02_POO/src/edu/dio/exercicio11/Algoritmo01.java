package edu.dio.exercicio11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Algoritmo01 
{
	/*
	 * Orientação a Objetos na Prática com Java
	 * 1 / 5 - Registro de Transações Bancárias
	 */
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        // INPUT
        double saldo = scanner.nextDouble();      
        int quantidadeTransacoes = scanner.nextInt();

        
        List<String> transacoes = new ArrayList<>();

        
        for (int i = 1; i <= quantidadeTransacoes; i++) 
        {
        
        	// INPUT
            char tipoTransacao = scanner.next().toUpperCase().charAt(0);
            double valorTransacao = scanner.nextDouble();

            if (tipoTransacao == 'D') {
                saldo += valorTransacao;
                transacoes.add("Deposito de " + valorTransacao);
            } else if (tipoTransacao == 'S') {
                saldo -= valorTransacao;
                transacoes.add("Saque de " + valorTransacao);
            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--; 
            }
        }

        // OUTPUT
        int quant = 1;
        System.out.println("Saldo: " + saldo + "\nTransacoes:");
        for (String p : transacoes) 
        {
			System.out.println(quant + ". " + p);
			quant++;
        }
        
        
        scanner.close();
    }
}
