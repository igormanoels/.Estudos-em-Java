package edu.dio.desafio05.Iphone;

import java.util.Scanner;

public class Itunes implements ControleMidia
{
	private int volume = 10;
	private boolean silenciado = false;
	private boolean reproduzindo = false;
	private String musica = "XYZ";
	
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

	public void Aumentar() 
	{
		this.setSilenciado(false);
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

	public void Tocar() 
	{
		if (this.reproduzindo == false) 
		{
			this.setReproduzindo(true);
			System.out.println("Tocando música: " + musica + " - Volume: " + volume);
		}
		else 
		{
            System.out.println("A música já está tocando");
        }
	}

	public void Diminuir() 
	{
		this.volume -= 1;
		
		if (volume == 0) 
		{
			this.setSilenciado(true);
			System.out.println("Volume desativado");
		}
		else 
		{
			System.out.println("Volume: " + volume);	
		}
	}
	
	public void Pausar()
	{
		this.setReproduzindo(false);
		System.out.println("A música foi pausada");
	}
	
	public void SelecionarMusica(Scanner ler)
	{
		ler.nextLine();
		System.out.println("Digite o nome da música: ");
		this.musica = ler.nextLine();
		System.out.println("Tocando música: " + musica);
	}

	
	// Métodos Getters e Setters
	public boolean isSilenciado() 
	{
		return silenciado;
	}

	public void setSilenciado(boolean silenciado) 
	{
		this.silenciado = silenciado;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) 
	{
		this.reproduzindo = reproduzindo;
	}
	
	public int getVolume() 
	{
		return volume;
	}
	
	public void setVolume(int volume) 
	{
		this.volume = volume;
	}
	
}
