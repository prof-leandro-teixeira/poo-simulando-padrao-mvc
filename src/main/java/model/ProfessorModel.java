
package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfessorModel {

    private int id;
    private String nome;

    public ProfessorModel(int id, String nome) {
	this.id = id;
	this.nome = nome;
    }

    @Override
    public String toString() {
	return "Id: " + id + " - Nome: " + nome;
    }

}