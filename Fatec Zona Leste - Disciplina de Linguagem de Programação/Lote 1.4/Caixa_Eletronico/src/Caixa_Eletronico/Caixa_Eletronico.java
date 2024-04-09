package Caixa_Eletronico;

import java.util.Scanner;


public class Caixa_Eletronico {

	static int vetNotas[] = new int[6]; // Notas geradas
	static int caixa[] = new int[6]; // Valor disponível
	static int op;
	
	public static void main (String [] args)
	{
		menu();
	}
	
	public static void menu ()
	{
		Scanner ler = new Scanner(System.in);
		
		System.out.print("\n\t\tCaixa Eletrônico\t\t"
				+ "\n*************************************************"
				+ "\n*********\t1 - Carregar Notas \t*********"
				+ "\n*********\t2 - Retirar  Notas \t*********"
				+ "\n*********\t3 - Estatística    \t*********"
				+ "\n*********\t9 - Fim            \t*********"
				+ "\n*************************************************"
				+ "\nDigite a opção desejada: ");
		
		do
		{
			op = ler.nextInt();
			if (op > 3 && op != 9) 
			{
				System.out.print("Opção inválida!" + "\nDigite novamente a opção desejada: ");
			} 
		} while (op > 3 && op != 9);
				
		switch (op) 
		{
			case 1:
				limparConsole();
				CarregaNotas();
				break;
			case 2:
				limparConsole();
				sacarNotas();
				
				break;
			case 3:
				limparConsole();
				System.out.println("Teste 3");
				break;
			case 9:
				limparConsole();
				System.out.println("Teste 9");
				break;
		}
		
		ler.close();
		
	}
	
	/***************************************************************************************
	 * Procedure que realiza o carregamento das notas via função random:  
	 * Cada caixa eletrônico possui 4 caixa com até 2700 notas.
	 * Portanto, como são 6 tipos de notas cada uma pode conter 
	 * até 1800 notas de cada.
	 */
	public static void CarregaNotas()
	{
		System.out.print("Aguarde enquanto as notas são carregadas");
		
		for (int i = 0; i < 5; i++) 
		{
			try 
			{
				Thread.sleep(1000);
			} 
			catch (Exception e) {
				// Função para criar um Contador de 5 segundos
			}
			System.out.print(".");
		}
		
		System.out.println("\n\n");
		
		for (int i = 0; i < vetNotas.length; i++) 
		{			
			vetNotas[i] = (int) (Math.round(Math.random() * 1801));
			System.out.println("Quant. notas carregadas: " + vetNotas[i] + "\t");		
		}
		
		Caixa(vetNotas);
	}
	
	/****************************************************************************************************
	 * Procedure que gera os valores do caixa, ela trabalha em conjunto com a procedure CarregaNotas()
	 * 
	 */
	public static void Caixa(int[] quantNoCaixa)
	{
		int notas = 0;
		
		System.out.println("\n\n");
		
		for (int i = 0; i < caixa.length; i++) 
		{
			switch (i) 
			{
				case 0:
					notas = 5;
					break;
				case 1:
					notas = 10;
					break;
				case 2:
					notas = 20;
					break;
				case 3:
					notas = 50;
					break;
				case 4:
					notas = 100;
					break;
				case 5:
					notas = 200;
					break;
			}
			caixa[i] = quantNoCaixa[i] * notas;
			System.out.println("Notas de " + notas + " - Valor R$ " + caixa[i]);
		}
		
		limparConsole();
		System.out.print("As notas foram carregas com sucesso!\n"
				+ "Vocês está de volta ao menu inicial.\n\n\n");
		menu();
	}
	
	public static void sacarNotas()
	{
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Escolha uma das formas de saque." 
				   + "\n1- Saque Manual." 
				   + "\n2- Saque Simulado via Threads." 
				   + "\nDigite a opção desejada: ");
		op = ler.nextInt();
	
		if (op == 1) 
		{
			limparConsole();
			System.out.print("________________SAQUE________________" 
						   + "\n 1 - R$ 20,00\t\t 5 - R$ 200,00" 
						   + "\n 2 - R$ 40,00\t\t 6 - R$ 300,00" 
						   + "\n 3 - R$ 50,00\t\t 7 - R$ 500,00"
						   + "\n 4 - R$ 100,00\t\t 8 - R$ 1000,00" 
						   + "\n Digite a opção ou o valor desejado: ");
			
			do
			{
				op = ler.nextInt();
				
				if (op >= 1 && op <= 8) 
				{
					switch (op) {
					case 1:
						op = 20;
						break;
					case 2:
						op = 40;
						break;
					case 3:
						op = 50;
						break;
					case 4:
						op = 100;
						break;
					case 5:
						op = 200;
						break;
					case 6:
						op = 300;
						break;
					case 7:
						op = 500;
						break;
					case 8:
						op = 1000;
						break;
					}
					break; // Sair do loop
				} 
				else 
				{
					if (op % 5 != 0) 
					{
						limparConsole();
						System.out.print("\n\nValor Indisponível, favor informar valores a partir de R$ 5,00."
								+ "\nNotas disponíveis: 5 | 10 | 20 | 50 | 100 | 200"
								+ "\nDigite novamente o valor desejado: ");
					}
				}
				
			} while(op % 5 != 0);
			
			limparConsole();
			System.out.print("Processando");
			animaProc();		
			limparConsole();
			
			
			
			
		}
		else
		{
			if (op == 2) 
			{
				// Falta desenvolver método que executa os saques automaticamente via threads
				System.out.print("Opção em desenvolvimento, volte em breve para testar! \nVocê será redirecionado ao menu inicial");
				animaProc();
				limparConsole();
				menu();
			} 
			else 
			{
				System.out.print("Opção inválida! Você será redirecionado ao menu inicial");
				animaProc();
				limparConsole();
				menu();				
			}
		}
		
		ler.close();
	}
	
	/******************************************
	 * Procedure que limpa a tela do console
	 */
	public static void limparConsole()
	{
		for (int i = 0; i < 50; i++) 
		{
			System.out.println("");
		}
	}
	
	/****************************************************
	 * Procedure que contém a animação de carregamento
	 */
	public static void animaProc()
	{		
		for (int i = 0; i < 3; i++) 
		{
			try 
			{
				Thread.sleep(1000);
				System.out.print(".");
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		} 
	}
	
}

