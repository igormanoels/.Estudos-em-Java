package Algoritmo_144;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculaCredido {
	static double credito, valorFuturo, saldoMedio;
	static String creditoForm, valorFuturoForm;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat formatar = new DecimalFormat("###,###,###,###.00");
		System.out.println("Algoritmo: Lê o saldo médio do último ano e imprimi o crédito que será disponibilizado.");
		
		System.out.print("Informe o saldo médio do último exercicio: ");
			saldoMedio = ler.nextDouble();
		
		if (saldoMedio <= 500) {
			System.out.print("\nNão há disponibilidade de crédito para esse cliente.");
		} 
		else {
			if (saldoMedio <=1000) {
				credito = saldoMedio * 0.3;
				valorFuturo = credito * 1.02;
				creditoForm = formatar.format(credito);
				valorFuturoForm = formatar.format(valorFuturo);
				System.out.print("\nCrédito liberado: R$ " + creditoForm 
							+    "\nMontante para pagamento: R$ " + valorFuturoForm);
			} 
			else {
				if (saldoMedio <= 3000) {
					credito = saldoMedio * 0.4;
					valorFuturo = credito * 1.02;
					creditoForm = formatar.format(credito);
					valorFuturoForm = formatar.format(valorFuturo);
					System.out.print("\nCrédito liberado: R$ " + creditoForm 
								+    "\nMontante para pagamento: R$ " + valorFuturoForm);
				} 
				else {
					credito = saldoMedio * 0.5;
					valorFuturo = credito * 1.02;
					creditoForm = formatar.format(credito);
					valorFuturoForm = formatar.format(valorFuturo);
					System.out.print("\nCrédito liberado: R$ " + creditoForm 
								+    "\nMontante para pagamento: R$ " + valorFuturoForm);
				}
			}
		}
				
		
		ler.close();
	}

}
