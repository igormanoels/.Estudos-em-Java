package edu.dio.desafio07.POO;

import edu.dio.desafio07.POO.dominio.Bootcamp;
import edu.dio.desafio07.POO.dominio.Curso;
import edu.dio.desafio07.POO.dominio.Dev;
import edu.dio.desafio07.POO.dominio.Mentoria;

public class Main 
{
	public static void main(String[] args) 
	{
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		Mentoria mentoria = new Mentoria();
		
		curso1.setTitulo("Primeiro curso");
		curso1.setDescricao("Curso de Java: Introductions.");
		curso1.setCargaHoraria(40);
		
		curso2.setTitulo("Segundo curso");
		curso2.setDescricao("Curso de Java: POO.");
		curso2.setCargaHoraria(65);
		
		mentoria.setTitulo("Mentoria");
		mentoria.setDescricao("Curso de Java: Devendando a carreira.");
		
		Bootcamp bc = new Bootcamp();
		
		bc.setNome("Bootcamp Java");
		bc.setDescricao("Trilha de Java");
		bc.getConteudos().add(curso1);
		bc.getConteudos().add(curso2);
		bc.getConteudos().add(mentoria);
		
		Dev dev1 = new Dev();
		dev1.setNome("Igor");
		dev1.inscreverBootcamp(bc);
		System.out.println(dev1.getNome() + " - Conteúdos inscritos: "  + dev1.getStatusAtual() + "/" + dev1.getStatus() + ": "  +  dev1.getConteudosInscritos() + "\n");
		dev1.progredir();
		System.err.println("Atualização do aluno: " + dev1.getNome() + " ---> XP: " + dev1.calcularXP() + " - Status: " + dev1.getStatusAtual() + "/" + dev1.getStatus());
		System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos() + "\n");
		System.out.println("Conteúdos concluídos: " + dev1.getConteudosConcluidos() + "\n");

		System.out.println("\n##########################################################################################################\n\n");
		
		Dev dev2 = new Dev();
		dev2.setNome("Rose");
		dev2.inscreverBootcamp(bc);
		System.out.println(dev2.getNome() + " - Conteúdos inscritos " + dev2.getStatusAtual() + "/" + dev2.getStatus() + ": "  + dev2.getConteudosInscritos() + "\n");
		dev2.progredir();
		dev2.progredir();
		System.err.println("Atualização do aluno: " + dev2.getNome() + " ---> XP: " + dev2.calcularXP() + " - Status: " + dev2.getStatusAtual() + "/" + dev2.getStatus());
		System.out.println("Conteúdos inscritos: " + dev2.getConteudosInscritos() + "\n");
		System.out.println("Conteúdos concluídos: " + dev2.getConteudosConcluidos() + "\n");
		
		System.out.println("\n##########################################################################################################\n\n");
		
		
		

		
		
	}
}
