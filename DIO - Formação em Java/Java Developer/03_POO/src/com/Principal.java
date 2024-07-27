package com;

import javax.swing.JOptionPane;

import com.empresa.Empresa;

public class Principal 
{
	static String nome, documento, categoria, rua, bairro, complemento;
	static int quantidadeVendas;
	static Double remuneracao;
	static boolean continuar = true;
	static int op;
	
	public static void main(String[] args) 
	{
		Empresa empresa = new Empresa();
		
		while (continuar) 
		{
			op = Integer.parseInt(JOptionPane.showInputDialog(null, "0 - Encerrar.\n"
					+ "1 - Cadastrar Vendedor.\n"
					+ "2 - Cadastrar Operador de Caixa.\n"
					+ "3 - Cadastrar Gerente.\n"
					+ "4 - Gerar pagamento vendedor.\n"
					+ "5 - Gerar pagamento do gerente.\n"
					+ "6 - Imprimir pagamento do Vendedor.\n"
					+ "7 - Imprimir pagamento do Operador de caixa.\n"
					+ "8 - Imprimir pagamento do Gerente.\n", 
					"Selecione uma das opções abaixo: ", JOptionPane.INFORMATION_MESSAGE));
			
			switch (op) 
			{
				case 0:
					JOptionPane.showMessageDialog(null, "Obrigado por testar meu algoritmo!", "Encerrando programa:", JOptionPane.INFORMATION_MESSAGE);
					continuar = false;
					break;
				case 1:
					entradaDeDados();
					empresa.cadastrarVendedor(nome, documento, categoria, rua, bairro, complemento, remuneracao);
					break;
				case 2:
					entradaDeDados();
					empresa.cadastrarOperador(nome, documento, categoria, rua, bairro, complemento, remuneracao);
					break;
				case 3:
					entradaDeDados();
					empresa.cadastrarPessoaJuridica(nome, documento, categoria, rua, bairro, complemento, remuneracao);
					break;
				case 4:
					lerDocumentos();
					quantidadeVendas = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de vendas.", "LEITURA DE DADOS:", JOptionPane.INFORMATION_MESSAGE));
					empresa.gerarPagamentoVendedor(documento, quantidadeVendas);
					break;
				case 5:
					lerDocumentos();
					empresa.gerarPagamentoGerente(documento);
					break;
				case 6:
					lerDocumentos();
					empresa.consultarColaboradorPF(documento);
					break;
				case 7:
					lerDocumentos();
					empresa.consultarColaboradorPF(documento);
					break;
				case 8:
					lerDocumentos();
					empresa.consultarColaboradorPJ(documento);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Favor digitar uma opção do menu.", "Opção inválida:", JOptionPane.ERROR_MESSAGE);
					break;
			}
		}
		
	}
	
	
	public static void entradaDeDados()
	{
		nome = JOptionPane.showInputDialog(null, "Informe o nome do colaborador: ", "LEITURA DE DADOS:", JOptionPane.INFORMATION_MESSAGE);
		lerDocumentos();
		categoria = JOptionPane.showInputDialog(null, "Informe a categoria: ", "LEITURA DE DADOS:", JOptionPane.INFORMATION_MESSAGE);
		rua = JOptionPane.showInputDialog(null, "Informe a rua: ", "LEITURA DE DADOS:", JOptionPane.INFORMATION_MESSAGE);
		bairro = JOptionPane.showInputDialog(null, "Informe o bairro: ", "LEITURA DE DADOS:", JOptionPane.INFORMATION_MESSAGE);
		complemento = JOptionPane.showInputDialog(null, "Informe o complemento: ", "LEITURA DE DADOS:", JOptionPane.INFORMATION_MESSAGE);
		remuneracao = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salário: ", "LEITURA DE DADOS:", JOptionPane.INFORMATION_MESSAGE));
	}
	
	
	public static void lerDocumentos()
	{
		documento = JOptionPane.showInputDialog(null, "Informe o número do documento: ", "Leitura de Documento", JOptionPane.QUESTION_MESSAGE);
	}
}
