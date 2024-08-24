package exercicio;

import java.util.ArrayList;
import java.util.List;

/*
 * Ex03 - Estouro da memória Heap
 * Instruções: Faça um código em Java para estourar a memória Heap. Você saberá que o programa 
 * foi bem sucedido quando ocorrer um erro de Out of Memory - Java Heap Error, ou algo parecido.
 */
public class Exercicio003 
{
	public static void main(String[] args) 
	{
        List<int[]> bomba = new ArrayList<>();
        
        // Loop infinito
        while (true) 
        {
        	// aqui estou colocando na lista, um int array grande
            bomba.add(new int[1000000]); 
        }
        
        /* 	
         * Erro obtido: Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
         * at exercicio.Exercicio003.main(Exercicio003.java:18)
         */
    }
}
