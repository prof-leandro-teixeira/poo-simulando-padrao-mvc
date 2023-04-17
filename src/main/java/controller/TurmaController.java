package controller;

import java.util.ArrayList;
import java.util.List;

import model.AlunoModel;
import model.DisciplinaModel;
import model.ProfessorModel;

public class TurmaController {

    private int id;
    private List<DisciplinaModel> listaDisciplinas;
    private List<ProfessorModel> listaProfessores;
    private List<AlunoModel> listaAlunos;

    public TurmaController(int id) {
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

    public List<DisciplinaModel> getListaDisciplinas() {
	return listaDisciplinas;
    }

    public void setListaDisciplinas(List<DisciplinaModel> listaDisciplinas) {
	this.listaDisciplinas = listaDisciplinas;
    }

    public List<ProfessorModel> getListaProfessores() {
	return listaProfessores;
    }

    public void setListaProfessores(List<ProfessorModel> listaProfessores) {
	this.listaProfessores = listaProfessores;
    }

    public List<AlunoModel> getListaAlunos() {
	return listaAlunos;
    }

    public void setListaAlunos(List<AlunoModel> listaAlunos) {
	this.listaAlunos = listaAlunos;
    }

    public void adicionarAluno(AlunoModel alunoModel) {
	listaAlunos.add(alunoModel);
    }

    public void removerAluno(AlunoModel alunoModel) {
	listaAlunos.remove(alunoModel);
    }

    public void adicionarDisciplina(DisciplinaModel disciplinaModel) {
	listaDisciplinas.add(disciplinaModel);
    }

    public void removerDisciplina(DisciplinaModel disciplinaModel) {
	listaDisciplinas.remove(disciplinaModel);
    }

    public void adicionarProfessor(ProfessorModel professorModel) {
	listaProfessores.add(professorModel);
    }

    public void removerProfessor(ProfessorModel professorModel) {
	listaProfessores.add(professorModel);
    }

    public void imprimirListaTurma() {
	System.out.println("Turma: " + TurmaController.this.id);

	for (DisciplinaModel DisciplinaModel : listaDisciplinas) {
	    System.out.println("Disciplina: " + DisciplinaModel.getNome());
	}
	for (ProfessorModel ProfessorModel : listaProfessores) {
	    System.out.println("Professor: " + ProfessorModel.getNome());
	}
	System.out.println("Lista de presença:");
	for (AlunoModel AlunoModel : listaAlunos) {
	    System.out.println(AlunoModel.toString());
	}
    }
}