package edu.dio.desafio06.Banco;

import javax.swing.JOptionPane;

public class Principal 
{
	static int op;
	static boolean continuar = true;
	static String nome, cpf, cnpj, rua, bairro, estado, uf;
	static int numero;
	
	public static void main(String[] args)
	{
	//	Conta cc = new ContaCorrente();
		Banco banco = new Banco();
		
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
					+ "Digite a opção desejada: ",
					"MENU BANCÁRIO:", JOptionPane.QUESTION_MESSAGE ));
			
			switch (op) 
			{
				case 0:
					JOptionPane.showMessageDialog(null, "Obrigado por testar meu algoritmo!", 
							"FINALIZAR OPERAÇÃO", JOptionPane.CLOSED_OPTION);
					continuar = false;
					break;
				case 1:
					op = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual tipo de conta?\n"
							+ "1 - Pessoa Física.\n"
							+ "2 - Pessoa Jurídica.\n"
							+ "0 - Cancelar operação.\n",
							"ABERTURA DE CONTA:", JOptionPane.QUESTION_MESSAGE));
					switch (op) 
					{
						case 0:
							JOptionPane.showMessageDialog(null, "Operação cancelada com sucesso!", 
									"ABERTURA DE CONTA:", JOptionPane.CLOSED_OPTION);
							break;
						case 1:
							leituraDados();
							banco.abrirContaPF(nome, cpf, rua, numero, bairro, estado, uf);
							break;
						case 2:
							leituraDados();
							banco.abrirContaPF(nome, cnpj, rua, numero, bairro, estado, uf);
							break;
						default:
							JOptionPane.showMessageDialog(null, "Você será direcionado de volta ao menu inicial!", 
									"OPÇÃO INVÁLIDA:", JOptionPane.ERROR_MESSAGE);
							break;
					}
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
					op = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual tipo de conta?\n"
							+ "1 - Pessoa Física.\n"
							+ "2 - Pessoa Jurídica.\n"
							+ "0 - Cancelar operação.\n",
							"ABERTURA DE CONTA:", JOptionPane.QUESTION_MESSAGE));
					switch (op) 
					{
						case 0:
							JOptionPane.showMessageDialog(null, "Operação cancelada com sucesso!", 
									"ABERTURA DE CONTA:", JOptionPane.CLOSED_OPTION);
							break;
						case 1:
							lerPFouPJ();
							banco.encerrarContaPF(cpf);
							break;
						case 2:
							lerPFouPJ();
							banco.encerrarContaPJ(cnpj);
							break;
						default:
							JOptionPane.showMessageDialog(null, "Você será direcionado de volta ao menu inicial!", 
									"OPÇÃO INVÁLIDA:", JOptionPane.ERROR_MESSAGE);
							break;
					}
					break;
				default:
					JOptionPane.showMessageDialog(null, "Você será direcionado de volta ao menu inicial!", 
							"OPÇÃO INVÁLIDA:", JOptionPane.ERROR_MESSAGE);
					break;
			}
		}
			
	}
	
	
	// MÉTODOS PARA LEITURA DOS DADOS DOS CLIENTES
	static void leituraDados()
	{
		nome = JOptionPane.showInputDialog(null, "Insira o NOME do cliente:",
				"CADASTRAR CLIENTE:", JOptionPane.INFORMATION_MESSAGE);
		
		lerPFouPJ();
		
		rua = JOptionPane.showInputDialog(null, "Insira a RUA onde reside o cliente:",
				"CADASTRAR CLIENTE:", JOptionPane.INFORMATION_MESSAGE);
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o NÚMERO da rua:",
				"CADASTRAR CLIENTE:", JOptionPane.INFORMATION_MESSAGE));
		
		bairro = JOptionPane.showInputDialog(null, "Insira o BAIRRO onde reside o cliente:",
				"CADASTRAR CLIENTE:", JOptionPane.INFORMATION_MESSAGE);
		
		estado = JOptionPane.showInputDialog(null, "Insira o ESTADO onde reside o clinte:",
				"CADASTRAR CLIENTE:", JOptionPane.INFORMATION_MESSAGE);
		
		uf = JOptionPane.showInputDialog(null, "Insira a sigla UF do estado0:",
				"CADASTRAR CLIENTE:", JOptionPane.INFORMATION_MESSAGE);		
	}
	
	static void lerPFouPJ()
	{
		if (op == 1) 
		{
			cpf = JOptionPane.showInputDialog(null, "Insira o CPF do cliente:",
					"CADASTRAR CLIENTE:", JOptionPane.INFORMATION_MESSAGE);
		} 
		else 
		{
			cnpj = JOptionPane.showInputDialog(null, "Insira o CNPJ do cliente:",
					"CADASTRAR CLIENTE:", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
