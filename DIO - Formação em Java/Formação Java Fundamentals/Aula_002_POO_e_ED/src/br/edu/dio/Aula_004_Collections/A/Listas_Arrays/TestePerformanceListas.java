package br.edu.dio.Aula_004_Collections.A.Listas_Arrays;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

public class TestePerformanceListas {

	public static void main(String[] args) {
		
		var arrayStart = OffsetDateTime.now();
		List<Integer> lista = new ArrayList<>();
		for (int i = 0; i < 100_000_000 ; i++) {
			lista.add(i);
		}
		System.out.println(Duration.between(arrayStart, OffsetDateTime.now()).toMillis());
	
		
		var vectorStart = OffsetDateTime.now();
		List<Integer> vetor = new ArrayList<>();
		for (int i = 0; i < 100_000_000 ; i++) {
			vetor.add(i);
		}
		System.out.println(Duration.between(vectorStart, OffsetDateTime.now()).toMillis());

		
		var linkedStart = OffsetDateTime.now();
		List<Integer> listaLk= new ArrayList<>();
		for (int i = 0; i < 100_000_000 ; i++) {
			listaLk.add(i);
		}
		System.out.println(Duration.between(linkedStart, OffsetDateTime.now()).toMillis());
		
	}
}
