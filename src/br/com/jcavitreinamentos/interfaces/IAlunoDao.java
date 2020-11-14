package br.com.jcavitreinamentos.interfaces;

import java.util.List;

import br.com.jcavitreinamentos.model.Aluno;

public interface IAlunoDao {
	
	public void inserir(Aluno aluno) throws Exception;
	public Aluno findAluno(int id) throws Exception;
	public void atualizar(Aluno aluno) throws Exception;
	public void excluir(Aluno aluno) throws Exception;
	public List<Aluno> getAlunos() throws Exception;
	
	

}
