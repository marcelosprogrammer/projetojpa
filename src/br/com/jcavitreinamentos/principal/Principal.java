package br.com.jcavitreinamentos.principal;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.com.jcavitreinamentos.dao.AlunoDao;
import br.com.jcavitreinamentos.dao.CursoDao;
import br.com.jcavitreinamentos.dao.ProfessorDao;
import br.com.jcavitreinamentos.dao.TurmaDao;
import br.com.jcavitreinamentos.model.Aluno;
import br.com.jcavitreinamentos.model.Curso;
import br.com.jcavitreinamentos.model.Professor;
import br.com.jcavitreinamentos.model.Turma;

public class Principal {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// criando os professores ::::::
		Professor prof1 = new Professor();
		prof1.setNome("Lurdinha");
		prof1.setDataNascimento(new Date(120, 11, 14));

		Professor prof2 = new Professor();
		prof2.setNome("Maria Pera");
		prof2.setDataNascimento(new Date(120, 11, 14));

		ProfessorDao profDao = new ProfessorDao();
		profDao.inserir(prof1);
		profDao.inserir(prof2);

		List<Professor> listaP = new ArrayList<>();
		listaP.add(prof1);
		listaP.add(prof2);

		Set<Professor> profs = new HashSet();
		profs.add(prof1);
		profs.add(prof2);

		// criando a turma :::::::

		Turma turma = new Turma();
		turma.setNome("Computação");
		turma.setProfessores(listaP);
		TurmaDao tuDao = new TurmaDao();

		try {
			tuDao.inserir(turma);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// criando os alunos ::::

		Aluno aluno = new Aluno();
		aluno.setNome("Carla");
		aluno.setDataNascimento(new Date());
		aluno.setMensalidade(100.0);
		aluno.setTurma(turma);

		AlunoDao aluDao = new AlunoDao();
		try {
			aluDao.inserir(aluno);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// criando os cursos e inserindo os professores ::::::

		Curso curso = new Curso();
		curso.setNome("Estudos 2020");
		curso.setProfessores(profs);

		CursoDao curDao = new CursoDao();
		curDao.inserir(curso);
		
		
		
		TurmaDao.fecharFabrica(); // fechando a conexão...

	}

}
