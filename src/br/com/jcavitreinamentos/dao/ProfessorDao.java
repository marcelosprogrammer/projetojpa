package br.com.jcavitreinamentos.dao;

import javax.persistence.EntityManager;

import br.com.jcavitreinamentos.conexao.Conexao;
import br.com.jcavitreinamentos.interfaces.IProfessorDao;
import br.com.jcavitreinamentos.model.Professor;

public class ProfessorDao extends Conexao implements IProfessorDao {

	EntityManager em;

	public ProfessorDao() {
		em = this.getEntityManager();
	}

	@Override
	public void inserir(Professor professor) throws Exception {

		em.getTransaction().begin();
		em.persist(professor);
		em.getTransaction().commit();

	}

}
