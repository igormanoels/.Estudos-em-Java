package collections.C_Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class B_Ordenacao 
{
	public static void main(String[] args) 
	{
		Map<String, Livro> livros = new HashMap<>();
		
		livros.put("Tarciso", new Livro("Euzinho e você", 451));
		livros.put("Frank", new Livro("O poder do pensamentop", 92));
		livros.put("Gerson", new Livro("Pinóqui", 151));
	
	
		for(Map.Entry<String, Livro> entry: livros.entrySet())
		{
			System.out.println(entry);
		}
		
		System.out.println();

		
		Map<String, Livro> livros2 = new TreeMap<>(livros);
		for(Map.Entry<String, Livro> entry: livros2.entrySet())
		{
			System.out.println(entry);
		}

		System.out.println("\nOrdenado por número de páginas: ");

		Set<Map.Entry<String, Livro>> livros3 = new TreeSet<>(new ComparatorPaginas());
		livros3.addAll(livros.entrySet());
		for(Map.Entry<String, Livro> entry: livros3)
		{
			System.out.println(entry);
		}
		
		System.out.println("\nOrdenado por nome do autor: ");
		
		Set<Map.Entry<String, Livro>> livros4 = new TreeSet<>(new ComparatorNome());
		livros4.addAll(livros.entrySet());
		for(Map.Entry<String, Livro> entry: livros4)
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

class ComparatorPaginas implements Comparator<Map.Entry<String, Livro>>
{
	@Override
	public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) 
	{
		return Integer.compare(o1.getValue().getPaginas(), o2.getValue().getPaginas());
	}
}


class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
    }
}