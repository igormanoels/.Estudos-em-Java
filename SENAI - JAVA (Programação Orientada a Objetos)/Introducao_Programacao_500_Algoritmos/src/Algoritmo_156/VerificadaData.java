package Algoritmo_156;

import java.util.Scanner;

public class VerificadaData {
	static int dia, ano, mes;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê o dia, mes e ano e imprimi se é uma data válida.");

		System.out.print("Informe o dia: ");
		dia = ler.nextInt();
		System.out.print("Informe número do mês: ");
		mes = ler.nextInt();
		System.out.print("Informe o ano: ");
		ano = ler.nextInt();

		if (ano <= 2024) {
			if (mes == 2) {
				if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
					if (dia <= 29) {
						System.out.print("\nA data: " + dia + "/" + mes + "/" + ano + ": é válida.");
					} 
					else {
						System.out.print("\nO dia informado é inválido");
						}
					}
				else { 
					if (dia <= 28) {
						System.out.print("\nA data: " + dia + "/" + mes + "/" + ano + ": é válida.");
					}
					else {
						System.out.print("\nO dia informado é inválido");
					}
				}
			}
			else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				if (dia <= 31) {
					System.out.print("\nA data: " + dia + "/" + mes + "/" + ano + ": é válida.");
				} 
				else {
					System.out.print("\nO dia informado é inválido");
				}
			}
			else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				if (dia <= 30) {
					System.out.print("\nA data: " + dia + "/" + mes + "/" + ano + ": é válida.");
				} 
				else {
					System.out.print("\nO dia informado é inválido");
				}
			} 
			else {
				System.out.print("\nO mês informado é inválido.");
				}	
			}
		else {
			System.out.print("\nO ano informado é inválido.");
		}

		
		ler.close();
	}

}
