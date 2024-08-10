package introducao.J_Stack;

import java.util.Stack;

public class Principal 
{
	public static void main(String[] args) 
	{
		Stack<Carro> carros = new Stack<>(); // É uma estrutura de pilha
		
		carros.add(new Carro("Fiat"));
		carros.add(new Carro("Chevrolet"));
		carros.add(new Carro("BMW"));
		carros.add(new Carro("Mazda"));
	
		System.out.println(carros);
		
		System.out.println(carros.pop()); // remove o último item do topo
		System.out.println(carros);
		
		System.out.println(carros.peek()); // mostra o valor do topo
		System.out.println(carros);
		
		System.out.println(carros.empty()); // false pq não está vazia
	}
}
