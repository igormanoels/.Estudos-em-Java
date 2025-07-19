package Exercicios.Aula_14_15;

import java.util.Scanner;

// 18. Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.

public class Exercicio_18 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String[] dataVetor;
		int dia, mes, ano;

		System.out.print("Informe uma data no formato dd/mm/aaaa: ");
		String data = ler.nextLine();
		
		dataVetor = data.split("/");
		dia = Integer.parseInt(dataVetor[0]);
		mes = Integer.parseInt(dataVetor[1]);
		ano = Integer.parseInt(dataVetor[2]);

		
		if (dia > 0 && mes > 0 && ano > 0) {
			
			if ((mes == 2 && dia < 28) || (mes % 2 == 0 && dia <= 30) || (mes % 2 != 0 && dia <= 31)) {
				System.out.println("Data válida.");
			} else {
				System.out.println("Data inválida.");
			}
		} else {
			System.out.println("Data inválida.");
		}
		
		ler.close();
	}

}
