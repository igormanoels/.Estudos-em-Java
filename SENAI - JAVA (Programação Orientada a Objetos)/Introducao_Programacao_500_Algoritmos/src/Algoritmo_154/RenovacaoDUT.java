package Algoritmo_154;

import java.util.Scanner;

public class RenovacaoDUT {
	static String placa;
	static char num;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê a placa e imprimi o mês de renovação do DUT.");

		System.out.print("Informe a placa do veículo: ");
			placa = ler.nextLine();
	
		num = placa.charAt(6);
		
		switch (num) {
			case '1': {
				System.out.print("\nO mês de renovação é Janeiro.");
				break;
			}
			case '2': {
				System.out.print("\nO mês de renovação é Fevereiro.");
				break;
			}
			case '3': {
				System.out.print("\nO mês de renovação é Março.");
				break;
			}
			case '4': {
				System.out.print("\nO mês de renovação é Abril.");
				break;
			}
			case '5': {
				System.out.print("\nO mês de renovação é Maio.");
				break;
			}
			case '6': {
				System.out.print("\nO mês de renovação é Junho.");
				break;
			}
			case '7': {
				System.out.print("\nO mês de renovação é Julho.");
				break;
			}
			case '8': {
				System.out.print("\nO mês de renovação é Agosto.");
				break;
			}
			case '9': {
				System.out.print("\nO mês de renovação é Setembro.");
				break;
			}
			case '0': {
				System.out.print("\nO mês de renovação é Outubro.");
				break;
			}
		default:
			System.out.print("\nA placa informada está incorreta, reinicie o programa.");
		}
		
		
		ler.close();
	}

}
