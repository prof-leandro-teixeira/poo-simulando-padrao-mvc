package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aula {

    private int codigo;
    private Date horario;
    private List<Turma> listaTurmas;

    public Aula(int codigo, Date horario) {
	this.listaTurmas = new ArrayList<Turma>();
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
    public List<Turma> getTurmas() {
	return listaTurmas;
    }
    public void setTurmas(List<Turma> turmas) {
	this.listaTurmas = turmas;
    }
    public void adicionarTurma(Turma turma) {
	listaTurmas.add(turma);
    }
    public void removerProfessorTurma(Turma turma) {
	listaTurmas.remove(turma);
    }

    public void imprimirListaAula() {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	System.out.println("Relação de aulas em :" + sdf.format(horario));
	for (Turma turma : listaTurmas) {
	    System.out.println("Turma: " + turma.getId());
	    System.out.println("Professor: " + turma.getListaProfessores());
	    System.out.println("Lista de chamada: " + turma.getListaAlunos().toString());
	}
    }
}