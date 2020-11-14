package br.com.jcavitreinamentos.dao;

import javax.persistence.EntityManager;

import br.com.jcavitreinamentos.conexao.Conexao;
import br.com.jcavitreinamentos.interfaces.ICursoDao;
import br.com.jcavitreinamentos.model.Curso;

public class CursoDao extends Conexao implements ICursoDao {

	EntityManager em;

	public CursoDao() {
		em = this.getEntityManager();
	}

	@Override
	public void inserir(Curso curso) throws Exception {

		em.getTransaction().begin();
		em.persist(curso);
		em.getTransaction().commit();
		em.clear();
		em.close();

	}

}
