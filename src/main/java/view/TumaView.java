package view;

import controller.Turma;
import model.Aluno;
import model.Disciplina;
import model.Professor;

public class TumaView {
    public static void main(String[] args) {

	Disciplina d = new Disciplina(1, "Matemática");
	Professor p = new Professor(1, "Leandro Teixeira");
	Aluno a702_01 = new Aluno(01, "João da Silva");
	Aluno a702_02 = new Aluno(02, "Kleber Gonçalves");
	Aluno a702_03 = new Aluno(03, "Marina Eclesiástica");
	Aluno a702_04 = new Aluno(04, "Débora dos Santos");
	Turma a702 = new Turma(702);

	a702.adicionarAluno(a702_01);
	a702.adicionarAluno(a702_02);
	a702.adicionarAluno(a702_03);
	a702.adicionarAluno(a702_04);

	a702.adicionarProfessor(p);
	a702.adicionarDisciplina(d);
	a702.imprimirListaTurma();
    }
}