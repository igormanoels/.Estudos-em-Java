package introducao.M_Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Principal 
{
	public static void main(String[] args) 
	{
		Set<Carro> carros = new HashSet<>();
		
		carros.add(new Carro("Fiat"));
		carros.add(new Carro("Chevrolet"));
		carros.add(new Carro("BMW"));
		carros.add(new Carro("Mazda"));
	
		System.out.println(carros);
		
		
		
		// Implementa atravez de Comparable, a ordenação dos dados pelo comprimento da string
		Set<Carro> treeCarros = new TreeSet<>(); 
		
		treeCarros.add(new Carro("Fiat"));
		treeCarros.add(new Carro("Chevrolet"));
		treeCarros.add(new Carro("BMW"));
		treeCarros.add(new Carro("Mazda"));
	
		System.out.println(treeCarros);
		

		
	}
}
