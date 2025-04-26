package com.dio.inversaoDeControle;

public class EnviarEmails {

	
	public EnviarEmails(String...str) {
		
	}
	
	public static EnviarEmails obterDados() {
		return new EnviarEmails("stmp", "contato@email.com", "senha");
	}
	
	public void retornar(String msg) {
		System.out.println("Email enviado");
	}
	
	
	
}
