package edu.dio.exercicio11;

import java.util.Scanner;

public class Algoritmo03 
{
	/*
	 * Orientação a Objetos na Prática com Java
	 * 3 / 5 - Conta Bancária com Construtor em POO
	 */
    public static void main(String[] args) 
    {    	
        Scanner scanner = new Scanner(System.in);

        double saldoInicial = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(saldoInicial);
        
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

        scanner.close();
    }
}

class ContaBancaria 
{
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) 
    {
        saldo += valor;
        System.out.println("Deposito feito.");
        imprimirSaldo();
    }

    public void sacar(double valor) 
    {
    	if (saldo >= valor) 
    	{
    		saldo -= valor;
            System.out.println("Saque feito.");
		} 
    	else 
    	{
    		System.out.println("Saldo insuficiente. Saque não realizado.");
		}
        imprimirSaldo();
    }
    
    private void imprimirSaldo() {
        System.out.printf("Saldo atual: %.1f\n", this.saldo);
    }

}
