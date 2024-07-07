package edu.dio.desafio06.Banco;

import javax.swing.JOptionPane;

public class Principal 
{
	static int op;
	static boolean continuar = true;
	
	public static void main(String[] args) 
	{
	//	Conta cc = new ContaCorrente();
		
		while(continuar)
		{
			op = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma das opções abaixo para continuar! \n"
					+ "1 - Abertura de conta. \n"
					+ "2 - Realizar um depósito. \n"
					+ "3 - Realizar um saque. \n"
					+ "4 - Realizar transferência. \n"
					+ "5 - Consultar saldo. \n"
					+ "6 - Encerrar conta. \n"
					+ "0 - Finalizar operação. \n"
					+ "Digite a opção desejada: "
					,"MENU BANCÁRIO:", JOptionPane.QUESTION_MESSAGE ));
			
			switch (op) 
			{
				case 0:
					JOptionPane.showMessageDialog(null, "Obrigado por testar meu algoritmo!", 
							"FINALIZAR OPERAÇÃO", JOptionPane.CLOSED_OPTION);
					continuar = false;
					break;
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				default:
					break;
			}
		}
	}

}
