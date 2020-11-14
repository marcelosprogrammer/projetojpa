package br.com.jcavitreinamentos.principal;

import br.com.jcavitreinamentos.dao.AlunoDao;
import br.com.jcavitreinamentos.model.Aluno;

public class ExcluirAluno {

	public static void main(String[] args) throws Exception {

		AlunoDao obj = new AlunoDao();
		Aluno aluno = obj.findAluno(3);
		obj.excluir(aluno);

	}

}
