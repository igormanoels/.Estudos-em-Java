package collections.A_Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class B_Ordenacao 
{
	public static void main(String[] args) 
	{
		List<Gato> gatos = new ArrayList<>() {{
			add(new Gato("Leon",4 , "preto"));
			add(new Gato("Cleitu",2 , "branco"));
		}};
		
		gatos.add(new Gato("Zembu",1 , "marrom"));
	
		System.out.println(gatos); // Ordem de inserção
		
		
		Collections.shuffle(gatos); // Desordena os itens
		System.out.println(gatos);
		
		Collections.sort(gatos); // Compara e ordena, a partir da implementação Comparable
		System.out.println(gatos);
		
		Collections.sort(gatos, new ComparatorIdade());
		// outra forma		gatos.sort(new ComparatorIdade());
		System.out.println(gatos); // Compara e ordena, a partir da implementação do Comparator
		
		
		Collections.sort(gatos, new ComparatorCor());
		// outra forma		gatos.sort(new ComparatorCor());
		System.out.println(gatos);
		
		
		Collections.sort(gatos, new ComparatorNomeCorIdade());
		System.out.println(gatos);
		
	}
}


class Gato implements Comparable<Gato>
{
	private String nome;
	private Integer idade;
	private String cor;
	
	public Gato(String nome, Integer idade, String cor) 
	{
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public String toString() 
	{	
		return nome;
	}

	@Override
	public int compareTo(Gato o) 
	{
		return this.getNome().compareToIgnoreCase(o.getNome());
	}
	
}


class ComparatorIdade implements Comparator<Gato>
{
	@Override
	public int compare(Gato o1, Gato o2) 
	{
		// TODO Auto-generated method stub
		return Integer.compare(o1.getIdade(), o2.getIdade());
	}
}


class ComparatorCor implements Comparator<Gato>
{
	@Override
	public int compare(Gato o1, Gato o2) 
	{
		// TODO Auto-generated method stub
		return o1.getCor().compareToIgnoreCase(o2.getCor());
	}
}


class ComparatorNomeCorIdade implements Comparator<Gato>
{
	@Override
	public int compare(Gato o1, Gato o2) 
	{
		int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
		if (nome != 0) return nome;
		
		int cor = o1.getCor().compareToIgnoreCase(o2.getCor());
		if (cor != 0) return cor;
		
		return Integer.compare(o1.getIdade(), o2.getIdade());
		
	}
}