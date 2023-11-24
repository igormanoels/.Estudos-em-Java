package Aula_14_POO;

public class Pessoa {
	String nome;
	String sexo;
	String cor;
	int idade;
	double altura;
	double peso;
	boolean dormindo;
	boolean acordado;
	
	public void falar(boolean a) {
		if ( a == true) {
			System.out.println("Posso falar");
		} else {
			System.out.println("Não posso falar");
		}
	}
	
	public void dormir(boolean a) {
		if ( a == false) {
			System.out.println("Estou acordado");
		} else {
			System.out.println("Estou dormindo");
		}
	}
	
	
}
