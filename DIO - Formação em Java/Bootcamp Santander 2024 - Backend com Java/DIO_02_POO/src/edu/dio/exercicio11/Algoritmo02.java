package edu.dio.exercicio11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Algoritmo02 
{
	/*
	 * Orientação a Objetos na Prática com Java
	 * 2 / 5 - Registro de Transações Bancárias com Stream API
	 */
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) 
        {
          
            String tipoTransacao = scanner.next();
            double valorTransacao = scanner.nextDouble();

            // TODO: Criar uma nova transação e adicioná-la à lista de transações
            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            

            // Verifica e atualiza o saldo da conta com base no tipo de transação
            if (tipoTransacao.equalsIgnoreCase("D")) 
            {
                saldo += valorTransacao;
            } 
            else if (tipoTransacao.equalsIgnoreCase("S")) 
            {
                saldo -= valorTransacao;
            }
            transacoes.add(transacao);
        }

        System.out.println("Saldo : " + saldo);
        System.out.println("Transacoes:");
        transacoes.stream()
                //.map(transacao -> )
                .collect(Collectors.toList())
                .forEach(System.out::println);
        
        scanner.close();
    }

}


class Transacao 
{
	private String tipo;
	private double valor;
	
	public Transacao(String tipo, double valor) {
		this.tipo = tipo;
		this.valor = valor;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public double getValor() {
		return valor;
	}
	
	@Override
	public String toString() 
	{
		return tipo + " de " + valor;
	}
}
