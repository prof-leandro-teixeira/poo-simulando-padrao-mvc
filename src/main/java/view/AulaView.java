package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import controller.AulaController;
import controller.TurmaController;
import model.AlunoModel;
import model.DisciplinaModel;
import model.ProfessorModel;

public class AulaView {
    public static void main(String[] args) throws ParseException {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	Date data = sdf.parse("10/10/2022 07:10");

	DisciplinaModel d1 = new DisciplinaModel(1, "Matemática");
	ProfessorModel p1 = new ProfessorModel(1, "Leandro Teixeira");
	AlunoModel a901_01 = new AlunoModel(01, "João da Silva");
	AlunoModel a901_02 = new AlunoModel(02, "Kleber Gonçalves");
	AlunoModel a901_03 = new AlunoModel(03, "Marina Eclesiástica");
	AlunoModel a901_04 = new AlunoModel(04, "Débora dos Santos");
	TurmaController a901 = new TurmaController(901);
	a901.adicionarAluno(a901_01);
	a901.adicionarAluno(a901_02);
	a901.adicionarAluno(a901_03);
	a901.adicionarAluno(a901_04);
	a901.adicionarProfessor(p1);
	a901.adicionarDisciplina(d1);
	AulaController a = new AulaController(1, data);

	DisciplinaModel d2 = new DisciplinaModel(2, "Portugês");
	ProfessorModel p2 = new ProfessorModel(1, "Ferreira Teixeira");
	AlunoModel a702_01 = new AlunoModel(01, "Liu Lau");
	AlunoModel a702_02 = new AlunoModel(02, "John new");
	AlunoModel a702_03 = new AlunoModel(03, "Atributos dos Santos");
	AlunoModel a702_04 = new AlunoModel(04, "Campos em branco");
	TurmaController a702 = new TurmaController(702);
	a702.adicionarAluno(a702_01);
	a702.adicionarAluno(a702_02);
	a702.adicionarAluno(a702_03);
	a702.adicionarAluno(a702_04);
	a702.adicionarProfessor(p2);
	a702.adicionarDisciplina(d2);
	AulaController b = new AulaController(2, data);

	a.adicionarTurma(a702);
	a.adicionarTurma(a901);
	a.imprimirListaAula();
    }
}