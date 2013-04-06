package br.com.caelum.agiletickets.persistencia;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class JPAEspetaculoDAOTest {

	private static EntityManagerFactory emf;
	private static EntityTransaction transaction;
	
	@BeforeClass
	public static void before() {
		emf = Persistence.createEntityManagerFactory("teste");
		transaction = emf.createEntityManager().getTransaction();
	}
	
	@AfterClass
	public static void after() {
		transaction.rollback();
	}
	
	
	@Test
	public void testaConsulta() throws Exception {
		
		transaction.begin();
		
	}
	
}
