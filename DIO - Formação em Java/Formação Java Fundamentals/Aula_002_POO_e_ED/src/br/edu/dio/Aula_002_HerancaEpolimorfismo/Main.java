package br.edu.dio.Aula_002_HerancaEpolimorfismo;

public class Main {
	
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("Julio");
		
		
		Vendedor vendedor = new Vendedor();
		vendedor.setNome("Julia");
	}
	
}
