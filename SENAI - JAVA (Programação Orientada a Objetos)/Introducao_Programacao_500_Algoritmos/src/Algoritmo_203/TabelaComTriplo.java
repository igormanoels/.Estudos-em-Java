package Algoritmo_203;

import java.util.Scanner;

public class TabelaComTriplo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê um número e apartir dele gera uma quantidade de entradas para tabela.");
		
		System.out.println("Olá tudo bem? Quantos cálculos iremos realizar?");
		var quant = ler.nextInt();
		
		int[] num = new int[quant]; 
		int[] triplo = new int[quant];
		
		for (int i = 0; i < quant; i++) {
			System.out.print("Favor informar um número: ");
			num[i] = ler.nextInt();
			triplo[i] = num[i] * 3;
		}
		
		System.out.println("\n" + quant + " valores lidos\t\tO triplo.");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + "\t\t\t" + triplo[i]);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		
		ler.close();
	}

}
