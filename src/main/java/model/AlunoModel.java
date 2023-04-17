package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlunoModel {

    private int id;
    private String nome;

    public AlunoModel(int id, String nome) {
	this.id = id;
	this.nome = nome;
    }

    @Override
    public String toString() {
	return id + " - " + nome;
    }

}