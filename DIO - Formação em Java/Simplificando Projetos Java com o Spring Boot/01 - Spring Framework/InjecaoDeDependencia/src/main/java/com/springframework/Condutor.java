package com.springframework;

import org.springframework.beans.factory.annotation.Autowired;

public class Condutor {

	public static void main(String[] args) {
		Condutor c = new Condutor(new Carro());		
		c.automovel();
		
		
		Condutor c2 = new Condutor(new Moto());		
		c2.automovel();

	}
	
	@Autowired
	private Veiculo veiculo;
	
	public Condutor(Veiculo obj) {
		this.veiculo = obj;
	}	
	
	public void automovel() {
		veiculo.acao();
	}
}
