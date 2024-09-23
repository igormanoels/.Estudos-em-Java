package exercicios.exercicio_12;

public class Dinossauro {
	private int energia;
	private int velocidade;
	private int temperatura;
	private int humor;
	
	public Dinossauro() {
		this.energia = gerarAtributo();
		this.velocidade = gerarAtributo();
		this.temperatura = gerarAtributo();
		this.humor = gerarAtributo();
	}
	
	public void pular() {
		this.energia -= 3;
		this.velocidade -= 3;
		this.humor += 2;
		System.out.print("\nSkeep está pulando");
		animacao();
		System.out.println("\nParou de pular!\n");

	}
	
	public void correr() {
		this.energia -= 8;
		this.velocidade -= 4;
		this.humor += 5;
		System.out.print("\nSkeep está correndo");
		animacao();
		System.out.println("\nParou de correr!\n");
	}
	
	public void comer()	{
		this.energia += 7;
		this.velocidade -= 3;
		this.humor += 5;
		System.out.print("\nSkeep está comendo");
		animacao();
		System.out.println("\nTerminou de comer!\n");
	}
	
	public void cantar() {
		this.energia -= 2;
		this.humor += 1;
		System.out.print("\nSkeep está cantando");
		animacao();
		System.out.println("\nParou de cantar!\n");

	}
	
	public void tomarSol() {
		this.velocidade += 5;
		this.humor += 2;
		this.temperatura += 8;
		System.out.print("\nSkeep está tomando sol");
		animacao();
		System.out.println("\nParou de tomar sol!\n");
	}
	
	public void ficarNaSombra() {
		this.energia += 5;
		this.humor -= 6;
		this.temperatura -= 7;
		System.out.print("\nSkeep está descansando na sombra");
		animacao();
		System.out.println("\nSaiu da sombra!\n");

	}
	
	private void animacao() {
		try {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(1000);
				System.out.print(".");
			}
		} catch (Exception e) {}
	}
	
	private int gerarAtributo() {
		int atributo = (int) Math.round(Math.random() * 50) + 5;
		return atributo;
	}
	
	public int getEnergia() {
		return energia;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public int getTemperatura() {
		return temperatura;
	}
	
	public int getHumor() {
		return humor;
	}
}
