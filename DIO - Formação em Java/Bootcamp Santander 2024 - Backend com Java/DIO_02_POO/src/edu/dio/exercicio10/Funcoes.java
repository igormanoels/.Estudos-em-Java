package edu.dio.exercicio10;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Funcoes {
	/* Criei uma classe para facilitar e reutilizar os códigos, 
	 * mas preferi fazer um exercício por vez para treinar o uso do Stream API
	 */
	public static List<Integer> verificaNumerosPares(List<Integer> numeros)
	{
		Function<Integer, Integer> numeroPar = num -> {
            int res = 0;
            if (num % 2 == 0) {
                res += num;
            }
            return res;
        };

        // Cria uma lista com os números pares
        List<Integer> resultados = numeros.stream()
                                          .map(numeroPar)
                                          .filter(n -> n > 0)
                                          .collect(Collectors.toList());
		return resultados;
	}

}
