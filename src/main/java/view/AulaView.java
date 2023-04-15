package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import controller.Aula;
import controller.Turma;
import model.Aluno;
import model.Disciplina;
import model.Professor;

public class AulaView {
    public static void main(String[] args) throws ParseException {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	Date data = sdf.parse("10/10/2022 07:10");

	Disciplina d1 = new Disciplina(1, "Matemática");
	Professor p1 = new Professor(1, "Leandro Teixeira");
	Aluno a901_01 = new Aluno(01, "João da Silva");
	Aluno a901_02 = new Aluno(02, "Kleber Gonçalves");
	Aluno a901_03 = new Aluno(03, "Marina Eclesiástica");
	Aluno a901_04 = new Aluno(04, "Débora dos Santos");
	Turma a901 = new Turma(901);
	a901.adicionarAluno(a901_01);
	a901.adicionarAluno(a901_02);
	a901.adicionarAluno(a901_03);
	a901.adicionarAluno(a901_04);
	a901.adicionarProfessor(p1);
	a901.adicionarDisciplina(d1);
	Aula a = new Aula(1, data);

	Disciplina d2 = new Disciplina(2, "Portugês");
	Professor p2 = new Professor(1, "Ferreira Teixeira");
	Aluno a702_01 = new Aluno(01, "Liu Lau");
	Aluno a702_02 = new Aluno(02, "John new");
	Aluno a702_03 = new Aluno(03, "Atributos dos Santos");
	Aluno a702_04 = new Aluno(04, "Campos em branco");
	Turma a702 = new Turma(702);
	a702.adicionarAluno(a702_01);
	a702.adicionarAluno(a702_02);
	a702.adicionarAluno(a702_03);
	a702.adicionarAluno(a702_04);
	a702.adicionarProfessor(p2);
	a702.adicionarDisciplina(d2);
	Aula b = new Aula(2, data);

	a.adicionarTurma(a702);
	a.adicionarTurma(a901);
	a.imprimirListaAula();
    }
}