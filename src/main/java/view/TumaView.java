package view;

import controller.TurmaController;
import model.AlunoModel;
import model.DisciplinaModel;
import model.ProfessorModel;

public class TumaView {
    public static void main(String[] args) {

	DisciplinaModel d = new DisciplinaModel(1, "Matemática");
	ProfessorModel p = new ProfessorModel(1, "Leandro Teixeira");
	AlunoModel a702_01 = new AlunoModel(01, "João da Silva");
	AlunoModel a702_02 = new AlunoModel(02, "Kleber Gonçalves");
	AlunoModel a702_03 = new AlunoModel(03, "Marina Eclesiástica");
	AlunoModel a702_04 = new AlunoModel(04, "Débora dos Santos");
	TurmaController a702 = new TurmaController(702);

	a702.adicionarAluno(a702_01);
	a702.adicionarAluno(a702_02);
	a702.adicionarAluno(a702_03);
	a702.adicionarAluno(a702_04);

	a702.adicionarProfessor(p);
	a702.adicionarDisciplina(d);
	a702.imprimirListaTurma();
    }
}