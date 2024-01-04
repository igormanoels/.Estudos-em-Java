package Algoritmo_140;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VerificaDesconto {
	static String cliente, contaFormatada;
	static double conta;
	static char letra;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat ("###,###,###,###.00");
		System.out.println("Algoritmo: Lê o nome e o valor da conta e imprimi o valor da conta com ou sem desconto.");
		
		System.out.print("Informe o nome do cliente: ");
			cliente = ler.nextLine();
		System.out.print("Informe agora o valor da conta: R$ ");
			conta = ler.nextDouble();
		
		letra = cliente.charAt(0);
		
		if (letra == 'A' || letra == 'D' || letra == 'M' || letra == 'S') {
			conta = conta * 0.7;
			contaFormatada = formatar.format(conta);
			System.out.print("\nParabéns, você conseguiu o desconto."
						   + "\nO valor da sua conta agora é de R$ " + contaFormatada);
		}
			else {
				contaFormatada = formatar.format(conta);
				System.out.print("\nQue pena. Nesta semana o desconto não é para seu nome, "
						+ "mas continue nos prestigiando que sua vez chegara."
						+ "\nTotal a pagar: R$ " + contaFormatada);
			}
			
		
		
		ler.close();
	}

}
