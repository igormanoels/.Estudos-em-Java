package Aula_14;

import java.util.Scanner;

public class JogoDaVelha {
		static int rodada, plinha, pcoluna;
		static String player1, player2, jogada;
		
	public static void main(String[] args) {
		String varJogadas[][] = new String[3][3];
		int matriz[][] = new int[3][3];
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Bem Vindo ao meu Jogo da Velha");
		
		System.out.print("Informe o Nome do Primeiro Jogador: ");
			player1= ler.nextLine();
		System.out.print("Informe o Nome do Segundo Jogador: ");
			player2= ler.nextLine();			
		
		System.out.println("\nO jogo será entre: "+player1+" X "+player2 +" \n");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				rodada++;
				System.out.println("Faça a "+rodada+"º Jogada!");
					jogada = ler.nextLine();
				System.out.println("Informe a Posição da jogada");
					plinha = ler.nextInt();
				System.out.println("Informe a Posição da jogada");
					pcoluna = ler.nextInt();
				varJogadas[plinha][pcoluna] = jogada;
			}
		}
		
		System.out.println("O Resultado da partida foi: ");
		
		for (int i = 0; i < varJogadas.length; i++) {
			for (int j = 0; j < varJogadas.length; j++) {
				System.out.print(varJogadas[i][j]);
			}
		}

		ler.close();
	}

}
