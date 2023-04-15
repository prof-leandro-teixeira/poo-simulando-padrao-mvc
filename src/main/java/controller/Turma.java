package controller;

import java.util.ArrayList;
import java.util.List;

import model.Aluno;
import model.Disciplina;
import model.Professor;

public class Turma {
    
    private int id;
    private List<Disciplina> listaDisciplinas;
    private List<Professor> listaProfessores;
    private List<Aluno> listaAlunos;

    public Turma(int id) {
	this.listaAlunos = new ArrayList<>();
	this.listaDisciplinas = new ArrayList<>();
	this.listaProfessores = new ArrayList<>();
	this.id = id;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public List<Disciplina> getListaDisciplinas() {
	return listaDisciplinas;
    }

    public void setListaDisciplinas(List<Disciplina> listaDisciplinas) {
	this.listaDisciplinas = listaDisciplinas;
    }

    public List<Professor> getListaProfessores() {
	return listaProfessores;
    }

    public void setListaProfessores(List<Professor> listaProfessores) {
	this.listaProfessores = listaProfessores;
    }

    public List<Aluno> getListaAlunos() {
	return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
	this.listaAlunos = listaAlunos;
    }

    public void adicionarAluno(Aluno aluno) {
	listaAlunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
	listaAlunos.remove(aluno);
    }

    public void adicionarDisciplina(Disciplina disciplina) {
	listaDisciplinas.add(disciplina);
    }

    public void removerDisciplina(Disciplina disciplina) {
	listaDisciplinas.remove(disciplina);
    }

    public void adicionarProfessor(Professor professor) {
	listaProfessores.add(professor);
    }

    public void removerProfessor(Professor professor) {
	listaProfessores.add(professor);
    }

    public void imprimirListaTurma() {
	System.out.println("Turma: " + Turma.this.id);

	for (Disciplina Disciplina : listaDisciplinas) {
	    System.out.println("Disciplina: " + Disciplina.getNome());
	}
	for (Professor Professor : listaProfessores) {
	    System.out.println("Professor: " + Professor.getNome());
	}
	System.out.println("Lista de presença:");
	for (Aluno Aluno : listaAlunos) {
	    System.out.println(Aluno.toString());
	}
    }
}