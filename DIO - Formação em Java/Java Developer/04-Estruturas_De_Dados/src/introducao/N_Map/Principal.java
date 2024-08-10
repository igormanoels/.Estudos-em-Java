package projetos.N_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal 
{
	public static void main(String[] args) 
	{
		Map<String, String> aluno = new HashMap<>();
		
		aluno.put("nome","Igor Manoel");
		aluno.put("idade","29");
		aluno.put("media","6.2");
		aluno.put("turma","ads");
		
		System.out.println(aluno); // retorna conteúdo e chave
		System.out.println(aluno.keySet()); // retorna as chaves
		
		List<Map<String, String>> alunos = new ArrayList<>();
		
		alunos.add(aluno);
		System.out.println(alunos);
		
		Map<String, String> aluno2 = new HashMap<>();
		
		aluno2.put("nome","Bianca");
		aluno2.put("idade","19");
		aluno2.put("media","8.2");
		aluno2.put("turma","ads");
		
		alunos.add(aluno2);

		System.out.println("\n\n"+alunos);

		
		System.out.println(alunos.get(1));
	}
}
