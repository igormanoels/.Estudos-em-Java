package exercicios.exercicio_09;

public class Pessoa {
	
	private String nome;

	public Pessoa() {}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public void comer() {
		System.out.println("Está comendo!");
	}
	
	public void dormir() {
		System.out.println("Está dormindo");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Nome: " + nome;
	}
}
