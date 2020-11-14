package br.com.jcavitreinamentos.conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {

	private static final EntityManagerFactory fabrica;
	private static final String PERSISTENCE_UNIT_NAME = "projetojpa";

	static {
		fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}

	public static EntityManager getEntityManager() {
		EntityManager em = fabrica.createEntityManager();
		return em;
	}

	public static void  fecharFabrica() {
		fabrica.close();
	}
	
}
