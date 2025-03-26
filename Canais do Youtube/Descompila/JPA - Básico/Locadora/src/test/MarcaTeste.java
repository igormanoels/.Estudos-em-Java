package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Marca;

public class MarcaTeste {

	public static void main(String[] args) {
		
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("LocadoraPU");
			EntityManager em = emf.createEntityManager();
			
			EntityTransaction et = em.getTransaction();
			et.begin();
			
			System.out.println("Conectado.");
			Marca marca = new Marca();
			marca.setDescricao("Mercedes");
			
			em.persist(marca); // Envia para o banco de dados
			et.commit(); // Faz o commit daquela informação, gravando no banco de dados
			
			
		} catch (Exception e) {
			System.out.println("Erro ao conectar");
		}
		
		
	}
	
}
