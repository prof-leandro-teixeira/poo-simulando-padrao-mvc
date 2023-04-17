package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DisciplinaModel {

    private int id;
    private String nome;

    public DisciplinaModel(int id, String nome) {
	this.id = id;
	this.nome = nome;
    }


    @Override
    public String toString() {
	return "Id: " + id + " - Nome: " + nome;
    }

}
