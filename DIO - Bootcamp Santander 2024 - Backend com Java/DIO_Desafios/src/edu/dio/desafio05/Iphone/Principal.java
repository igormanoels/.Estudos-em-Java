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
					switch (op) 
					{
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
					FaceTime faceTime = new FaceTime();
					System.out.print("\nMenu FaceTime\n"
							+ "1 - Ligar\n"
							+ "2 - Correio de Voz\n"
							+ "3 - Aumentar Volume\n"
							+ "4 - Diminuir Volume\n"
							+ "5 - Silenciar\n"
							+ "6 - Atender Chamada\n"
							+ "7 - Encerrar Chamada\n"
							+ "Digite a opção desejada: ");
					op = ler.nextInt();
					
					switch (op) 
					{
						case 1:
							faceTime.Ligar(ler);
							break;
						case 2:
							faceTime.CorreioDeVoz();
							break;
						case 3:
							faceTime.Aumentar();
							break;
						case 4:
							faceTime.Diminuir();
							break;
						case 5:
							faceTime.Silenciar();
							break;
						case 6:
							faceTime.AtenderChamada();
							break;
						case 7:
							faceTime.EncerrarChamada();
							break;
					}
					break;
				case 3:
					Safari safari = new Safari();
					System.out.print("\nMenu Safari\n"
							+ "1 - Digitar Site\n"
							+ "2 - Abrir uma nova aba\n"
							+ "3 - Atualizar Página\n"
							+ "4 - Fechar uma aba\n"
							+ "Digite a opção desejada: ");
					op = ler.nextInt();
					
					switch (op) 
					{
						case 1:
							safari.CarregarPagina();
							break;
						case 2:
							safari.NovaAba();
							break;
						case 3:
							safari.AtualizarPagina();
							break;
						case 4:
							safari.FecharAba();
							break;
					}
					break;
				case 4:
					System.out.print("Desligando Iphone");
					try {
						for (int i = 0; i < 5; i++) {
							Thread.sleep(1000);
							System.out.print(".");
						}
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					System.out.println(" Até logo!");
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
