package br.edu.dio.Aula_002_HerancaEpolimorfismo.ex_001;

import java.util.Scanner;

import br.edu.dio.Aula_002_HerancaEpolimorfismo.ex_001.preco_ingresso.*;


/*
 * Crie uma hierarquia de classes para tratar os tipos de ingresso que podem 
 * ser comercializados em um cinema. 
 * 
 *  - O ingresso deve ter um valor, nome do filme e informar se é dublado ou 
 *  legendado. 
 * 
 * - A partir desse ingresso devem ser criados os tipos Meia entrada e 
 * ingresso família. 
 * 
 * - Cada ingresso deve ter um método que retorna o seu valor real ( baseado 
 * no valor informado na criação do ingresso) 
 * 
 * - Para os de meia entrada o seu valor deve ser de metade do valor
 * 
 * - Para os ingressos família deve-se retornar o valor multiplicado pelo número de 
 * pessoas e fornecer um desconto de 5% quando o número de pessoas for maior que 3.
 * 
 */
public class Main {

	private static Scanner ler = new Scanner(System.in);
	private static int op;
	public static void main(String[] args) {
		
		do {			
			op = Integer.parseInt(ler.nextLine());
			System.out.print("Digite 1 para garantir seu ingresso ou 0 para encerrar a seção: ");
			
			if (op == 0) break;
			else comprarIngresso();
			
		} while (true);

		
		
		ler.close();
	}
	
	
	public static void comprarIngresso() {
		
		System.out.print("Digite a opção desejada: \n"
				+ "1 - Ingresso comum\n"
				+ "2 - Meia entreda\n"
				+ "3 - Infresso família\n"
				+ "0 - Cancelar operação\n"
				+ "Digite a opção desejada: ");
		op = Integer.parseInt(ler.nextLine());
		
		if (op == 0) {
			System.out.println("Operação cancelada!");
			return;
		}
		
		
		System.out.print("Informe agora a quantidade ingressos: ");
		var qtd = Integer.parseInt(ler.nextLine());			
		

		switch (op) {
			case 1 -> System.out.printf("Valor total da compra R$ %.2f", new Entrada().calcularPreco(qtd));
			case 2 -> System.out.printf("Valor total da compra R$ %.2f", new MeiaEntrada().calcularPreco(qtd));
			case 3 -> System.out.printf("Valor total da compra R$ %.2f", new FamiliaEntrada().calcularPreco(qtd));
			default -> System.out.println("Opção inválida.\n");
		}
		
	}
}
