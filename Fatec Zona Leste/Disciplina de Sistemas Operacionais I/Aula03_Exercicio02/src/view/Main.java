package view;

import java.util.Scanner;

import controller.KillController;

public class Main {
	static int op;
	static String systemOP, process;
	
	public static void main(String[] args) 
	{
		System.out.println("Seja Bem vindo ao exercício 2!!\n\nVou listar algumas opções para seguirmos com a aplicação.\n\nSelecione a opção desejada:");
		menu();
		
	}
	
	public static void menu()
	{
		Scanner ler = new Scanner(System.in);
		
		
		System.out.print("1 - Listar Sistema Operacional.\n"
				+ 		 "2 - Listar Processos do Sistema.\n"
				+ 		 "3 - Finalizar Processo por PID.\n"
				+ 		 "4 - Finalizar Processo por Nome.\n"
				+ 		 "0 - Encerrar Programa.\n");
		do 
		{
			System.out.print("Favor Digitar a opção desejada: ");
			op = ler.nextInt();
			
			if (op > 4) 
			{
				System.out.print("\n\nOpção inválida!\n\n\n");
			}
		} 
		while (op > 4);
		
		switch (op) 
		{
			case 1:
				verificaSO();
				break;
			case 2:
				listandoProcessos();		
				break;
			case 3:
				matandoProcID();
				break;
			case 4:
				matandoProcNome();
				break;
	
			default:
				System.out.println("\n\nObrigado por visitar minha atividade!");
				break;
		}

		ler.close();
	}
	
	static void verificaSO() 
	{
		KillController infoSO = new KillController();
		System.out.print("\n\nCerto verificando Sistema Operacional");
		for (int i = 0; i < 5 ; i++) 
		{
			System.out.print(".");
			try {
				Thread.sleep(750);
			} catch (Exception e) 
			{
				
			}
		}
		System.out.print("\n\n");
		systemOP = infoSO.infoSO();
		System.out.println("\n\nSistema Operacional Atual: " + systemOP +".\n\n ");
		menu();
	}
	
	static void listandoProcessos()
	{
		KillController listaProc = new KillController();
		System.out.print("\n\n\nCerto agora vou listar as tarefas");

		for (int i = 0; i < 5 ; i++) 
		{
			System.out.print(".");
			try {
				Thread.sleep(750);
				System.out.print(".");
			} catch (Exception e) 
			{
			}
		}
		System.out.println("\n\n");
		listaProc.listaProcessos(systemOP);
		System.out.println("\n\n");
		menu();
		
	}

	static void matandoProcID()
	{
		Scanner ler = new Scanner(System.in);
		KillController mataPID = new KillController();
		System.out.print("\n\n\nMe informe o \"PROCESS ID\" da tarefa a ser finalizada: ");
		process = ler.nextLine();
		
		for (int i = 0; i < 5 ; i++) 
		{
			System.out.print(".");
			try 
			{
				Thread.sleep(750);
				System.out.print(".");
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("\n\n");
		mataPID.mataPid(process, systemOP);
		menu();
		
		ler.close();
	}
	
	static void matandoProcNome()
	{
		Scanner ler = new Scanner(System.in);
		KillController mataNome = new KillController();
		System.out.print("\n\n\nMe informe \"NOME DO PROCESSO\" ID da tarefa a ser finalizada: ");
		process = ler.nextLine();
		
		for (int i = 0; i < 5 ; i++) 
		{
			System.out.print(".");
			try 
			{
				Thread.sleep(750);
				System.out.print(".");
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("\n\n");
		mataNome.mataNome(process, systemOP);
		menu();

		ler.close();
	}
	
}
