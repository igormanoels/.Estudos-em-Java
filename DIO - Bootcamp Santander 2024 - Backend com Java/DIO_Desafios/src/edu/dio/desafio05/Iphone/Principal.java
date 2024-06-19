package edu.dio.desafio05.Iphone;

import java.util.Scanner;

public class Principal 
{

	public static void main(String[] args) 
	{
		boolean ligado = false;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite:\n"
				+ "1 - Para Ligar\n"
				+ "2 - Para Manter Desligado\n"
				+ "Deseja ligar seu Iphone? ");
		int op = ler.nextInt();
		
		if (op == 1) 
		{
			ligado = true;
		}
		
		while (ligado) 
		{
			System.out.print("\nMenu\n"
					+ "1 - Itunes\n"
					+ "2 - FaceTime\n"
					+ "3 - Safari\n"
					+ "4 - Desligar\n"
					+ "Digite a opção desejada: ");
			op = ler.nextInt();
			
			switch (op) 
			{
				case 1:
					Itunes itunes = new Itunes();
					System.out.print("\nMenu Itunes\n"
							+ "1 - Tocar\n"
							+ "2 - Aumentar Volume\n"
							+ "3 - Diminuir Volume\n"
							+ "4 - Silenciar\n"
							+ "5 - Pausar\n"
							+ "6 - Trocar Música\n"
							+ "Digite a opção desejada: ");
					op = ler.nextInt();
					switch (op) {
						case 1:
							itunes.Tocar();
							break;
						case 2:
							itunes.Aumentar();
							break;
						case 3:
							itunes.Diminuir();
							break;
						case 4:
							itunes.Silenciar();
							break;
						case 5:
							itunes.Pausar();
							break;
						case 6:
							itunes.SelecionarMusica(ler);
							break;
					}
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
					System.out.print("Desligando Iphone");
					try {
						for (int i = 0; i < 3; i++) {
							Thread.sleep(1000);
							System.out.print(".");
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
					ligado = false;
					break;
	
				default:
					System.out.println("Opção Inválida, escolha um aplicativo existente!");
					break;
			}
		}
		
		
		ler.close();
	}

}
