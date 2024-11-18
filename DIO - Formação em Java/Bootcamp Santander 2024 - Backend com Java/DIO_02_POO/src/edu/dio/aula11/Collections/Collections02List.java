package edu.dio.aula11.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Collections02List 
{		
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		List<String> alunos = new ArrayList<>();
		
		//Adcionando nomes a lista
		alunos.add("Alex");
		alunos.add("Tanya");
		alunos.add("Veloxy");
		alunos.add("Alex");
		alunos.add("Andrew");
		
		System.out.println("Comprimento do ArrayList: " + alunos.size());

		
		System.out.println("\n\nUsando Iterator");
		// Usando Iterator
		for (Iterator<String> iterator = alunos.iterator(); iterator.hasNext();) 
		{
			String string = (String) iterator.next();
			System.out.println(string);
		}

		
		System.out.println("\n\nUsando for");		
		// Usando for
		for (int i = 0; i < alunos.size(); i++) 
		{
			System.out.println(alunos.get(i));
		}


		System.out.println("\n\nUsando foreach");
		// usando foreach
		for (String string : alunos) {
			System.out.println(string);
		}
		
	
		System.out.println("\n\n\n"+alunos);
		ler.close();		
	}

}
