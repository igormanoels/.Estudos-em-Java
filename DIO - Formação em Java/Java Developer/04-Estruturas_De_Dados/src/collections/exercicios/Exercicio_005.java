package collections.exercicios;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*	Dada a população estimada de alguns estados do NE brasileiro, faça:
 * 	Estado = PE - População = 9.616.621
 * 	Estado = AL - População = 3.351.543
 * 	Estado = CE - População = 9.187.103
 * 	Estado = RN - População = 3.534.265
 * 	Crie um dicionário e relacione os estados e suas populações;
 *	Substitua a população do estado do RN por 3.534.165;
 *	Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
 *	Exiba a população de PE
 *	Exiba todos os estados e suas populações na ordem que foi informado;
 *	Exiba os estados e suas populações em ordem alfabética;
 *	Exiba o estado com o menor população e sua quantidade;
 *	Exiba o estado com a maior população e sua quantidade;
 *	Exiba a soma da população desses estados;
 *	Exiba a média da população deste dicionário de estados;
 *	Remova os estados com a população menor que 4.000.000;
 *	Apague o dicionário de estados;
 *	Confira se o dicionário está vazio.
 */
public class Exercicio_005 
{
	public static void main(String[] args) 
	{
		Map<String, Integer> populacaoEstados = new LinkedHashMap<>();
		
		populacaoEstados.put("PE", 9616621);
		populacaoEstados.put("AL", 3351543);
		populacaoEstados.put("CE", 9187103);
		populacaoEstados.put("RN", 3534265);
		
		System.out.println("Dicionário Criado: " + populacaoEstados);
		
		
		populacaoEstados.put("RN", 3534165);
		System.out.println("\nPopulação de RN atualizada: " + populacaoEstados);
		
		
		boolean estaPresente = false;
		for (Map.Entry<String, Integer> entry : populacaoEstados.entrySet()) 
		{
			if (entry.getKey().equalsIgnoreCase("PB")) estaPresente = true;
		}
		
		if (estaPresente == false) populacaoEstados.put("PB", 4039277);
		System.out.println("\nVerifica e insere se PB não estiver presente: " + populacaoEstados);
		
		
		System.out.println("\nPopulação de PE: " + populacaoEstados.get("PE"));
		
		
		System.out.println("\nLista de Estados / População");
		for(Map.Entry<String, Integer> entry : populacaoEstados.entrySet())
		{
			System.out.println(entry.getKey() + "  -  " + entry.getValue());
		}
		
		
		Map<String, Integer> populacaoOrdenada = new TreeMap<>(populacaoEstados);
		System.out.println("\n" + populacaoOrdenada);
		
		
		Integer menorPopulacao = Collections.min(populacaoOrdenada.values());
		for(Map.Entry<String, Integer> entry : populacaoOrdenada.entrySet())
		{
			if (entry.getValue() == menorPopulacao) System.out.println("\nMenor população: " + entry.getKey() + ", " + entry.getValue());
		}
		
		
		Integer maiorPopulacao = Collections.max(populacaoOrdenada.values());
		for(Map.Entry<String, Integer> entry : populacaoOrdenada.entrySet())
		{
			if (entry.getValue() == maiorPopulacao) System.out.println("\nMaior população: " + entry.getKey() + ", " + entry.getValue());
		}
		
		
		Integer somatoriaPopulacao = 0;
		for(Map.Entry<String, Integer> entry: populacaoOrdenada.entrySet())
		{
			somatoriaPopulacao += entry.getValue();
		}
		System.out.println("\nSoma das populações: " + somatoriaPopulacao);
		
		System.out.println("\nMédia das populações: " + somatoriaPopulacao / populacaoOrdenada.size());
		
		
		Iterator<Integer> iterator = populacaoOrdenada.values().iterator();
		while (iterator.hasNext()) 
		{
			if (iterator.next() < 4000000) iterator.remove();
		}
		System.out.println("\nPopulação após filtro de 4.000.000: " + populacaoOrdenada);
		
		populacaoOrdenada.clear();
		System.out.println("\nDicionário apagado? " + populacaoOrdenada.isEmpty());
	}
}
