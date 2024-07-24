package edu.dio.desafio04.Lista5Desafios;

import java.util.Scanner;

public class D_VerificarChequeEspecial01 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();

        double limiteChequeEspecial = 500;

        
        if (saque <= saldo) 
        {
        	System.out.println("Transacao realizada com sucesso.");
        } 
        else 
        {
            if (saque <= limiteChequeEspecial + saldo) 
            {
				System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
			} 
            else 
            {
				System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
			}
        }
        
        scanner.close();
	}

}
