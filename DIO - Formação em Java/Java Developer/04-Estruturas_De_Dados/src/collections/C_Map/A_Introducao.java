package collections.C_Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class A_Introducao 
{
	public static void main(String[] args) 
	{
		Map<String, Double> carrosPopulares = new HashMap<>(){{
			put("Gol",14.4);
			put("Celta",13.8);
			put("Mercedes",13.8);
			put("Volvo",8.2);
			put("Kia",11.1);
		}};
		
		System.out.println(carrosPopulares);
		
		
		carrosPopulares.put("Gol", 12.9);
		System.out.println("\nAltera o valor do Gol: "+  carrosPopulares);
		
		
		System.out.println("\nVerifica se a chave existe: " + carrosPopulares.containsKey("Uno"));
		 
		System.out.println("\nPega o conteúdo da chave \"Celta\": " + carrosPopulares.get("Celta"));
		
		System.out.println("\nExibe o valor da chave: " + carrosPopulares.keySet()); // Retorna um Set
		
		System.out.println("\nExibe os valores das chaves" + carrosPopulares.values()); // Retorna um Collections

		var maisEficiente = Collections.max(carrosPopulares.values());
		System.out.println("\nExibe o maior valor das chaves: " + maisEficiente);
		
		
		
		for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) 
		{
			if(entry.getValue().equals(maisEficiente)) 
			{
				System.out.println("\nCarro mais eficiente: " + entry.getKey()  + ", performance: " + entry.getValue() + "lts");
			}
		}
		
		System.out.println("\nExbibe o menor valor das chaves: " + Collections.min(carrosPopulares.values()));
	
	
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		Double somatoria = 0d;
		while(iterator.hasNext())
		{
			somatoria += iterator.next();
		}
		System.out.println("\nSomatória dos valores: " + somatoria);
		
		
		System.out.println("\nMédia: " + somatoria / carrosPopulares.size());
		
		
		Iterator<Double> iterator2 = carrosPopulares.values().iterator();
		while(iterator2.hasNext())
		{
			// if (iterator2.next().equals(12.9)) iterator2.remove(); 
			if (iterator2.next() < 10) iterator2.remove(); 
		}
		System.out.println("\nRemovendo se menor que 12lts/km: " + carrosPopulares);
		
		
		
		// Usar o LinkedHashMap para manter a ordem de inserção
		Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(){{
			put("Gol",14.4);
			put("Celta",13.8);
			put("Mercedes",13.8);
			put("Volvo",8.2);
			put("Kia",11.1);
		}};
		
		System.out.println("\n"+carrosPopulares2);
		
		
		// Usar o TreeMap para manter a ordem conforme o valor da chave
				Map<String, Double> carrosPopulares3 = new TreeMap<>(){{
					put("Gol",14.4);
					put("Celta",13.8);
					put("Mercedes",13.8);
					put("Volvo",8.2);
					put("Kia",11.1);
				}};
				
				System.out.println("\n"+carrosPopulares3);
				
				
		carrosPopulares.clear(); // apaga todo o dicionário
		System.out.println(carrosPopulares.isEmpty()); // Verifica se está vazio
	}
}
