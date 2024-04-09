package view;

import java.util.Scanner;

import controller.CarregaNotas;
import controller.Sacar;

public class Principal {

	public static void main (String [] args)
	{
		menu();
	}
	
	public static void menu ()
	{
		int op;
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
				System.out.print("Opção inválida!"
								 + "\nDigite novamente a opção desejada: ");
			} 
		} while (op > 3 && op != 9);
				
		switch (op) 
		{
			case 1:
				limparConsole();
				CarregaNotas carregar = new CarregaNotas();
				carregar.CarregaNotas();
				
				break;
			case 2:
				limparConsole();
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
							break; // Sai do loop
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
					limparConsole();
					
					Sacar saque = new Sacar(op);
					saque.SacarManual(op);
				}
				else
				{
					if (op == 2) 
					{
						
					} 
					else 
					{
						System.out.print("Opção inválida! Você será direcionado ao menu inicial");
						try 
						{
							Thread.sleep(1000);
							for (int i = 0; i < 3; i++) 
							{
								System.out.print(".");
								limparConsole();
								menu();
							}
						} catch (InterruptedException e) 
						{
							e.printStackTrace();
						} 
						
					}
				}
				
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
	
	public static void limparConsole()
	{
		for (int i = 0; i < 50; i++) 
		{
			System.out.println("");
		}
	}
	
}
