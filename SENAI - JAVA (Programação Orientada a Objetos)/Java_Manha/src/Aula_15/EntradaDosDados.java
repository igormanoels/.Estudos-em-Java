package Aula_15;

import java.util.Scanner;

public class EntradaDosDados {
	private String operador;
	private double valor1, valor2;
	
// ENTRADA DO OPERADOR
	public void setOperador(){
		Scanner ler = new Scanner(System.in);
		this.operador = ler.nextLine();
		ler.close();
	}
	
	public String getOperador() { 
		return operador;
	}

// ENTRADA DO VALOR UM
	public void setRecValor1() {
		Scanner ler = new Scanner(System.in);
		this.valor1 = ler.nextDouble();
		ler.close();
	}

	public double getRecValor1() {
		return valor1;
	}
	
// ENTRADA DO VALOR DOIS
	public void setRecValor2() {
		Scanner ler = new Scanner(System.in);
		this.valor2 = ler.nextDouble();
		ler.close();
	}

	public double getRecValor2() {
		return valor2;
	}	
}
