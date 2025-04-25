package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Categoria;

public class CategoriaTeste {

	public static void main(String[] args) {
		Categoria c = new Categoria();
		
		c.setDescricao("Bebidas");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("UsandoHibernate");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
