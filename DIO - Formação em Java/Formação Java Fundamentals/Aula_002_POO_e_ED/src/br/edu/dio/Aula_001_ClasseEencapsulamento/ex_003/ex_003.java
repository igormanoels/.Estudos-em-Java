package br.edu.dio.Aula_001_ClasseEencapsulamento.ex_003;

import java.util.Scanner;

/* Todos os exercicios precisam de um menu para chamar a função 
 * e ter uma opção para sair. Desenvolva uma aplicação de um petshop, 
 * simulando a maquina de banho
 * 
 * Funções:
 * - Dar banho no pet
 * - Abastecer com agua
 * - Abastecer com shampoo
 * - verificar nivel da agua
 * - verificar nivel do shampoo
 * - verificar se tem pet no banho
 * - colocar pet na maquina
 * - retirar pet da maquina
 * - limpar maquina
 * 
 * Requisitos:
 * - A maquina so lava 1 pet por vez
 * - para cada banho, 10lts de agua e 2lts de shampoo
 * - capacidade maxima 30lts de agua e 10 de shampoo
 * - ao retirar um pet, antes de colocar outro é preciso limpar a maquina
 * - limpeza da maquina consome 3lts de agua e 1 de shampoo
 * - os abastecimentos são realizaados com 2lts por vez
 * 
 */


public class ex_003 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Lavadora lavadora = new Lavadora();
		int op;
		
		do {
			System.out.print("\nEscolha uma função\n"
						   + "0 - Desligar máquina.\n"
						   + "1 - Dar banho no pet\n"
						   + "2 - Abastecer com água\n"
						   + "3 - Abastecer com shampoo\n"
						   + "4 - Verificar nível da água\n"
						   + "5 - Verificar nível do shampoo\n"
						   + "6 - Verificar se tem pet no banho\n"
						   + "7 - Colocar pet na máquina\n"
						   + "8 - Retirar pet da máquina\n"
						   + "9 - Limpar máquina\n"
						   + "Digite a opção desejada: ");
			op = Integer.parseInt(ler.nextLine());
			
			switch (op) {
			case 0:
				System.out.print("\n\nA máquina está sendo esligada");
				lavadora.tempo();
				break;
			case 1:
				lavadora.darBanho();
				break;
			case 2:
				lavadora.abastecerAgua();
				break;
			case 3:
				lavadora.abastecerShampoo();
				break;
			case 4:
				lavadora.nivelAgua();
				break;
			case 5:
				lavadora.nivelShampoo();
				break;
			case 6:
				lavadora.verificarOcupacao();
				break;
			case 7:
				lavadora.colocarPet();
				break;
			case 8:
				lavadora.retirarPet();
				break;
			case 9:
				lavadora.limpar();
				break;
			default:
				System.out.println("\nOpção inválida\n");
				break;
			}
		} while (op != 0);
		
		ler.close();
	}

}
