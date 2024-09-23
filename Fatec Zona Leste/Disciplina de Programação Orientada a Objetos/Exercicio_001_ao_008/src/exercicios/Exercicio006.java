package exercicios;

/*
 * Ex06 - Criar instâncias
 * 
 * Instruções
 * A partir de objetos comuns, crie 3 classes, abstraindo ao menos 5 características e 3 comportamentos para cada uma.
 * Crie o código em Java para estas classes
 * Com base nas classes criadas no exercício anterior, instancie 2 objetos para cada classe, 
 * e escreva códigos para modificar suas características e executar seus comportamentos.
 */
public class Exercicio006 
{
	public static void main(String[] args) 
	{
		Celular motog5 = new Celular();
		motog5.ligar();
		for (int i = 0; i < 6; i++) motog5.usarAparelho();
		motog5.carregar();
		motog5.desligar();
		
		
		
		Computador pc = new Computador();
		pc.ligar();
		pc.usar();
		pc.atualizar();
		pc.desligar();
		
		
		
		Tablet tab= new Tablet();
		tab.ligar();
		for (int i = 0; i < 20; i++) tab.usarAparelho();
		tab.carregar();
		tab.desligar();
	}
}

class Celular
{
	String modelo = "Moto G5";
	String resolucao = "360x800";
	int armazenamento = 8192;
	int bateria = 100;
	boolean ligado = false;
	
	public void ligar()
	{
		if (ligado == false) 
		{ 
			ligado = true;
			System.out.println("Hello Moto!");
		}
		else
		{
			System.out.println("O aparelho já está ligado");
		}
	}
	
	public void usarAparelho()
	{
		if(ligado != false)
		{
			bateria -= 5;
			System.out.println("O Celular está em uso.");
		}
		else 
		{
			ligar();
		}	
	}
	
	public void carregar()
	{
		while(bateria < 100)
		{
			bateria += 5;
			System.out.println("Carregando: " + bateria + "%...");
		}
	}
	
	public void desligar()
	{
		if (ligado == true)
		{
			ligado = false;
			System.out.println("Desligando...");
		}
		else
		{
			System.out.println("O aparelho já está desligado");
		}	
	}
}

class Computador
{
	String processador = "Intel I7";
	String resolucao = "1920x1080";
	int memoria = 16384;
	int armazenamento = 3072000;
	boolean ligado = false;
	
	public void ligar()
	{
		if (ligado == false) 
		{ 
			memoria -= 2048;
			ligado = true;
			System.out.println("\nO computador ligou, status - Memoria: " + memoria + ", armazenamento: " + armazenamento);
		}
		else
		{
			desligar();
		}
	}
	
	public void usar()
	{
		if(ligado != false)
		{
			memoria -= 512;
			armazenamento -= 128;
			System.out.println("O PC está em uso.");
		}
		else 
		{
			ligar();
		}	
	}
	
	public void atualizar()
	{
		for (int i = 32; i < 1024; i+=32) 
		{
			armazenamento -= i;
			System.out.println("Instalando: " + armazenamento);
		}
	}
	
	public void desligar()
	{
		if (ligado == true)
		{
			ligado = false;
			System.out.println("Desligando...");
		}
		else
		{
			ligar();
		}	
	}
	
}

class Tablet
{
	String modelo = "Moto G5";
	String resolucao = "360x800";
	int armazenamento = 8192;
	int bateria = 100;
	boolean ligado = false;
	
	public void ligar()
	{
		if (ligado == false) 
		{ 
			ligado = true;
			System.out.println("\nGalaxy TAB!");
		}
		else
		{
			System.out.println("O aparelho já está ligado");
		}
	}
	
	public void usarAparelho()
	{
		if(ligado != false)
		{
			bateria -= 5;
			if(bateria == 0)
			{
				desligar();
			}
			else 
			{
				System.out.println("O tablet está em uso.");
			}			
		}
		else 
		{
			ligar();
		}	
	}
	
	public void carregar()
	{
		while(bateria < 100)
		{
			bateria += 5;
			System.out.println("Carregando: " + bateria + "%...");
		}
	}
	
	public void desligar()
	{
		if (ligado == true)
		{
			ligado = false;
			System.out.println("Desligando...");
		}	
	}

	
}