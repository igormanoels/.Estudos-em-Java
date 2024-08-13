package collections.D_Stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;

public class A_Introducao 
{
	public static void main(String[] args) 
	{
		Map<String, Livro> livros = new HashMap<>();
		
		livros.put("Tarciso", new Livro("Euzinho e você", 451));
		livros.put("Frank", new Livro("O poder do pensamentop", 92));
		livros.put("Gerson", new Livro("Pinóqui", 151));
	
	
		// Usando Classe Anônima
		System.out.println("Ordenado por nome do autor: ");
		
		Set<Map.Entry<String, Livro>> livros4 = new TreeSet<>(new Comparator<Map.Entry<String, Livro>>() 
		{	
			public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) 
			{
				return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
			}
		});
		
		livros4.addAll(livros.entrySet());
		for(Map.Entry<String, Livro> entry: livros4)
		{
			System.out.println(entry);
		}
		
		
		System.out.println();
		
		
		// Usando Funcional Interface
		Set<Map.Entry<String, Livro>> livros5 = new TreeSet<>(Comparator.comparing(
				new Function<Map.Entry<String, Livro>, Integer>() 
				{
					@Override
					public Integer apply(Entry<String, Livro> t) 
					{
						// TODO Auto-generated method stub
						return t.getValue().getPaginas();
					}
				}));
		livros5.addAll(livros.entrySet());
		for(Map.Entry<String, Livro> entry: livros5)
		{
			System.out.println(entry);
		}
		
		
		System.out.println();

		
		// Usando Lambda
		Set<Map.Entry<String, Livro>> livros6 = new TreeSet<>(
				Comparator.comparing(t -> t.getValue().getPaginas()));
					
		
		livros6.addAll(livros.entrySet());
		for(Map.Entry<String, Livro> entry: livros6)
		{
			System.out.println(entry);
		}
		
	}
}

class Livro
{
	private String nome;
	private int paginas;
	
	public Livro(String nome, int paginas) 
	{
		this.nome = nome;
		this.paginas = paginas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, paginas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(nome, other.nome) && paginas == other.paginas;
	}
	
	@Override
	public String toString() 
	{
		return "Livro: " + nome + ", páginas: " + paginas;
	}
		
}