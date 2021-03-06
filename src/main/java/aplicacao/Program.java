package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		
		EntityManager em = emf.createEntityManager();
		
		// M?todo find busca por ID
		Pessoa pessoa = em.find(Pessoa.class, 3); 
		
		em.getTransaction().begin();
		
		em.remove(pessoa);
		
		em.getTransaction().commit();
		
		System.out.println(pessoa);
		
		System.out.println("Pronto!");
		
		em.close();
		emf.close();
	}

}
