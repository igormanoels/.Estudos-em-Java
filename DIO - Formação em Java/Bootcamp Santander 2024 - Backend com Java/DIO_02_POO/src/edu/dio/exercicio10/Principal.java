package edu.dio.exercicio10;

import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal 
{
	static List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

	public static void main(String[] args) 
	{
		boolean continuar = true;
		int op;
				
		while (continuar) 
		{
			op = Integer.parseInt(JOptionPane.showInputDialog(null,"n " + numeros
					+ "\nEscolha uma das opções abaixo: \n"
					+ "0 - Encerrar aplicação. \n"
					+ "1 - Ordena os números. \n"
					+ "2 - Mostra a soma dos números pares. \n"
					+ "3 - Exibe os números positivos. \n"
					+ "4 - Remove todos os valores impares. \n"
					+ "5 - Cálcula a média dos números maiores que 5. \n"
					+ "6 - Verifica se há um número maior que 10. \n"
					+ "7 - Encontra o segundo maior número da lista. \n"
					+ "8 - Soma todos os números da lista. \n"
					+ "9 - Verifica se os números se repetem. \n"
					+ "10 - Mostra os números multiplos de 3 e 5. \n"
					+ "11 - Mostra a soma dos quadrados da lista. \n"
					+ "12 - Mostra o produto dos números da lista. \n"
					+ "13 - Mostra os números a partir de um intervalo. \n"
					+ "14 - Mostra o maior número primo. \n"
					+ "15 - Verifica se há números negativos na lista. \n"
					+ "16 - Separa os números pares dos impares. \n"
					+ "17 - Cálcula o fatorial de um número da lista. \n"
					+ "18 - Mostra os números primos da lista. \n"
					+ "19 - Verifica se todos os números da lista são iguais. \n"
					+ "20 - Mostra a soma dos números divisíveis por 3 e 5.\n ",
					"DADO O CONJUNTO DOS NÚMEROS", JOptionPane.QUESTION_MESSAGE));
					
			continuar = acoesMenu(op);	
		}
		
	}
	
	public static boolean acoesMenu(int op)
	{
		switch (op) 
		{
			case 0:
				JOptionPane.showMessageDialog(null, "Obrigado por testar meu algoritmo!", 
						"ENCERRANDO APLICAÇÃO", JOptionPane.INFORMATION_MESSAGE);
				return false;
			case 1:
				Desafios.Desafio01(numeros);
				return true;

			case 2:
				Desafios.Desafio02(numeros);
				return true;				
			case 3:
				Desafios.Desafio03(numeros);
				return true;
			case 4:
				Desafios.Desafio04(numeros);
				return true;
			case 5:
				Desafios.Desafio05(numeros);
				return true;
			case 6:
				Desafios.Desafio06(numeros);
				return true;
			case 7:
				Desafios.Desafio07(numeros);
				return true;
			case 8:
				Desafios.Desafio08(numeros);
				return true;
			case 9:
				Desafios.Desafio09(numeros);
				return true;
			case 10:
				Desafios.Desafio10(numeros);
				return true;
			case 11:
				Desafios.Desafio11(numeros);
				return true;
			case 12:
				Desafios.Desafio12(numeros);
				return true;
			case 13:
				Desafios.Desafio13(numeros);
				return true;
			case 14:
				Desafios.Desafio14(numeros);
				return true;
			case 15:
				Desafios.Desafio15(numeros);
				return true;
			case 16:
				Desafios.Desafio16(numeros);
				return true;
			case 17:
				Desafios.Desafio17(numeros);
				return true;
			case 18:
				Desafios.Desafio18(numeros);
				return true;
			case 19:
				Desafios.Desafio19(numeros);
				return true;
			case 20:
				Desafios.Desafio20(numeros);
				return true;
			default:
				JOptionPane.showMessageDialog(null, "Por favor, escolha uma opção de acordo com o menu.",
						"OPÇÃO INVÁLIDA!", JOptionPane.ERROR_MESSAGE);
				return true;
		}
	}
}
