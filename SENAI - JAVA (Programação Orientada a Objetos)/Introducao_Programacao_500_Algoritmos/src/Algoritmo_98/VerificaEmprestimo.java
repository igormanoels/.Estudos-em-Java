package Algoritmo_98;

import java.util.Scanner;

public class VerificaEmprestimo {
	static double emprestimo, salario;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o salário do servidor");
		 	salario = ler.nextDouble();
		System.out.println("Informe a parcela do empréstimo");
		 	emprestimo = ler.nextDouble();
		 
		if (emprestimo <= salario * 0.3) {
			System.out.println("Financiamento liberado");
		} else {
			System.out.println("Financiamento Negado");
		}
		
		ler.close();
	}

}
