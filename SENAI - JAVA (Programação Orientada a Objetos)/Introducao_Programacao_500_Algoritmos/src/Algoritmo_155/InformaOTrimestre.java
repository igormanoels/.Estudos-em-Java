package Algoritmo_155;

import java.util.Scanner;

public class InformaOTrimestre {
	static String mes;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê o mês e imprimi o trimestre.");

		System.out.print("Informe o mês ou seu número: ");
		mes = ler.nextLine();

		if (mes.equals("Janeiro") || mes.equals("Fevereiro") || mes.equals("Março")) {
			System.out.print("\nPrimeiro Trimestre.");
		} 
		else if (mes.equals("janeiro") || mes.equals("fevereiro") || mes.equals("março")) {
			System.out.print("\nPrimeiro Trimestre.");
		} 
		else if (mes.equals("1") || mes.equals("2") || mes.equals("3")) {
			System.out.print("\nPrimeiro Trimestre.");
		} 
		else if (mes.equals("Abril") || mes.equals("Maio") || mes.equals("Junho")) {
			System.out.print("\nSegundo Trimestre.");
		} 
		else if (mes.equals("abril") || mes.equals("maio") || mes.equals("junho")) {
			System.out.print("\nSegundo Trimestre.");
		} 
		else if (mes.equals("4") || mes.equals("5") || mes.equals("6")) {
			System.out.print("\nSegundo Trimestre.");
		} 
		else if (mes.equals("Julho") || mes.equals("Agosto") || mes.equals("Setembro")) {
			System.out.print("\nTerceiro Trimestre.");
		} 
		else if (mes.equals("julho") || mes.equals("agosto") || mes.equals("setembro")) {
			System.out.print("\nTerceiro Trimestre.");
		} 
		else if (mes.equals("7") || mes.equals("8") || mes.equals("9")) {
			System.out.print("\nTerceiro Trimestre.");
		} 
		else if (mes.equals("Outubro") || mes.equals("Novembro") || mes.equals("Dezembro")) {
			System.out.print("\nQuarto Trimestre.");
		} 
		else if (mes.equals("outubro") || mes.equals("novembro") || mes.equals("dezembro")) {
			System.out.print("\nQuarto Trimestre.");
		} 
		else if (mes.equals("10") || mes.equals("11") || mes.equals("12")) {
			System.out.print("\nQuarto Trimestre.");
		}

		else {
			System.out.print("\nOpção inválida.");
		}

		ler.close();
	}
}
