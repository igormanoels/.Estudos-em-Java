package collections.exercicios;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/* Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e ide. Em seguida, 
 * crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
 * A. Ordem de Inserção
 * B. Ordem Natural (nome)
 * c. IDE
 * D. Ano de criação e nome
 * E. Nome, ano de criacao e IDE 
 */
public class Exercicio_004 
{
	public static void main(String[] args) 
	{
		Set<Linguagem> linguagens = new LinkedHashSet<>();
		
		linguagens.add(new Linguagem("Java", 1989,"Eclipse"));
		linguagens.add(new Linguagem("Python", 1995,"PyCharm"));
		linguagens.add(new Linguagem("JavaScript", 2003,"VsCode"));
		linguagens.add(new Linguagem("C#", 1999,"VsCode"));
		linguagens.add(new Linguagem("Ruby", 2003,"VsCode"));
		linguagens.add(new Linguagem("Assembly", 1984,"NotePad"));
		linguagens.add(new Linguagem("Angular", 2004,"VsCode"));
		
		
		System.out.println("Lista exibida em Ordem de inserção");
		for (Linguagem lg : linguagens) System.out.println(lg);
		
		
		System.out.println("\nLista exibita em Ordem Natural");
		Set<Linguagem> arvoreLinguagens = new TreeSet<>();
		arvoreLinguagens.addAll(linguagens);
		for(Linguagem lg: arvoreLinguagens) System.out.println(lg);
		
		
		System.out.println("\nLista exibita em Ordem de IDE");
		Set<Linguagem> linguagensIde = new TreeSet<>(new CompararIde());
		linguagensIde.addAll(linguagens);
		for(Linguagem lg: linguagensIde) System.out.println(lg);
		
		
		System.out.println("\nLista exibida por Ano e Nome");
		Set<Linguagem> linguagemAnoNome = new TreeSet<>(new CompararAnoNome());
		linguagemAnoNome.addAll(linguagens);
		for(Linguagem lg: linguagemAnoNome) System.out.println(lg);
	
		System.out.println("\nLista exibida por Nome, ano, Ide");
		Set<Linguagem> linguagemNomeAnoIde = new TreeSet<>(new CompararNomeAnoIde());
		linguagemNomeAnoIde.addAll(linguagens);
		for(Linguagem lg: linguagemNomeAnoIde) System.out.println(lg);
	}
}

class Linguagem implements Comparable<Linguagem>
{
	private String nome;
	private int ano;
	private String ide;
	
	public Linguagem(String nome,int ano, String ide) 
	{
		this.nome = nome;
		this.ano = ano;
		this.ide = ide;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getIde() {
		return ide;
	}

	public void setIde(String ide) {
		this.ide = ide;
	}
	
	@Override
	public String toString() 
	{
		return "Linguagem: " + nome + ", ano: " + ano + ", ide: " + ide;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ano, ide, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Linguagem other = (Linguagem) obj;
		return ano == other.ano && Objects.equals(ide, other.ide) && Objects.equals(nome, other.nome);
	}

	@Override
	public int compareTo(Linguagem o) 
	{	
		return this.nome.compareTo(o.getNome());
	}	
}

class CompararIde implements Comparator<Linguagem>
{
	@Override
	public int compare(Linguagem o1, Linguagem o2) 
	{
		int ide = o1.getIde().compareTo(o2.getIde());
		if (ide != 0) return ide;
		
		return o1.getNome().compareTo(o2.getNome());
	}
	
}

class CompararAnoNome implements Comparator<Linguagem>
{
	@Override
	public int compare(Linguagem o1, Linguagem o2) 
	{
		int ano = Integer.compare(o1.getAno(), o2.getAno());
		
		if(ano != 0) return ano;
		
		return o1.getNome().compareTo(o2.getNome());
	}	
}

class CompararNomeAnoIde implements Comparator<Linguagem>
{
	@Override
	public int compare(Linguagem o1, Linguagem o2) 
	{
		int nome = o1.getNome().compareTo(o2.getNome());
		if(nome != 0) return nome;
		
		int ano = Integer.compare(o1.getAno(), o2.getAno());
		if(ano != 0) return ano;
		
		return o1.getIde().compareTo(o2.getIde());
	}
	
}