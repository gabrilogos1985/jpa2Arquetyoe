package gps.jpa.example1;

import gps.jpa.example1.model.Personnel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaRunner {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("it.pkg");
		EntityManager em = emf.createEntityManager();

		Personnel person = new Personnel();
		person.setLogin("pepito");
		person.setName("Jose Sanchez");
		person.setPassword("something");
		em.getTransaction().begin();;
	    em.persist(person);
	    em.getTransaction().commit();
		System.out.println("Persona id: " + person.get_Id());
		System.out.println("LIST " + em.createNativeQuery("select * from Users").getResultList());
		Personnel personaFind = em.find(Personnel.class, person.get_Id());
		System.out.println("Persona find: " + personaFind.getName());
		em.close();
		emf.close();
	}
}
