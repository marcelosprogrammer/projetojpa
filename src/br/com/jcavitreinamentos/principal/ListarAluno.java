package br.com.jcavitreinamentos.principal;

import java.util.ArrayList;
import java.util.List;

import br.com.jcavitreinamentos.dao.AlunoDao;
import br.com.jcavitreinamentos.model.Aluno;

public class ListarAluno {

	public static void main(String[] args) throws Exception {

		AlunoDao obj = new AlunoDao();
		List<Aluno> l = new ArrayList();
		l = obj.getAlunos();
		for (Aluno b : l) {
			System.out.println(b);
		}

	}

}
