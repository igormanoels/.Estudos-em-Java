package projetos.K_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Principal 
{
	public static void main(String[] args) 
	{
		Queue<Carro> carros = new LinkedList<>(); // É uma estrutura de fila
		
		carros.add(new Carro("Fiat"));
		carros.add(new Carro("Chevrolet"));
		carros.add(new Carro("BMW"));
		carros.add(new Carro("Mazda"));
	
		System.out.println(carros);

		System.out.println(carros.add(new Carro("Ford"))); // retorna true se conseguiu
		System.out.println(carros); // todo novo valor, vai pro final da fila
		
		System.out.println(carros.offer(new Carro("Renout"))); // retorna true se conseguiu
		System.out.println(carros);
		
		System.out.println(carros.peek()); // retorna o primeiro carro da fila, se vazia retorna nulo 
		System.out.println(carros);
		
		System.out.println(carros.poll()); // retorna o primeiro elemento da fila removendo ele
		System.out.println(carros);

		System.out.println(carros.isEmpty()); // retorna se a fila está vazia
		
		System.out.println(carros.size()); // retorna o tamanho da fila
	}
}
