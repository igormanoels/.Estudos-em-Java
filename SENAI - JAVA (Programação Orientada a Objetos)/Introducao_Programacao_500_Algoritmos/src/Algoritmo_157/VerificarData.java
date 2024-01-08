package Algoritmo_157;

import java.util.Scanner;

public class VerificarData {
	static int dia, mes, ano;
	static String data, select;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê o dia, mes e ano e imprimi se é uma data válida.");

		System.out.print("Informe a data seguindo o padrão xx/xx/xxxx: ");
		data = ler.nextLine();
				
		String[] partes = data.split("/");
		// cria um vetor particionado através de um item, pode ser usado também com um espaço vazio " " 

		if (partes.length == 3) {
		    dia = Integer.parseInt(partes[0]);
		    mes = Integer.parseInt(partes[1]);
		    ano = Integer.parseInt(partes[2]);

/*	teste
 * 		    System.out.println("Dia: " + dia);
 * 		    System.out.println("Mês: " + mes);
 * 		    System.out.println("Ano: " + ano);
*/		    
		    verificarValidade();
		} else {
		    System.out.print("\nFormato da data inválido. Reinicie o programa e use xx/xx/xxxx.");
		}
		
		
		ler.close();
	}

	private static void verificarValidade() {
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
	}

}
