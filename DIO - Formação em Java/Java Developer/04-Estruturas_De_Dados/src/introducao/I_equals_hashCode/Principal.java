package introducao.I_equals_hashCode;

import java.util.ArrayList;
import java.util.List;

public class Principal 
{
	public static void main(String[] args) 
	{
		List<Carro> carros = new ArrayList<>();
		
		carros.add(new Carro("Fiat"));
		carros.add(new Carro("Chevrolet"));
		carros.add(new Carro("BMW"));
		carros.add(new Carro("Mazda"));
	
		System.out.println(carros.contains("ford")); // não possui, usa equals e retorna false
		System.out.println(new Carro("Ford").hashCode()); // retorna a posição de memória do objeto
	}
}
