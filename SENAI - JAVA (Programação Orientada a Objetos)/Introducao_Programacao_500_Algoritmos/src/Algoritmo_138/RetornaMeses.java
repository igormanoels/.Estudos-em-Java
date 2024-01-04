package Algoritmo_138;

import java.util.Scanner;

public class RetornaMeses {
	static int op;
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo: Lê a opção e imprimi o mês conforme solicitado.");

		System.out.print("Informe o número do mês desejado: ");
			op = ler.nextInt();
		
			switch (op) {
			case 1: {
				System.out.print("\nO mês selecionado é Janeiro.");
				break;
			}
			case 2: {
				System.out.print("\nO mês selecionado é Fevereiro.");
				break;
			}
			case 3:{
				System.out.print("\nO mês selecionado é Março.");
				break;
			}
			case 4:{
				System.out.print("\nO mês selecionado é Abril.");
				break;
			}
			case 5: {
				System.out.print("\nO mês selecionado é Maio.");
				break;
			}
			case 6: {
				System.out.print("\nO mês selecionado é Junho.");
				break;
			}
			case 7: {
				System.out.print("\nO mês selecionado é Julho.");
				break;
			}
			case 8: {
				System.out.print("\nO mês selecionado é Agosto.");
				break;
			}
			case 9: {
				System.out.print("\nO mês selecionado é Setembro.");
				break;
			}
			case 10: {
				System.out.print("\nO mês selecionado é Outubro.");
				break;
			}
			case 11: {
				System.out.print("\nO mês selecionado é Novembro.");
				break;
			}
			case 12: {
				System.out.print("\nO mês selecionado é Dezembro.");
				break;
			}
			default:
				System.out.print("\nPara o número informado não há um mês.");
			}
			
			
		ler.close();
	}

}
