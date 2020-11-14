package br.com.jcavitreinamentos.dao;

import javax.persistence.EntityManager;

import br.com.jcavitreinamentos.conexao.Conexao;
import br.com.jcavitreinamentos.interfaces.IAlunoDao;
import br.com.jcavitreinamentos.model.Aluno;

public class AlunoDao extends Conexao implements IAlunoDao {

	EntityManager em;

	public AlunoDao() {
		em = this.getEntityManager();
	}

	@Override
	public void inserir(Aluno aluno) throws Exception {

		em.getTransaction().begin();
		em.persist(aluno);
		em.getTransaction().commit();
		em.clear();
		em.close();

	}

	@Override
	public Aluno findAluno(int id) throws Exception {
		Aluno obj = em.find(Aluno.class, id);
		return obj;
	}

	@Override
	public void atualizar(Aluno aluno) throws Exception {
		
		em.getTransaction().begin();
		Aluno c = aluno;
		em.getTransaction().commit();
		em.clear();
		em.close();
		
	}

	@Override
	public void excluir(Aluno aluno) throws Exception {

		em.getTransaction().begin();
		em.remove(aluno);
		em.getTransaction().commit();
		em.close();
		
	}

}
