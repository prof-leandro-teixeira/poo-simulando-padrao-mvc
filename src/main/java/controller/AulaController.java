package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AulaController {

    private int codigo;
    private Date horario;
    private List<TurmaController> listaTurmas;

    public AulaController(int codigo, Date horario) {
	this.listaTurmas = new ArrayList<TurmaController>();
	this.codigo = codigo;
	this.horario = horario;
    }

    public int getCodigo() {
	return codigo;
    }

    public void setCodigo(int codigo) {
	this.codigo = codigo;
    }

    public Date gethorario() {
	return horario;
    }

    public void sethorario(Date horario) {
	this.horario = horario;
    }

    public List<TurmaController> getTurmas() {
	return listaTurmas;
    }

    public void setTurmas(List<TurmaController> turmaControllers) {
	this.listaTurmas = turmaControllers;
    }

    public void adicionarTurma(TurmaController turmaController) {
	listaTurmas.add(turmaController);
    }

    public void removerProfessorTurma(TurmaController turmaController) {
	listaTurmas.remove(turmaController);
    }

    public void imprimirListaAula() {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	System.out.println("Relação de aulas em :" + sdf.format(horario));
	for (TurmaController turmaController : listaTurmas) {
	    System.out.println("Turma: " + turmaController.getId());
	    System.out.println("Professor: " + turmaController.getListaProfessores());
	    System.out.println("Lista de chamada: " + turmaController.getListaAlunos().toString());
	}
    }
}