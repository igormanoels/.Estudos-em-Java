package edu.dio.aula06Encapsulamento;

public class Carro 
{
	private String chassi;
	
	public String getChassi() {
		return chassi;
	}
	
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	
	/*
	 *  O Conceito de Encapsulamento diz que nem todos os serviços precisam ser 
	 *  assinados/ visiveis para todos os métodos
	 */
	public void ligarCarro(boolean estado)
	{
		if (estado == true) 
		{
			verificarCombustivel();
			VerificarCambio();
			System.out.println("Carro Ligado!");
		} 
		else 
		{
			System.out.println("\nCarro Desligado");
		}
	}

	private static void VerificarCambio() 
	{
		System.out.println("\nCombustível OK");
		
	}

	private static void verificarCombustivel() 
	{
		System.out.println("Cambio em P");
		
	}
}
