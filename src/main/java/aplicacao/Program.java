package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(null, "Calebe Rodrigues", "calebe@gmail.com");
		Pessoa p2 = new Pessoa(null, "Carlos da Silva", "calos@gmail.com");
		Pessoa p3 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		
		EntityManager em = emf.createEntityManager();
		
		// JPA precisa de uma transação ao fazer uma operação != select
		em.getTransaction().begin();
		
		// Método persist salva no banco de dados
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		// Confirma as operações
		em.getTransaction().commit();
		
		
		System.out.println("Pronto!");
	}

}
