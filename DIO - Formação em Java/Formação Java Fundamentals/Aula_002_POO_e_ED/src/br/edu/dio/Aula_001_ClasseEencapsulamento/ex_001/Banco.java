package br.edu.dio.Aula_001_ClasseEencapsulamento.ex_001;

public class Banco {
	
	private Double saldo;
	private boolean primeiroDeposito;
	private Double chequeEspecial;
	private Double credito;
	
	public Banco() {
		this.saldo = 0.0d;
		this.credito = 0.0d;
		this.primeiroDeposito = true;
	}
	
	public void depositar(Double deposito) {
		if (primeiroDeposito) {
			this.chequeEspecial = deposito * 0.1;
		} 
		this.saldo += deposito;
	}
	
	public void sacar(Double saque) {
		if (this.saldo < saque) {
			if ((this.saldo + this.chequeEspecial) < saque) {
				System.out.println("Saldo + Cheque especial insuficiente. Realiza uma nova transação.");
			} else {
				saque = saque - this.saldo;
				this.credito = saque * 0.2;
				this.chequeEspecial -= saque;
				this.saldo = 0.0d;
				System.out.printf("Saque realizado com cheque especial, R$ %d", saque);
			}
		} else {
			this.saldo -= saque;
			System.out.printf("Saque realizado, R$ %d", saque);
		}
		
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo: R$ " + this.saldo);
	}
	
	public void consultarChequeEspecial() {
		System.out.printf("Limite do cheque especial .....R$ %d \n"
						+ "Crédito em aberto .............R$ %d");
	}
	
}
