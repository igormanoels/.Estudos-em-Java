package Algoritmo_003;

import java.util.Scanner;

public class Trocar_Lampadas {

	public static void main(String[] args) {
		String resposta;
		
		System.out.println("Algoritmo para trocar uma lâmpada");
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("A lâmpada esta ao seu alcance?");
		resposta = ler.nextLine();
		
		if (resposta.equals("sim")) 
			{
				System.out.println("A lâmpada está quente?");
				resposta = ler.nextLine();
				if (resposta.equals("sim"))
					{
						System.out.println("Use um pano para retirar a lâmpada");
					}
					else
						{
							System.out.println("Retire a lâmpada");
						}
			}
			else 
				{
					System.out.println("Vá buscar uma escada!");
					System.out.println("Pegou uma escada?");
					resposta = ler.nextLine();
			
					if (resposta.equals("sim"))
						{
							System.out.println("Suba na escada e veja se a lâmpada está quente");
							System.out.println("A lâmpada está quente?");
							resposta = ler.nextLine();
							
							if (resposta.equals("sim"))
								{
									System.out.println("Use um pano para retirar a lâmpada");
								}
								else
									{
										System.out.println("Retire a lâmpada");
									}
						}
						else
							{
								System.out.println("Vá buscar a escada, e suba nela para alcançar a lâmpada");
								System.out.println("A lâmpada está quente?");
								resposta = ler.nextLine();
								
								if (resposta.equals("sim"))
									{
										System.out.println("Use um pano para retirar a lâmpada");
									}
									else
										{
											System.out.println("Retire a lâmpada");
										}
							}
				}
		System.out.println("Agora que retirou a lâmpada coloque a nova no lugar");
		ler.close();
	}
}
