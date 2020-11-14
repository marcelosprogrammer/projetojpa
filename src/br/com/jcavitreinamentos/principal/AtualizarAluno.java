package br.com.jcavitreinamentos.principal;

import br.com.jcavitreinamentos.dao.AlunoDao;
import br.com.jcavitreinamentos.model.Aluno;

public class AtualizarAluno {

	public static void main(String[] args) throws Exception {

		AlunoDao obj = new AlunoDao();
		Aluno aluno = obj.findAluno(2);
		aluno.setMensalidade(3333.33);
		obj.atualizar(aluno);

	}

}
