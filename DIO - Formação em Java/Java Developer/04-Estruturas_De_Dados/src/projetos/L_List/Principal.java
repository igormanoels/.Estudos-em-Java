package projetos.L_List;

import java.util.ArrayList;
import java.util.List;

public class Principal 
{
	public static void main(String[] args) 
	{
		List<Carro> carros = new ArrayList<>(); // É uma estrutura de fila
		
		carros.add(new Carro("Fiat"));
		carros.add(new Carro("Chevrolet"));
		carros.add(new Carro("BMW"));
		carros.add(new Carro("Mazda"));
	
		System.out.println(carros.contains(new Carro("Mercedes"))); // verifica se contem aquele objeto
		
		System.out.println(carros.get(2)); // retorna o indice da lista
		
		System.out.println(carros.indexOf(new Carro("Fiat"))); // retorna o indice do objeto, se retornar -1 é pq não encontrou
		
		System.out.println(carros.remove(2)); // remove o objeto da lista pelo indice
		System.out.println(carros);

		System.out.println(carros.add(new Carro("Ford"))); // retorna true se conseguiu
		System.out.println(carros); // todo novo valor, vai pro final da fila

		System.out.println(carros.isEmpty()); // retorna se a fila está vazia
		
		System.out.println(carros.size()); // retorna o tamanho da fila
	}
}
