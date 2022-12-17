package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Pessoa ps = em.find(Pessoa.class, 2);
		
		em.remove(ps);
		
		em.getTransaction().commit();
		
		System.out.println("Pronto! \n"+ps);
		

	}

}
