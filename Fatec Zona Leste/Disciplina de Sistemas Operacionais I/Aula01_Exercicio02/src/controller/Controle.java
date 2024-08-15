package controller;

public class Controle {
		
	public int ContadorDePalavras (String texto) {
		int quant = 0;
		String[] vetPalavras = texto.split(";");
	
		for (String i: vetPalavras)
		{
			System.out.println(i);
			quant++;
		}
		return quant;
		
	}
	
}
