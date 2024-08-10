package collections.B_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class B_Ordenacao 
{
	public static void main(String[] args) 
	{
		Set<Pessoa> pessoas = new HashSet<>();
		
		pessoas.add(new Pessoa("Igor", "masculino", 29));
		pessoas.add(new Pessoa("Lucio", "masculino", 39));
		pessoas.add(new Pessoa("Marta", "feminino", 12));
		pessoas.add(new Pessoa("Georgia", "feminino", 49));
		pessoas.add(new Pessoa("Vera", "feminino", 99));
		
		System.out.println("Mantém os dados sem ordenação");
		for (Pessoa p : pessoas) System.out.println(p);
		
		
		System.out.println("\n");
		
		
		Set<Pessoa> pessoas1 = new LinkedHashSet<>();

		pessoas1.add(new Pessoa("Igor", "masculino", 29));
		pessoas1.add(new Pessoa("Lucio", "masculino", 39));
		pessoas1.add(new Pessoa("Marta", "feminino", 12));
		pessoas1.add(new Pessoa("Georgia", "feminino", 49));
		pessoas1.add(new Pessoa("Vera", "feminino", 99));
		System.out.println("Mantém os dados na ordem de inserção");
		for (Pessoa p : pessoas1) System.out.println(p);

		
		
		System.out.println("\n");
		
		
		
		Set<Pessoa> pessoas2 = new TreeSet<>();
		System.out.println("Mantém os dados na ordem de inserção");
		pessoas2.add(new Pessoa("Igor", "masculino", 29));
		pessoas2.add(new Pessoa("Lucio", "masculino", 39));
		pessoas2.add(new Pessoa("Marta", "feminino", 29));
		pessoas2.add(new Pessoa("Georgia", "feminino", 49));
		pessoas2.add(new Pessoa("Vera", "feminino", 99));
		
		for (Pessoa p : pessoas2) System.out.println(p);

	}
		
}

class Pessoa implements Comparable<Pessoa>
{
	private String nome;
	private String genero;
	private int idade;
	
	public Pessoa(String nome, String genero, int idade) 
	{
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(genero, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(genero, other.genero) && idade == other.idade && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", genero: "+ genero + ", idade: "+ idade;
	}

	@Override
	public int compareTo(Pessoa o) {
		int compararIdade =  Integer.compare(this.getIdade(), o.getIdade());
	
		if (compararIdade != 0) return compararIdade;
		
		// quando não cair no if, é o mesmo que colocar um else
		return this.getNome().compareTo(o.getNome());
	}
}
