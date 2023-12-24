package Aula_15;

import java.util.Scanner;

public class EntradaDosDados {
	private String operador;
	private double valor1, valor2;
	
// ENTRADA DO OPERADOR
	public void setOperador(){
		this.operador = operador;
		Scanner ler = new Scanner(System.in);
		operador = ler.nextLine();
	}
	
	public String getOperador() { 
		return operador;
	}

// ENTRADA DO VALOR UM
	public void setRecValor1() {
		this.valor1 = valor1;
		Scanner ler = new Scanner(System.in);
		valor1 = ler.nextDouble();
		ler.close();
	}

	public double getRecValor1() {
		return valor1;
	}
	
// ENTRADA DO VALOR DOIS
	public void setRecValor2() {
		this.valor2 = valor2;
		Scanner ler = new Scanner(System.in);
		valor2 = ler.nextDouble();
		ler.close();
	}

	public double getRecValor2() {
		return valor2;
	}	
}
