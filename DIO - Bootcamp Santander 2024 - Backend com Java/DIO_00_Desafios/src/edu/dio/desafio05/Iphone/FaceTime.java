package edu.dio.desafio05.Iphone;

import java.util.Scanner;

public class FaceTime implements ControleMidia
{
	private int volume = 10;
	private boolean silenciado = false;
	private boolean emLigacao = false;
	private boolean correioDeVoz = false;
	private String numero;

	@Override
	public void Silenciar() 
	{
		this.silenciado = !silenciado; // usado para inverter a operação
		if (silenciado == true) 
		{
			System.out.println("Volume ativado");
		}
		else 
		{
			System.out.println("Volume desativado");
		}
	}

	@Override
	public void Aumentar() 
	{
		this.silenciado = false;
		if (volume == 16)
		{
			System.out.println("O volume está no máximo");
		}
		else 
		{
			this.volume += 1;
			System.out.println("Volume: " + volume);
		}
	}

	@Override
	public void Diminuir() 
	{
		this.volume -= 1;
		
		if (volume == 0) 
		{
			this.silenciado = true;
			System.out.println("Volume desativado");
		}
		else 
		{
			System.out.println("Volume: " + volume);	
		}
	}
	
	public void Ligar(Scanner ler)
	{
		ler.nextLine();
		System.out.print("Digite o número para onde se quer ligar: ");
		numero = ler.nextLine();
		
		System.out.print("\nDiscando para " + numero);
		this.setEmLigacao(true);
		for (int i = 0; i < 6; i++) 
		{
			try {
				Thread.sleep(1000);
				System.out.print(".");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("\nO telefone chamado encontra-se desligado ou fora de área.");
	}
	
	public void CorreioDeVoz()
	{
		this.setCorreioDeVoz(true);
		
		System.out.print("\nReproduzindo correio de voz");
		
		for (int i = 0; i < 6; i++) 
		{
			try {
				Thread.sleep(1000);
				System.out.print(".");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.print(" Fim da mensagem.\n");
		
		this.setCorreioDeVoz(false);
	}
	
	public void EncerrarChamada()
	{
		this.setEmLigacao(false);
		System.out.println("\nChamada Encerrada!");
	}
	
	public void AtenderChamada()
	{
		this.setEmLigacao(true);
		System.out.println("\nChamada Atendida! Em ligação.");
	}

	
	// Métodos Getters e Setters
	public boolean isEmLigacao() {
		return emLigacao;
	}

	public void setEmLigacao(boolean emLigacao) {
		this.emLigacao = emLigacao;
	}

	public boolean isCorreioDeVoz() {
		return correioDeVoz;
	}

	public void setCorreioDeVoz(boolean correioDeVoz) {
		this.correioDeVoz = correioDeVoz;
	}
}
