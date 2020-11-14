package br.com.jcavitreinamentos.dao;

import javax.persistence.EntityManager;

import br.com.jcavitreinamentos.conexao.Conexao;
import br.com.jcavitreinamentos.interfaces.IAlunoDao;
import br.com.jcavitreinamentos.interfaces.ITurmaDao;
import br.com.jcavitreinamentos.model.Aluno;
import br.com.jcavitreinamentos.model.Turma;

public class TurmaDao extends Conexao implements ITurmaDao {

	EntityManager em;

	public TurmaDao() {
		em = this.getEntityManager();
	}

	@Override
	public void inserir(Turma turma) throws Exception {

		em.getTransaction().begin();
		em.persist(turma);
		em.getTransaction().commit();
		em.clear();
		em.close();

	}

}
