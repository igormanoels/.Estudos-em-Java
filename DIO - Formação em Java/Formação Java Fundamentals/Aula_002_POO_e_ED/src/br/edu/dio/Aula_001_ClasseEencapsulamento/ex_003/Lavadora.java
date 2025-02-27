package br.edu.dio.Aula_001_ClasseEencapsulamento.ex_003;

public class Lavadora {

	private int nivelAgua;
	private int nivelShampoo;
	private boolean ocupado;
	private boolean limpeza;
	
	public Lavadora() {
		this.nivelAgua = 0;
		this.nivelShampoo = 0;
		this.ocupado = false;
		this.limpeza = true;
	}
	
	public void abastecerAgua() {
		if (this.nivelAgua <= 28) {
			this.nivelAgua +=2;
		} else {
			System.out.println("\nNão foi possivel abastecer.");
		}
		status();
	}
	
	public void abastecerShampoo() {
		if (this.nivelShampoo <= 28) {
			this.nivelShampoo += 2;
		} else {
			System.out.println("\nNão foi possivel abastecer.");
		}
		status();
	}
	
	public void nivelAgua() {
		System.out.printf("Nível atual da água: %d lts.");
	}
	
	public void nivelShampoo() {
		System.out.printf("Nível atual do shampoo: %d lts.");
	}
	
	public void verificarOcupacao() {
		var uso = ocupado ? "está": "não está";
		System.out.printf("\nA máquina %s ocupada", uso);
	}
	
	public void colocarPet() {
		if (limpeza) {	
			this.ocupado = true;
			System.out.println("O pet foi colocado na máquina.");
		} else {
			System.out.println("Primeiro limpe a máquina");
		}
	}
	
	public void retirarPet() {
		this.ocupado = false;
		System.out.println("O pet foi retirado da máquina.");
	}
	
	public void limpar() {
		this.nivelAgua -= 3;
		this.nivelShampoo -= 2;
		System.out.print("Iniciando limpeza da máquina");
		tempo();
		System.out.println("A máquina foi limpa");
	}
	
	public void darBanho() {
		this.nivelAgua -= 10;
		this.nivelShampoo -= 2;
		System.out.print("\nDando banho no pet");
		tempo();
		System.out.println("");
	}
	
	public void status() {
		var uso = ocupado ? "Sim": "Não";
		System.out.printf("\n********************************************"
						+ "\n*                 Status                   *"
						+ "\n* Shampoo: %dlts | Água: %dlts | Ocupada %s*"
						+ "\n********************************************\n"
						 , this.nivelShampoo, this.nivelAgua, uso);
	}
	
	public void tempo() {
		try {
			for (int i = 1; i <= 5 ; i++) {
				Thread.sleep(1000);
				System.out.print(".");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
