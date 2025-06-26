package br.edu.dio.Aula_001_ClasseEencapsulamento.ex_002;

import java.util.Scanner;

/* Todos os exercicios precisam de um menu para chamar a função e ter uma opção para sair
 * Desenvolva uma aplicação que simule um carro: 
 * ligar o carro
 * desligar o carro, critérios: 
 * 	- o carro sempre começa desligado e não pode executar nenhum comando
 * 	- em ponto morto, ao ligar e antes de deligar 
 * 	- velocidade em 0 
 * acelerar - vai de 1 a 120km, aumentando 1km por vez
 * diminuir velocidade - reduz 1km por vez até o 0km
 * virar para direita/esquerda, somente se a velocidade estiver entre 1 e 40km
 * verificar velocidade
 * troca de marcha, deve haver 6 marchas, as marchas devem cumprir os seguintes critérios:
 * 	- 1º: 0km a 20km
 *  - 2º: 21km a 40km
 *  - 3º: 41km a 60km
 * 	- 4º: 61km a 80km
 * 	- 5º: 81km a 100km
 * 	- 6º: 101km a 120km
 * 
 */


public class ex_002 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Carro carro = new Carro();
		int op;
		
		do {
			System.out.print("Menu: \n"
					+ "0 - Deligar carro\n"
					+ "1 - Ligar carro\n"
					+ "2 - Acelerar\n"
					+ "3 - Freiar\n"
					+ "4 - Subir marcha\n"
					+ "5 - Diminuir marcha\n"
					+ "6 - Virar para a direita\n"
					+ "7 - Virar para a esquerda\n"
					+ "Digite a opção desejada: ");
			op = Integer.parseInt(ler.nextLine());
			
			switch (op) {
			case 0:
				carro.ligarDesligar();
				break;
			case 1:
				carro.ligarDesligar();
				break;
			case 2:
				carro.acelerar();
				break;
			case 3:
				carro.freiar();
				break;
			case 4:
				carro.subirMarcha();
				break;
			case 5:
				carro.descerMarcha();
				break;
			case 6:
				carro.virarDireita();
				break;
			case 7:
				carro.virarEsquerda();
				break;
			default:
				System.out.println("\nOpção inválida.\n");
				break;
			}
			
		} while (op != 0);
		
		ler.close();
	}

}
