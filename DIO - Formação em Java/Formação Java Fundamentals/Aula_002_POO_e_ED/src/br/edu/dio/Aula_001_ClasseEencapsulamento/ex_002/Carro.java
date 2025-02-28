package br.edu.dio.Aula_001_ClasseEencapsulamento.ex_002;

public class Carro {

	private boolean motor;
	private int velocidade;
	private int cambio;
	
	public Carro() {
		this.motor = false;
		this.velocidade = 0;
		this.cambio = 0;
	}
	
	public void ligarDesligar() {
		if (this.motor) {
			this.motor = false;
		} else {
			this.motor = true;
		}
		var status = this.motor == true ? "Ligado": "Desligado";
		System.out.printf("\n\nO motor está %s\n\n\n", status);
	}
	
	public void acelerar() {
		if (this.velocidade == 120) {
			System.out.println("O carro já atingiu a velocidade máxima!");
		} else if (this.cambio == 1 && this.velocidade < 20) {
			velocidade++;
		} else if (this.cambio == 2 && this.velocidade < 40) {
			velocidade++;
		} else if (this.cambio == 3 && this.velocidade < 60) {
			velocidade++;
		} else if (this.cambio == 4 && this.velocidade < 80) {
			velocidade++;
		} else if (this.cambio == 5 && this.velocidade < 100) {
			velocidade++;
		} else if (this.cambio == 6 && this.velocidade < 120) {
			velocidade++;
		} else {
			System.out.println("Não foi possível acelerar");
		}
		System.out.printf("Velocidade atual %dkm/h", this.velocidade);
	}
	
	public void freiar() {
		if (this.velocidade == 0) {
			System.out.println("O carro já está parado!");
		} else if (this.cambio == 1 && this.velocidade > 0 && this.velocidade < 20) {
			velocidade--;
		} else if (this.cambio == 2 && this.velocidade < 40) {
			velocidade--;
		} else if (this.cambio == 3 && this.velocidade < 60) {
			velocidade--;
		} else if (this.cambio == 4 && this.velocidade < 80) {
			velocidade--;
		} else if (this.cambio == 5 && this.velocidade < 100) {
			velocidade--;
		} else if (this.cambio == 6 && this.velocidade < 120) {
			velocidade--;
		} else {
			System.out.println("Não foi possível freiar");
		}
		System.out.printf("Velocidade atual %dkm/h", this.velocidade);
	}
	
	
	public void subirMarcha() {
		if (this.velocidade <= 20) {
			this.cambio++;
		} else if (this.velocidade >= 20 &&  this.velocidade < 40) {
			this.cambio++;
		} else if (this.velocidade >= 40 &&  this.velocidade < 60) {
			this.cambio++;
		} else if (this.velocidade >= 60 &&  this.velocidade < 80) {
			this.cambio++;
		} else if (this.velocidade >= 80 &&  this.velocidade < 100) {
			this.cambio++;
		} else if (this.velocidade >= 100) {
			this.cambio++;
		} else {
			System.out.println("Não foi possível trocar a marcha.");
		}
		System.out.println("Marcha atual: " + this.cambio);
	}
	
	public void descerMarcha() {
		if (this.velocidade == 0) {
			this.cambio = 0;
		} else if (this.velocidade <= 20) {
			this.cambio--;
		} else if (this.velocidade <= 40) {
			this.cambio--;
		} else if (this.velocidade <= 60) {
			this.cambio--;
		} else if (this.velocidade <= 80) {
			this.cambio--;
		} else if (this.velocidade <= 100) {
			this.cambio--;			
		} else {
			System.out.println("Não foi possível trocar a marcha.");
		}
		System.out.println("Marcha atual: " + this.cambio);
	}
	
	public void virarDireita() {
		if (this.velocidade <= 40) {
			System.out.println("O carro virou para a direita.");
		} else {
			System.out.println("Reduza a velocidade para fazer a curva com segurança.");
		}
	}
	
	public void virarEsquerda() {
		if (this.velocidade <= 40) {
			System.out.println("O carro virou para a esquerda.");
		} else {
			System.out.println("Reduza a velocidade para fazer a curva com segurança.");
		}
	}
}
