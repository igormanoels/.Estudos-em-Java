package exercicios;

/*
 * Ex05 - Criação de Classes
 * 
 * Instruções: A partir de objetos comuns, crie 3 classes, abstraindo ao menos 
 * 5 características e 3 comportamentos para cada uma. Crie o código em Java para estas classes
 */
public class Exercicio005 
{
	public static void main(String[] args) 
	{
		Pessoa pessoa = new Pessoa();
		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();
		
		
		pessoa.nome = "Igor Manoel";
		pessoa.altura = 1.55f;
		pessoa.idade = 49;
		pessoa.peso = 500.5f;
		
		pessoa.acordar();
		System.out.println("Nome da pessoa: " +  pessoa.nome);
		
		
		cachorro.nome = "fell";
		cachorro.acordar();
		cachorro.caminhar();
		cachorro.caminhar();
		cachorro.caminhar();
		cachorro.caminhar();
		cachorro.caminhar();
		cachorro.dormir();
		
		
		gato.nome = "Tom";
		System.out.println("\nNome do gato: " + gato.nome);
		
	}
}

class Pessoa
{
	String nome;
	int idade;
	float peso;
	float altura;
	boolean acordado;
	
	public void acordar()
	{
		acordado = true;
		System.out.println("\nA pessoa acordou!");
	}
	
	public void dormir()
	{
		acordado = false;
		System.out.println("A pessoa foi dormir!");
	}
	
	public void caminhar()
	{
		System.out.println("A pessoa está caminhando.");
	}

}

class Cachorro
{
	String nome;
	int idade;
	float peso;
	float altura;
	boolean acordado = false;
	
	public void acordar()
	{
		acordado = true;
		System.out.println("\nO cachorro acordou!");
	}
	
	public void dormir()
	{
		acordado = false;
		System.out.println("O cachorro foi dormir!");
	}
	
	public void caminhar()
	{
		System.out.println("O cachorro está caminhando.");
	}
	
}

class Gato
{
	String nome;
	int idade;
	float peso;
	float altura;
	boolean acordado = false;
	
	public void acordar()
	{
		acordado = true;
		System.out.println("\nO gato acordou!");
	}
	
	public void dormir()
	{
		acordado = false;
		System.out.println("O gato foi dormir!");
	}
	public void caminhar()
	{
		System.out.println("O gato está caminhando.");
	}
	
}