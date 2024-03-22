package view;

import java.util.Scanner;
import controller.CarregaNotas;

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
				System.out.println("Teste 2");
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
